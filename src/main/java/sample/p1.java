package sample;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class p1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://iqbetspro.com/pg_manager_new/");
		driver.findElement(By.id("username")).sendKeys("koduri.bhagath@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert jspopup = driver.switchTo().alert();
		jspopup.accept();
		
		driver.findElement(By.className("openbtn")).click();
		driver.findElement(By.xpath("(//a)[14]")).click();
		driver.findElement(By.xpath("//a[@class='btn']")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-success pull-right']")).click();
		driver.findElement(By.id("roomFloorNumber")).sendKeys("1");
		driver.findElement(By.id("roomRoomNumber")).sendKeys("101");
		driver.findElement(By.id("roomBedNumber")).sendKeys("1");
		driver.findElement(By.id("roomRoomSharing")).sendKeys("2");
		driver.findElement(By.id("roomPrice")).sendKeys("10000");
		driver.findElement(By.xpath("//button[text()='Save']")).click();
	
	}
}
