package in.Tripadvoisory.TestBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;



import io.github.bonigarcia.wdm.WebDriverManager;
public class TestBase {
	public static WebDriver driver;
	public static Logger logger;
		@BeforeClass
		public void start()
		{
			logger=Logger.getLogger("Framework Tripadvoisary script");
			PropertyConfigurator.configure("Log4j.properties");
			logger.info("before class");
		}
		@AfterClass
		public void end()
		{
			logger.info("after class");
		}
@Parameters("Browser")
@BeforeMethod
public void setup(String browser)
	{
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
		    driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
		    driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Please provide proper browser");
		}
		driver.get("https://www.tripadvisor.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	}


