package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class twoPage {
    WebDriver driver;
    WebDriverWait wait;
    public twoPage(WebDriver driver){
        this.driver=driver;
    }
    private By startButton = By.xpath("//*[@id=\"start\"]/button");
    private By loadingBar = By.cssSelector("#loading");
    private By validationMsg = By.xpath("//*[@id=\"finish\"]/h4");

    public void clickOnStartButton (){
        driver.findElement(startButton).click();
    }
    public String getMsg(){
      wait = new WebDriverWait(driver,Duration.ofSeconds(30));
     // wait.until(ExpectedConditions.visibilityOf(driver.findElement(validationMsg)));
      wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingBar)));
        return driver.findElement(validationMsg).getText();
    }
}
