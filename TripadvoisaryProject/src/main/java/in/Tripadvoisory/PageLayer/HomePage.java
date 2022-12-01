package in.Tripadvoisory.PageLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import in.Tripadvoisory.TestBase.TestBase;
import in.Tripadvoisory.Utility.UtilityClass;

public class HomePage extends TestBase {
public HomePage()
{
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="(//input[@class='qjfqs _G B- z _J Cj R0'])[2]")
private WebElement searchbox_txt;
//.......................................................
public void enterTextInSearchBox(String text)
{  
	 UtilityClass.waitProvide( searchbox_txt);
	searchbox_txt.sendKeys(text+Keys.ENTER);
}
}
