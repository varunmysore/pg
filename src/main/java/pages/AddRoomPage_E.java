package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRoomPage_E {
	
	@FindBy(xpath = "//a[@class='btn btn-success pull-right']")
	private WebElement btnaddnewRoom;
	
	public void clickNewroom() {
		this.btnaddnewRoom.click();
	}
	
	public AddRoomPage_E(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
