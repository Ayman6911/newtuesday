package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MethodHandels {

   public WebDriver driver;
    WebDriverWait wait;

    public MethodHandels(WebDriver driver) {
        this.driver = driver;
    }

    protected void click(By locator){
        myWait(locator,10);
        myWebElement(locator).click();
    }

    protected void sendKeys(By locator,String text){
        myWait(locator,10);
        myWebElement(locator).sendKeys(text);
    }

   private  void myWait(By locator, int time){
        wait = new WebDriverWait(driver,Duration.ofSeconds(time));
        wait.until(ExpectedConditions.and(ExpectedConditions.visibilityOf(driver.findElement(locator)),
                ExpectedConditions.elementToBeClickable(locator),
                ExpectedConditions.presenceOfElementLocated(locator)));
   }

   private WebElement myWebElement(By locator){
        return driver.findElement(locator);
   }


}
