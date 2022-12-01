package in.Tripadvoisory.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import in.Tripadvoisory.TestBase.TestBase;
import in.Tripadvoisory.Utility.UtilityClass;

public class ResultsPage extends TestBase{
public ResultsPage()
{
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//span[contains(text(),'Club Mahindra Madikeri, Coorg')]")
public WebElement option;
//......................................

public void clickOnOption()
{   
	UtilityClass.waitProvide(option);
	option.click();
}
}
