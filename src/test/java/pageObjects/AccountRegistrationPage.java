package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{
	 public  AccountRegistrationPage(WebDriver driver) {
			super(driver);
		}

	 //Elements
	 @FindBy(name="firstname")
	 WebElement txtFirstName;

	 @FindBy(name="lastname")
	 WebElement txtlastName;

	 @FindBy(name="email")
	 WebElement txtEmail;

	 @FindBy(name="password")
	 WebElement txtPassword;

	 @FindBy(name="agree")
	 WebElement chkdPolicy;

     @FindBy(xpath="//button[normalize-space()='Continue']")
     WebElement btnContinue;

     @FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
     WebElement msgConfirmation;

     public void setFirstname(String fname) {
    	 txtFirstName.sendKeys(fname);
     }

     public void setLastname(String lname) {
    	 txtlastName.sendKeys(lname);
     }

     public void setEmail(String email) {
    	 txtEmail.sendKeys(email);
     }

     public void setPassword(String pwd) {
    	 txtPassword.sendKeys(pwd);
     }


     public void setPrivatePolicy() {
    	 chkdPolicy.click();
     }

     public void clickContinue() {
    	 btnContinue.click();
     }

     public String getConfirmationMsg() {
    	 try {
    		 return(msgConfirmation.getText());
    	 }
    	 catch(Exception e) {
    		 return (e.getMessage());
    	 }

     }


}
