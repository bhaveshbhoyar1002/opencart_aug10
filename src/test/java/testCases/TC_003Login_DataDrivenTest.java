package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_003Login_DataDrivenTest extends BaseClass {
	
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	public void test_loginDDT(String email, String password, String exp)
	{

		try {
		logger.info("*****Starting TC_003Login_DataDrivenTest ***** ");
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("clicked on MyAccount");

		hp.clickLogin();
		logger.info("clicked on clicLogin");

		LoginPage lp=new LoginPage (driver);

		logger.info("providing login details");
		lp.setEmail(email);  //config.properties
		lp.setPassword(password);  //config.properties

		lp.clickLogin();
		logger.info("clicked on clicLogin");


		MyAccountPage macc=new MyAccountPage(driver);
		boolean targetpage=macc.isMyAccountPageExists();
	
		if(exp.equals("Valid"))
		{
			if(targetpage==true)
			{
				macc.clickLogout();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.fail();
			}
		}
		
		if(exp.equals("Inalid"))
		{
			if(targetpage==true)
			{
				macc.clickLogout();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("****Finished TC_003Login_DataDrivenTest******");

	
	}

}
