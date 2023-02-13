package scripts;

import org.testng.annotations.Test;

import generic.baseclass;
import pages.InitilalizePage;

public class LoginScript extends baseclass{

	@Test
	public void loginTest() {
		InitilalizePage pages = new InitilalizePage(driver);
		pages.LP.login(p.getProperty("username"), p.getProperty("password"));
		
	}
}
