package in.Tripadvoisory.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import in.Tripadvoisory.TestBase.TestBase;
import in.Tripadvoisory.Utility.UtilityClass;

public class ClubMahindraMadikeriPage extends TestBase {
public ClubMahindraMadikeriPage()
{
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[contains(text(),'Write a review')]")
private WebElement write_your_review;
@FindBy(xpath="//div[@class='XZzcc Vb PP']")
private WebElement review_btn;
//......................................................
public void clickOnWriteYourReview()
{
	UtilityClass.waitProvide(write_your_review);
	write_your_review.click();
}
public void clickOnReviewButton()
{
	review_btn.click();
}
}
