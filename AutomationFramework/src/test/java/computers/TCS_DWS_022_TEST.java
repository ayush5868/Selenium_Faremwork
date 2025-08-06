package computers;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericutility.BaseClass;
import genericutility.WebDriverUtility;
import objectrepository.HomePage;

/**
 * @author AYUSH KUMAR
 */
public class TCS_DWS_022_TEST extends BaseClass {
	
	@Test
	public void MouseHoverOnComputer() throws InterruptedException {
		WebDriverUtility wutil = new WebDriverUtility();
		wutil.maximize(driver);
		wutil.implicitlyWait(driver);
		
		HomePage hp =new HomePage(driver);
		WebElement computer = hp.getComputerLink();
	    wutil.mouseHover(driver, computer);
	    
	    Thread.sleep(2000);
		
		
	}

}
