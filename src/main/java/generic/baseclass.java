package generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class baseclass {

	public static final String userDir = System.getProperty("user.dir");
	public static final String chromekey = "webdriver.chrome.driver";
	public static final String chromevalue = userDir + "\\drivers\\chromedriver.exe";
	public static final String geckokey = "webdriver.gecko.driver";
	public static final String geckoValue = userDir + "\\drivers\\geckodriver.exe";
	public static final String excelPath = userDir + "\\data\\addrooms.xlsx";

	public static Properties p;
	public static actionUtil util;

	public WebDriver driver;

	@BeforeClass
	public void setPath() {

		try {
			FileInputStream f = new FileInputStream(userDir + "\\data\\logindetails.properties");
			p = new Properties();
			p.load(f);
		} catch (Exception e) {

			e.printStackTrace();
		}

		System.setProperty(chromekey, chromevalue);
		System.setProperty(geckokey, geckoValue);
	}

	
	@Parameters("BrowserName")
	@BeforeMethod
	public void launchBrowser(String bn) {
		if (bn.equals("chrome"))
			driver = new ChromeDriver();
		else if (bn.equals("firefox"))
			driver = new FirefoxDriver();

		util = new actionUtil(driver);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	//driver.get(p.getProperty("url"));
	driver.get("https://iqbetspro.com/pg_manager_new/");

	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

@AfterSuite
public void killtask() {
	try {
		Runtime.getRuntime().exec("taskkill /IM chromedriver.exe/F");
		Runtime.getRuntime().exec("taskkill /IM chromedriver.exe/F");
		
	} catch (IOException e) {
		e.printStackTrace();
	}
}


}

