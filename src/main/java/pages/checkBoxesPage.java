package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkBoxesPage {
    WebDriver driver;
    public checkBoxesPage(WebDriver driver) {
        this.driver = driver;
    }
     //////Locators////
    private By checkBox1 = By.xpath("//*[@id=\"checkboxes\"]/input[1]");
    private By checkBox2 = By.xpath("//*[@id=\"checkboxes\"]/input[2]");

    //////Actions//////

    public boolean checkBox1_is_selected(){
        return driver.findElement(checkBox1).isSelected();
    }

    public boolean checkBox2_is_selected(){
        return driver.findElement(checkBox2).isSelected();
    }

    public void select_Box1(){
        driver.findElement(checkBox1).click();
    }

    public void Dselect_Box2(){
        driver.findElement(checkBox2).click();
    }


}
