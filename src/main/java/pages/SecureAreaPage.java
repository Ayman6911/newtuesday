package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    WebDriver driver;
    public SecureAreaPage(WebDriver driver) {
        this.driver= driver;
    }

    //////////////////Locators////
    public String getValidationMsg(){
        String textMsg = driver.findElement(By.id("flash")).getText();
        return textMsg;
    }
}
