package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class entryAdPage {
    WebDriver driver;
    WebDriverWait wait;
    public entryAdPage(WebDriver driver) {
        this.driver= driver;
    }

    private By closeAdButton = By.xpath("//*[@class='modal-footer']/p");
    private By clickHereButton = By.xpath("//*[@id=\"restart-ad\"]");

    public void clickHere(){
        driver.findElement(clickHereButton).click();
    }

    public void clickCloseModal(){
            try {
                wait = new WebDriverWait(driver, Duration.ofSeconds(20));
                wait.until(ExpectedConditions.visibilityOf(driver.findElement(closeAdButton)));
                driver.findElement(closeAdButton).click();
            } catch (Exception e) {
                System.out.println("Element not interactable: " + e.getMessage());
            }
        }
    public void clickAgain(){
        driver.findElement(closeAdButton).click();
    }
}
