package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandels;

public class LoginPage extends MethodHandels {

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    ////////////////////Locators////////
    private By userNameField = By.id("username");
    private By passwordField = By.id("password");

    private By loginButton = By.xpath("//*[@id=\"login\"]/button");

    //////////////////Actions//////////
    public void enterUserName(String username){
        sendKeys(userNameField,username);
      //  driver.findElement(userNameField).sendKeys(username);
    }
    public void insertPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public SecureAreaPage clickOnLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }




}
