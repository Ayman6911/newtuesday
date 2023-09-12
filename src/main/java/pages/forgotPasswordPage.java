package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class forgotPasswordPage {
    WebDriver driver;
    public forgotPasswordPage(WebDriver driver) {
        this.driver=driver;
    }
    ////////////////////Locators////////
    private By E_mail_field = By.id("email");
    private By Retrive_password_button = By.id("form_submit");

    ///////Actions/////

    public void insert_E_mail_Adress(String email){
        driver.findElement(E_mail_field).sendKeys(email);
    }
    public void clickOnRetrive_Button(){
        driver.findElement(Retrive_password_button).click();
    }
}
