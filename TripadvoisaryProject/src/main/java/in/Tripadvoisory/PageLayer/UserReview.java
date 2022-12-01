package in.Tripadvoisory.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import in.Tripadvoisory.TestBase.TestBase;
import in.Tripadvoisory.Utility.UtilityClass;

public class UserReview extends TestBase {
public UserReview()
{
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="(//label[@class='_S'])[1]")
private WebElement rating_1;
@FindBy(xpath="(//label[@class='_S'])[2]")
private WebElement rating_2;
@FindBy(xpath="(//label[@class='_S'])[3]")
private WebElement rating_3;
@FindBy(xpath="(//label[@class='_S'])[4]")
private WebElement rating_4;
@FindBy(xpath="(//label[@class='_S'])[5]")
private WebElement rating_5;
@FindBy(xpath="//button[@class='OKHdJ z Pc PQ Pp PD W _S Gn Z B2 BF _M PQFNM wSSLS']")
private WebElement month_year_selection;
@FindBy(xpath="//span[text()='August 2022']")
private WebElement Month_select;
@FindBy(xpath="//span[contains(text(),'Family (teens)')]")
private WebElement go_with;
@FindBy(xpath="//textarea[@id='review-text']")
private WebElement write_review;
@FindBy(xpath="//input[@id='review-title']")
private WebElement title_review;
@FindBy(xpath="//div[contains(text(),'Click to add photos')]")
private WebElement add_photo;
@FindBy(xpath="//span[contains(text(),'Submit review')]")
private WebElement submit_btn;
public void mouseHoverUptoRating4()
{
	UtilityClass.mouseHover(driver, rating_1);
	UtilityClass.mouseHover(driver, rating_2);
	UtilityClass.mouseHover(driver, rating_3);
	UtilityClass.mouseHover(driver, rating_4);
	
}
public void clickOnRating5()
{
	rating_5.click();
}
public void selectMonth()
{
	month_year_selection.click();
	Month_select.click();
}
public void selectGoWithoption()
{
	go_with.click();
}
public void writeReview()
{
	write_review.sendKeys("Great service and provides great information about coffee plants and other plantations inside the resort. Great resort and support by MR Ratan Haldar live guard and happy hub staff .\r\n"
			+ "Great room staff members");
}
public void writeTitle()
{
	title_review.sendKeys("service");
}
public void clickOnSubmitButton()
{
	submit_btn.click();
}
}
