package generic;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class actionUtil {

	WebDriver driver;

	public actionUtil(WebDriver driver) {
		this.driver = driver;
	}

	public static String getData(String path, String sn, int r, int c) {
		try {
			FileInputStream f1 = new FileInputStream(path);
			Workbook book = WorkbookFactory.create(f1);
			String d = book.getSheet(sn).getRow(r).getCell(c).getStringCellValue();
			return d;
		} catch (Exception e) {

			return null;
		}
	}

	public void validateTitle(String expTitle) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.titleIs(expTitle));
			System.out.println("title matched");
		} catch (Exception e) {
			System.out.println("failed");
			Assert.fail();
		}
	}

	public void validateElement(WebElement expElement) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf(expElement));
			System.out.println("pass");
		} catch (Exception e) {
			System.out.println("not matching");
			Assert.fail();
		}

	}

	public void captureScreenShot(String loc) {
		try {
			TakesScreenshot t = (TakesScreenshot) driver;
			File src = t.getScreenshotAs(OutputType.FILE);
			File dest = new File(loc);
			FileUtils.copyFile(src, dest);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
