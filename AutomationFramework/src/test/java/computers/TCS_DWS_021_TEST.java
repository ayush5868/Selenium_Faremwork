package computers;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import genericutility.BaseClass;
import genericutility.ListenerUtility;
import genericutility.WebDriverUtility;
import objectrepository.HomePage;


/**
 * @author AYUSH KUMAR
 */

@Listeners(ListenerUtility.class)
public class TCS_DWS_021_TEST extends BaseClass{
	
	@Test
	public void clickOnComputer() throws IOException {
		HomePage hp  = new HomePage(driver);
		wutil.maximize(driver);
		hp.getComputerLink().click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Computers", "Computer page is not displayed");
		test.log(Status.PASS, "Computer page is displayed");
	}


}
