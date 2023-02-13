package scripts;

import org.testng.annotations.Test;

import dataproviders.data;
import generic.baseclass;
import pages.InitilalizePage;

public class addRoomScript  extends baseclass {
	
	@Test(dataProviderClass=data.class,dataProvider="createdata")
	public void addRoomsScript(String un,String pwd,String FN,String RM,String BN,String RS,String RP) {
		InitilalizePage pages = new InitilalizePage(driver);
		pages.LP.login(un, pwd);
		pages.DBP.clickMenu();
		pages.MLP.clickSetup();
		pages.AR.clickAddrooms();
		pages.ARP.clickNewroom();
		pages.ARD.addNewRoomDetails(FN, RM, BN, RS, RP);
	}

}
