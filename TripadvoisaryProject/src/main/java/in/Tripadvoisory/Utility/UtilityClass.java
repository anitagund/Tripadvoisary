package in.Tripadvoisory.Utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import in.Tripadvoisory.TestBase.TestBase;
//.....................scrolling......................................
public class UtilityClass extends TestBase {
public static String child_window1;
public static void scrollDown(String coordinates)
{
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeAsyncScript(coordinates);
}
public static void moveTOElement(WebDriver driver,WebElement element)
{
	Actions act=new Actions(driver);
	act.moveToElement(element).click().build().perform();			
}
//................mousehover........................
public static void mouseHover(WebDriver driver,WebElement element)
{
	Actions act=new Actions(driver);
	act.moveToElement(element);		
}
//....................mouseScroll....................................
public static void mouseScrollBy(WebDriver driver,WebElement element,WebElement element1)
{
	Actions act=new Actions(driver);
	act.moveToElement(element).scrollToElement(element1).click().build().perform();
}
//......................Screen shot.........................................
public static void takesScreenshot(String filename) throws IOException
{String path="D:\\velocity\\TripadvoisorScript\\test-output\\ScreenShot\\";
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File des=new File(path+filename+".png");
	FileHandler.copy(src, des);
}
//.......................window handle...............................
public static void windowHandle()
{
	Set<String> window_handles = driver.getWindowHandles();
	Iterator<String> split_windows = window_handles.iterator();
	String parent_window = split_windows.next();
	String child_window1 = split_windows.next();
	
	boolean b=split_windows.hasNext();
	if(b)
	{
		String child_window2 = split_windows.next();
		driver.switchTo().window(child_window2);
	}
	else
	{
		driver.switchTo().window(child_window1);
	}
}
public static void switchTOPArentWindow()
{
	driver.switchTo().window(child_window1);
}

//................wait...........................
public static void waitProvide(WebElement element)
{
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.elementToBeClickable(element));
			
}
}





