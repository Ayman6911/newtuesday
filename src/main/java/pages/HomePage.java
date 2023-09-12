package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandels;

public class HomePage extends MethodHandels {
   // WebDriver driver ;
    public HomePage(WebDriver driver){
        super(driver);
    }
    /////////////////Locators//////////
private By formAuthLink = By.linkText("Form Authentication");
    private By checkBoxLink = By.linkText("Checkboxes");
    private By forgotPasswordLink = By.linkText("Forgot Password");

    private By dynamicLoadingLink = By.linkText("Dynamic Loading");
    private By dropDownLink = By.xpath("//a[@href=\"/dropdown\"]");
    private By jsAlertLink = By.linkText("JavaScript Alerts");
    private By EntryAdLink = By.linkText("Entry Ad");
    private By frameLink = By.linkText("Frames");
    /////////Actions/////////
    public LoginPage clickOnFormAuthentication(){
        click(formAuthLink);
       // driver.findElement(formAuthLink).click();
        return new LoginPage(driver);
    }
    public checkBoxesPage clickOnCheckBoxesLink(){
        driver.findElement(checkBoxLink).click();
        return new checkBoxesPage(driver);
    }
    public forgotPasswordPage clickOnForgotPassword(){
        driver.findElement(forgotPasswordLink).click();
        return new forgotPasswordPage(driver);
    }
    public dynamicLoadingPage clickOnDynamicLoadLink(){
        driver.findElement(dynamicLoadingLink).click();
        return new dynamicLoadingPage(driver);
    }

    public selectPage clickOnDropDownLink(){
        driver.findElement(dropDownLink).click();
        return new selectPage(driver);
    }
    public jsAlertPage clickOnJsAlertsLink(){
        driver.findElement(jsAlertLink).click();
        return new jsAlertPage(driver);
    }
    public entryAdPage clickOnEntryADLink(){
        driver.findElement(EntryAdLink).click();
        return new entryAdPage(driver);
    }
    public framePage cloickOnFrameLink(){
        driver.findElement(frameLink).click();
        return new framePage(driver);

    }
}

