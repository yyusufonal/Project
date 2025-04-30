package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	@FindBy(id = "username")
	private WebElement usernameInput;

	@FindBy(id = "password")
	private WebElement passwordInput;

	@FindBy(id = "loginButton")
	private WebElement loginButton;

	// Constructor
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	// Login işlemi
	public void login(String username, String password) {
		Assert.assertTrue(usernameInput.isDisplayed());
		type(usernameInput, username);
		Assert.assertTrue(passwordInput.isDisplayed());
		type(passwordInput, password);
		Assert.assertTrue(loginButton.isEnabled());
		click(loginButton);
	}
}
