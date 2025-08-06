package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputersPage {
	@FindBy(xpath = "(//a[contains(text(),'Desktops')])[1]")
	private WebElement desktopOption;
	
	
//	public ComputersPage(WebDriver driver) {
//		public HomePage(WebDriver driver) {
//			PageFactory.initElements(driver, this);
//		}
//	}

}
