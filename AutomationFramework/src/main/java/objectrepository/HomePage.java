package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy (linkText = "Log out")
	private WebElement logoutButton;
	
	@FindBy(xpath = "(//a[contains(text(),'Books')])[1]")
	private WebElement bookLink;
	
	@FindBy(xpath = "(//a[contains(text(),'Computers')])[1]")
	private WebElement computerLink;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public WebElement getBookLink() {
		return bookLink;
	}

	public WebElement getComputerLink() {
		return computerLink;
	}
	
	
	
	
	
	/**
	 * @Homepage
	*-logout
	*-bookslist
	*-computers link
	*-electronics
	 */

}
