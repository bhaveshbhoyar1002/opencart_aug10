package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

		//element
		@FindBy(xpath="//input[@id='input-email']")
		WebElement txtEmail;

		@FindBy(xpath="//input[@id='input-password']")
		WebElement txtPassword;

		@FindBy(xpath="//button[normalize-space()='Login']")
		WebElement btnLogin;

		public void setEmail(String email)
		{
			txtEmail.sendKeys(email);
		}

		public void setPassword(String password)
		{
			txtEmail.sendKeys(password);
		}
		public void clickLogin()
		{
			btnLogin.click();
		}

	}


