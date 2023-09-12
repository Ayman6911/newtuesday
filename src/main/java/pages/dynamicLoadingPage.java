package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dynamicLoadingPage {
    WebDriver driver;
    public dynamicLoadingPage(WebDriver driver){
        this.driver= driver;
    }

    private By Example_1 = By.partialLinkText("Example 1");
    private By Example_2 = By.partialLinkText("Example 2");

    //////////////Actions////////////////
    public onePage clickOnExample_1(){
        driver.findElement(Example_1).click();
        return new onePage(driver);
    }
    public twoPage clickOnExample_2(){
        driver.findElement(Example_2).click();
        return new twoPage(driver);
    }



}
