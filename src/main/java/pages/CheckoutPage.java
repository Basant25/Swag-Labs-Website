package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class CheckoutPage {
    private final WebDriver driver;

    public CheckoutPage(WebDriver driver){
        this.driver=driver;
    }

    //Elements
    private final By firstnameField = By.id("first-name");
    private final By lastnameField = By.id("last-name");
    private final By postalCodeField = By.id("postal-code");
    private final By continueButton = By.xpath("//input[@class=\"btn_primary cart_button\"]");


    //getter
    public static By ContinueButton(){
        return By.xpath("//input[@class=\"btn_primary cart_button\"]");
    }
    public static By ErrorInf(){
        return By.xpath("//button[@class=\"error-button\"]");
    }


    //Actions
    public OverviewPage enterYourInf(String firstname, String lastname, String postalCode){
        driver.findElement(firstnameField).sendKeys(firstname);
        driver.findElement(lastnameField).sendKeys(lastname);
        driver.findElement(postalCodeField).sendKeys(postalCode);
        driver.findElement(continueButton).click();

        return new OverviewPage(driver);

    }
}
