package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass{


	@Test(groups= {"Regression","Master"})
	void test_account_Registration()
	{
		logger.debug("application logs...");
		logger.info("***   Starting TC_001_AccountRegistrationTest");
		try {

		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on my link ");

		//Thread.sleep(5000);

		hp.clickRegister();
		logger.info("Clicked on register ");

		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		logger.info("providing data ");
		regpage.setFirstname("abc");
		//regpage.setFirstname(randomeString().toUpperCase); // for random name
		regpage.setLastname("xyz");
		regpage.setEmail(randomeString()+"@gmail.com"); // randomly generated the email
		String password=randomeAlphaNumeric();
		regpage.setPassword(password); //if we want both password is same
		//regpage.setPassword(randomeAlphaNumeric());
		regpage.setPrivatePolicy();


		regpage.clickContinue();
		logger.info("Clicked on continue ");

		String confmsg=regpage.getConfirmationMsg();
		logger.info("validating expected message");
		Assert.assertEquals(confmsg, "Your Account Has Been Created!","Test Failed");

		}
		catch(Exception e)
		{
			logger.error("test failed");
			Assert.fail();
		}
		logger.info("*** Finished TC_001_AccountRegistrationTest");
	}




}
