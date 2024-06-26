package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage {
    private final WebDriver driver;

    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }

    //Elements
    private final By usernameField = By.id("user-name");
    private final By passwordField = By.id("password");
    private final By loginButton = By.id("login-button");
    private final By errorButton = By.className("error-button");


    //getter
    public static By ErrorButton(){
        return By.className("error-button");
    }


    //Actions
    public HomePage login(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();

        return new HomePage(driver);
    }
}
