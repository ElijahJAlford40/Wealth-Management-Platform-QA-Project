package tests;

import base.BaseTest;
import pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginTest extends BaseTest {

    private LoginPage LoginPage;

    @Test
    public void validLoginTest(){
        //page interaction
        driver.findElement(By.name("username")).sendKeys("JamesFord22");

        driver.findElement(By.name("password")).sendKeys("2468990");

        driver.findElement(By.cssSelector("input[type='submit'][value='Log In']")).click();
//synchronization
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
// validation
        WebElement accountOverviewHeading = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("h1.title")
                )
        );
        String accountOverviewText = accountOverviewHeading.getText();
        Assert.assertEquals(
                accountOverviewText,
                "Accounts Overview",
                "The user was not redirected to the Accounts Overview page."
        );



    }

}
