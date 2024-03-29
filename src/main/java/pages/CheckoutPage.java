package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class CheckoutPage {
    private WebDriver driver;

    public CheckoutPage(WebDriver driver){
        this.driver=driver;
    }

    //Elements
    private By firstnameField = By.id("first-name");
    private By lastnameField = By.id("last-name");
    private By postalCodeField = By.id("postal-code");
    private By continueButton = By.xpath("//input[@class=\"btn_primary cart_button\"]");


    //Actions
    public void enterYourInf(String firstname, String lastname, String postalCode){
        driver.findElement(firstnameField).sendKeys(firstname);
        driver.findElement(lastnameField).sendKeys(lastname);
        driver.findElement(postalCodeField).sendKeys(postalCode);
        driver.findElement(continueButton).click();

    }
}