package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_A {
	@FindBy(id = "username")
	private WebElement tbUsername;

	@FindBy(id = "password")
	private WebElement tbPassword;

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement btnLogin;

	public void login(String un, String pwd) {
		this.tbUsername.sendKeys(un);
		this.tbPassword.sendKeys(pwd);
		this.btnLogin.click();
	}

	public LoginPage_A(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
