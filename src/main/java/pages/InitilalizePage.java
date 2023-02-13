package pages;

import org.openqa.selenium.WebDriver;

public class InitilalizePage {

	public LoginPage_A LP;
	public DashBoardPage_B DBP;
	public MenuListPage_C MLP;
	public AddRooms_D AR;
	public AddRoomPage_E ARP;
	public AddRoomDetailsPage_F ARD;
	
	public InitilalizePage(WebDriver driver) {
		LP=new LoginPage_A(driver);
		DBP=new DashBoardPage_B(driver);
		MLP=new MenuListPage_C(driver);
		AR=new AddRooms_D(driver);
		ARP=new AddRoomPage_E(driver);
		ARD=new AddRoomDetailsPage_F(driver);
	}
	
}
