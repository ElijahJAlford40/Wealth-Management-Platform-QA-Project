package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccountsOverviewPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By accountsOverviewHeading = By.cssSelector("h1.title");

    public AccountsOverviewPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String getHeadingText (){
        WebElement heading = wait.until( ExpectedConditions.visibilityOfElementLocated(accountsOverviewHeading)
        );

        return heading.getText();
    }

    public boolean isAccountsOverviewDisplayed(){
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        accountsOverviewHeading
                )
        ).isDisplayed();
    }
}
