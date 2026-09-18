package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


public class LoginPage {

    private WebDriver driver;
// Locators
    private By usernameField = By.name("username");

    private By passwordField = By.name("password");

    private By LoginButton = By.cssSelector("input[type='submit'][value='Log In']");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(passwordField).sendKeys(password);

    }

    public void clickLoginButton(){
        driver.findElement(LoginButton).click();
    }
}
