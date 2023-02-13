package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage_B {

	@FindBy(className="openbtn")
	private WebElement btnMenu;
	
	public void clickMenu() {
		this.btnMenu.click();
	}
	
	public DashBoardPage_B(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
