package tests;
import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

public class SmokeTest extends BaseTest{



    @Test
    public void VerifyParaBankOpens(){
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, "ParaBank | Welcome | Online Banking");

    }


}

