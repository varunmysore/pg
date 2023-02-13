package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRoomDetailsPage_F {

	@FindBy(id="roomFloorNumber")
	private WebElement tbFloorNumber;
	
	@FindBy(id="roomRoomNumber")
	private WebElement tbRoomNumber;
	
	@FindBy(id="roomBedNumber")
	private WebElement tbBedNumber;
	
	@FindBy(id="roomRoomSharing")
	private WebElement tbRoomSharing;
	
	@FindBy(id="roomPrice")
	private WebElement tbRoomPrice;
	
	@FindBy(linkText="Save")
	private WebElement btnSave;
	
	public void addNewRoomDetails(String FN,String RM,String BN,String RS,String RP) {
		this.tbFloorNumber.sendKeys(FN);
		this.tbRoomNumber.sendKeys(RM);
		this.tbBedNumber.sendKeys(BN);
		this.tbRoomSharing.sendKeys(RS);
		this.tbRoomPrice.sendKeys(RP);
		this.btnSave.click();
		
	}
	
	public AddRoomDetailsPage_F(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
