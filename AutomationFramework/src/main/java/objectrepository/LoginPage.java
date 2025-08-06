package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	/**
	 * -----------------------WebElement-------------------------
	 */
	
	@FindBy(id = "Email")
	private WebElement emailText;
	
	@FindBy(id="Password")
	private WebElement passwordText;
	
	@FindBy(xpath = "//input[@value= 'Log in']")
	public WebElement loginButton;
	
	
	/**
	 * -----------------we are creating constructor--------------
	 */

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/**
	 * -----------------Getters----------------------------------
	 */
	public WebElement getEmailText() {
		return emailText;
	}


	public WebElement getPasswordText() {
		return passwordText;
	}


	public WebElement getLoginButton() {
		return loginButton;
	}

	

}
