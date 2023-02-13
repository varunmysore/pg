package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuListPage_C {

	@FindBy(xpath="(//a)[14]")
	private WebElement btnSetUp;
	
	public void clickSetup() {
		this.btnSetUp.click();
	}
	
	public MenuListPage_C(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
