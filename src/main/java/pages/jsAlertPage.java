package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class jsAlertPage {
    WebDriver driver;
    public jsAlertPage(WebDriver driver) {
        this.driver= driver;
    }
    private By jsAlertButton = By.xpath("//button[@onclick=\"jsAlert()\"]");
    private By jsConfirm = By.xpath("//*[@onclick=\"jsConfirm()\"]");
    private By jsSendKey = By.xpath("//*[@onclick=\"jsPrompt()\"]");
    private By validationMsg = By.xpath("//*[@id=\"result\"]");

    public void clickOnJsAlertButton(){
        driver.findElement(jsAlertButton).click();
    }
    public void clickOnJsConfirm(){
        driver.findElement(jsConfirm).click();
    }
    public void clickOnJsSendKey(){
        driver.findElement(jsSendKey).click();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    public void DismissAlert(){
        driver.switchTo().alert().dismiss();
    }
    public void sendKeyAlert(String key){
        driver.switchTo().alert().sendKeys(key);
        acceptAlert();
    }
    public String getValidationMsg(){
        return driver.findElement(validationMsg).getText();
    }

}
