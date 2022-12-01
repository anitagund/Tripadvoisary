package in.Testadvoisary.TestLayer;

import org.testng.annotations.Test;

import in.Tripadvoisory.PageLayer.ClubMahindraMadikeriPage;
import in.Tripadvoisory.PageLayer.HomePage;
import in.Tripadvoisory.PageLayer.ResultsPage;
import in.Tripadvoisory.PageLayer.UserReview;
import in.Tripadvoisory.TestBase.TestBase;
import in.Tripadvoisory.Utility.UtilityClass;

public class ReviewSubmitTest extends TestBase{
@Test
public void verifyReviewSumbission() throws InterruptedException
{
	HomePage home=new HomePage();
	ResultsPage result=new ResultsPage();
	ClubMahindraMadikeriPage cm=new ClubMahindraMadikeriPage();
	UserReview review=new UserReview();
//..............................................
//	UtilityClass.scrollDown("window.scrollBy(0,200)");
	home.enterTextInSearchBox("Club Mahindra");
	Thread.sleep(3000);
//	UtilityClass.scrollDown("window.scrollBy(0,200)");
	result.clickOnOption();
	UtilityClass.windowHandle();
	Thread.sleep(2000);
//	UtilityClass.scrollDown("window.scrollBy(0,3450)");
	cm.clickOnWriteYourReview();
	UtilityClass.windowHandle();
	Thread.sleep(4000);
	review.mouseHoverUptoRating4();
	review.clickOnRating5();
	review.selectMonth();
	review.selectGoWithoption();
	review.writeReview();review.mouseHoverUptoRating4();
	review.clickOnRating5();
	review.selectMonth();
	review.selectGoWithoption();
	review.writeReview();
	review.writeTitle();
	review.clickOnSubmitButton();
	review.writeTitle();
	review.clickOnSubmitButton();
	UtilityClass.switchTOPArentWindow();
	cm.clickOnReviewButton();
	review.mouseHoverUptoRating4();
	review.clickOnRating5();
	review.selectMonth();
	review.selectGoWithoption();
	review.writeReview();
	review.writeTitle();
	review.clickOnSubmitButton();
	
}

}
