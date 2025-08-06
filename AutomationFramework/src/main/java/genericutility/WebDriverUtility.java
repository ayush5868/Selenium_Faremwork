package genericutility;
	import java.io.File;
	import java.io.IOException;
import java.time.Duration;
import java.util.Set;
	import org.jspecify.annotations.Nullable;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.io.FileHandler;
	import org.openqa.selenium.support.ui.Select;
	/**
	 * @author AYUSH KUMAR
	 */
	public class WebDriverUtility {
		/**
		 * This method will maximize the window
		 * @param driver
		 */
		public void maximize(WebDriver driver) {
			driver.manage().window().maximize();
		}
		
		
//		
		
		
		/**
		 * This method will minimise the window
		 * @param driver
		 */
		public void minimize(WebDriver driver) {
			driver.manage().window().minimize();
		}
		
		public void implicitlyWait(WebDriver driver) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		/**
		 * This method will move the mouse cursor to an element
		 * @param driver
		 * @param element
		 */
		public void mouseHover(WebDriver driver, WebElement element) {
			Actions act = new Actions(driver);
			act.moveToElement(element).perform();
		}
		/**
		 * This method will scroll the page to the element
		 * @param driver
		 * @param element
		 */
		public void ScrollToElement(WebDriver driver, WebElement element) {
			Actions act= new Actions(driver);
			act.scrollToElement(element).perform();
		}
		/**
		 * This method will scroll by amount 
		 * @param driver
		 * @param x
		 * @param y
		 */
		public void Scroll(WebDriver driver, int x, int y) {
			Actions act= new Actions(driver);
			act.scrollByAmount(x , y).perform();
		}
		/**
		 * This method is used to drop down the menu by index
		 * @param element
		 * @param index
		 */
		public void SelectDropdown(WebElement element, int index) {
			Select sel = new Select(element);
			sel.selectByIndex(index);
		}
		/**
		 * This method is used to drop down the menu by value
		 * @param element
		 * @param value
		 */
		public void SelectDropdown(WebElement element, String value) {
			Select sel = new Select(element);
			sel.selectByValue(value);
		}
		/**
		 * This method is used to drop down the menu by visible text
		 * @param text
		 * @param element
		 */
		public void SelectDropdown( String text, WebElement element) {
			Select sel = new Select(element);
			sel.selectByVisibleText(text);
		}
		/**
		 * This method is used to switch the fame by name or id
		 * @param driver
		 * @param nameOrId
		 */
		public void SwitchToFrame(WebDriver driver, String nameOrId) {
			driver.switchTo().frame(nameOrId);
		}
		/**
		 * This method is used to switch the frame by index
		 * @param driver
		 * @param index
		 */
		public void SwitchToFrame(WebDriver driver, int index) {
			driver.switchTo().frame(index);
		}
		/**
		 * This method is used to switch the frame by element
		 * @param driver
		 * @param element
		 */
		public void SwitchToFrame(WebDriver driver, WebElement element) {
			driver.switchTo().frame(element);
		}
		/**
		 * This method is used to switch to alert popup
		 * @param driver
		 * @return
		 */
		public Alert SwitchToAlert(WebDriver driver ) {
			return driver.switchTo().alert();
		}
		/**
		 * This method is used to switch to alert popup and accept
		 * @param driver
		 */
		public void switchToAlertAndAccept(WebDriver driver) {
			driver.switchTo().alert();
		}
		/**
		 * This method is used to take screenshot with time stamp and save it to the screenshot folder
		 * @param driver
		 * @throws IOException
		 */
		public void Screenshot(WebDriver driver) throws IOException {
			JavaUtility jutil = new JavaUtility();
			TakesScreenshot ts = (TakesScreenshot)driver;
			File temp = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("./screenshots/"+jutil.getSystemTime()+".png");
			FileHandler.copy(temp, dest);
		}
		/**
		 * This method is used to switch the control to another window 
		 * @param driver
		 * @param expUrl
		 */
		public void SwitchToWindow(WebDriver driver, String expUrl) {
			Set<String> allWindowId = driver.getWindowHandles();
			for (String id : allWindowId) {
				driver.switchTo().window(id);
				String actURL = driver.getCurrentUrl();
				if (actURL.contains(expUrl)) {
					break;
				}
			}
		}
		/**
		 * This method is used to get the title of the window
		 * @param driver
		 * @param expUrl
		 */
		
		public void getTitle(WebDriver driver, String expUrl) {
			Set<String> allWindowId = driver.getWindowHandles();
			for (String id : allWindowId) {
				driver.switchTo().window(id);
				@Nullable
				String title = driver.getTitle();
				if (title.equals(expUrl)) {
					break;
				}
			}
		}
		
		
	}

