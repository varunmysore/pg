package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRooms_D {

	@FindBy(xpath="//a[@class='btn']")
	private WebElement btnAddRooms;
	
	public void clickAddrooms() {
		this.btnAddRooms.click();
	}
	
	public AddRooms_D(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
