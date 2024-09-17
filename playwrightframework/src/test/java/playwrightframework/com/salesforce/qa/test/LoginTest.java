package playwrightframework.com.salesforce.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import playwrightframework.com.salesforce.qa.pages.HomePage;
import playwrightframework.com.salesforce.qa.pages.LoginPage;
import playwrightframework.com.salesforce.qa.test.basetest.BaseTest;

public class LoginTest  extends BaseTest{
	@Test(priority=0)
    public void testValidLogin() {
		page.navigate("https://login.salesforce.com");
		 // Create LoginPage object
        LoginPage loginPage = new LoginPage(page);
        // Perform actions on the login page
        loginPage.enterUsername("nani1847@gmail.com");
        loginPage.enterPassword("Sweety1948@");
        HomePage homePage = loginPage.clickLoginButton();
        // Verify successful login
        String welcomeMessage = homePage.getHomePageTitle();
        System.out.println(welcomeMessage);
        Assert.assertEquals(welcomeMessage,"Home Page ~ Salesforce - Developer Edition","The home page title is not as expected.");
       
	}
	@Test (priority=1)
	public void navigateToSdfc() {
		page.navigate("https://login.salesforce.com");
		 // Create LoginPage object
        LoginPage loginPage = new LoginPage(page);
        loginPage.enterUsername("testUser");
        loginPage.clearPassWord("");
        HomePage homePage = loginPage.clickLoginButton();
        String exceptedErrorMessage=homePage.getErrorMessage();
        Assert.assertEquals(exceptedErrorMessage,"Please enter your password.");
    		 
	}
	
}
