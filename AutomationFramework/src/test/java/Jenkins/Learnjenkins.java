package Jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Learnjenkins {
	@Test
	public void pollSCM() {
	WebDriver driver  = new ChromeDriver();
	Reporter.log("Poll scm",true);
	}

}
