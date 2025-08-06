package books;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import genericutility.BaseClass;
import genericutility.ListenerUtility;
import objectrepository.HomePage;

@Listeners(ListenerUtility.class)
public class TC_DWS_001_TEST extends BaseClass{
	@Test
	public void clickOnBooks() {
		HomePage hp =new HomePage(driver);
		hp.getBookLink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Books", "Book page is not displayed");
		test.log(Status.PASS, "Book Page is displayed");
		
	}

}
