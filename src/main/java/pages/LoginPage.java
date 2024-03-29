package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }

    //Elements
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorButton = By.className("error-button");


    //Actions
    public void login(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    //Assert
    public boolean isLoggedSuccessfully() {
        HomePage homePage = new HomePage(driver);
        return driver.findElement(homePage.getHeaderArea()).isDisplayed();
    }

    public boolean isNotLoggedSuccessfully() {
        return driver.findElement(errorButton).isDisplayed();

    }
}
