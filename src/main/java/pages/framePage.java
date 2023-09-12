package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class framePage {
     WebDriver driver;
    public framePage(WebDriver driver) {
        this.driver = driver;
    }

    private By iFramePage = By.linkText("iFrame");

    public iFramePage goToIframePage(){
        driver.findElement(iFramePage).click();
        return new iFramePage(driver);
    }
}
