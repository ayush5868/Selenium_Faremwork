package genericutility;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import objectrepository.HomePage;
import objectrepository.LoginPage;
import objectrepository.WelcomePage;

public class BaseClass {
	public static WebDriver driver;
	public static  ExtentReports  ereport;
	public static ExtentTest test;
	
	public JavaUtility  jutil = new JavaUtility();
	public FileUtility futility  =new FileUtility();
	public WebDriverUtility wutil =new WebDriverUtility();
	
	
	@BeforeSuite
	public void reportCnfig() {
		ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_reports/ExtentReport_"+jutil.getRandomNumber()+".html");
	    ereport = new ExtentReports();
	    ereport.attachReporter(spark);
	}
	
	@BeforeClass
	public void openBrowser() throws IOException {
	driver  =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get(futility.getdatafromproperty("url"));
	}
	
	@BeforeMethod
	public void login() throws IOException {
		WelcomePage welPage = new WelcomePage(driver);
		welPage.getLoginLink().click();
		LoginPage lp = new LoginPage(driver);
		lp.getEmailText().sendKeys(futility.getdatafromproperty("email"));
		lp.getPasswordText().sendKeys(futility.getdatafromproperty("password"));
		lp.getLoginButton().submit();
	}
	
	
	@AfterMethod
	public void logout() {
		HomePage hp  = new HomePage(driver);
	    hp.getLogoutButton().click();
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

	@AfterSuite
	public void reportBackup() {
		ereport.flush();
	}

}