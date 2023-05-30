package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC1Practice extends BaseClass{

	@Test
	void test_account_Registration()
	{
		logger.debug("application logs...");
		logger.info("***   Starting TC_001_AccountRegistrationTest");
		try {

		HomePage hp=new HomePage(driver);
		logger.info("Clicked on my link ");
		logger.info("providing data ");
		hp.clickMyAccount();
		//Thread.sleep(5000);
		hp.clickRegister();
		logger.info("Clicked on register ");
		logger.info("Clicked on continue ");
		logger.info("validating expected message");
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("*** Finished TC_001_AccountRegistrationTest");
	}

}
