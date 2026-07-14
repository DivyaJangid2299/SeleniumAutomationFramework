package tests;

import base.baseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

//only test scripts here, no locators
public class LoginTest extends baseTest{

    //annotation from testNG, only after adding this the before and after methods would run
    @Test
    public void testValidLogin(){
        //we will create object of the  loginPage class
        //driver from baseTest
        LoginPage page= new LoginPage(driver);
        page.enterUsername("standard_user");
        page.enterPassword("secret_sauce");
        page.clickLogin();
       // System.out.println("Title of the page is: "+driver.getTitle() );
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);

        Assert.assertTrue(currentUrl.contains("inventory"),
                "Login did not navigate to the products page. Actual URL: " + currentUrl);
        }
}
