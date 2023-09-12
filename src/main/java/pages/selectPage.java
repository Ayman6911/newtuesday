package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class selectPage {
    WebDriver driver;
    Select select;
    public selectPage(WebDriver driver) {
        this.driver = driver;
    }

    private By selectMenu = By.xpath("//*[@id=\"dropdown\"]");

    public void selectDropDownList(){
        select = new Select(driver.findElement(selectMenu));
        select.selectByIndex(2);
    }

}
