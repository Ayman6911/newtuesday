package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class iFramePage {
    WebDriver driver;
    WebDriverWait wait;
    public iFramePage(WebDriver driver){
        this.driver=driver;
    }

    private By defaultMsg = By.xpath("//*[@id=\"tinymce\"]");
    private By textBox = By.xpath("//*[@id=\"tinymce\"]");
    private By increaseIndentButton = By.xpath("//*[@id=\"content\"]/div/div/div[1]/div[1]/div[2]/div/div[5]/button[2]/span");
    private By actualMsg = By.xpath("//*[@id=\"tinymce\"]");
    String frameName = "mce_0_ifr";
    private void switchToParent(){
        driver.switchTo().parentFrame();
    }
    public void clearBox(){
        driver.switchTo().frame(frameName);
        wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(defaultMsg)));
        driver.findElement(defaultMsg).clear();
        switchToParent();
    }

    public void insertText(String text){
        driver.switchTo().frame(frameName);
        driver.findElement(textBox).sendKeys(text);
        switchToParent();
    }
    public void clickOnIncreaseIndentButton(){
        driver.findElement(increaseIndentButton).click();
        switchToParent();
    }
    String actMsg ;
    public String getActualResult(){
        driver.switchTo().frame(frameName);
        actMsg= driver.findElement(actualMsg).getText();
        switchToParent();
        return actMsg;
    }




}
