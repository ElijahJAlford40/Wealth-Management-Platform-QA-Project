package tests;

import base.BaseTest;
import org.testng.annotations.BeforeMethod;
import pages.AccountsOverviewPage;
import pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {

    private LoginPage loginPage;
    private AccountsOverviewPage accountsOverviewPage;


    @BeforeMethod
    public void setUpLoginPage(){
        loginPage = new LoginPage(driver);
        accountsOverviewPage = new AccountsOverviewPage(driver);
    }



    @Test
    public void validLoginTest(){
        loginPage.enterUsername("JamesFord22");
        loginPage.enterPassword("2468990");
        loginPage.clickLoginButton();



        String accountOverviewText = accountsOverviewPage.getHeadingText();
        Assert.assertEquals(
                accountOverviewText,
                "Accounts Overview",
                "The user was not redirected to the Accounts Overview page."
        );

        boolean isDisplayed = accountsOverviewPage.isAccountsOverviewDisplayed();
        Assert.assertTrue(isDisplayed, "The Accounts overview Heading is not Displayed.");

    }

}
