package tests.javaScriptAlerts;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.jsAlertPage;

import static org.testng.Assert.assertTrue;

public class jsAlertsTest extends BaseTests {
    @Test
    public void jsAlertOkay(){
        jsAlertPage jsAlertPage = homePage.clickOnJsAlertsLink();
        jsAlertPage.clickOnJsAlertButton();
        jsAlertPage.acceptAlert();
        String actualResult = jsAlertPage.getValidationMsg();
        String expectedResult = "You successfully clicked an alert";
        assertTrue(actualResult.contains(expectedResult));
    }
    @Test
    public void cancelJsAlert(){
        jsAlertPage jsAlertPage = homePage.clickOnJsAlertsLink();
        jsAlertPage.clickOnJsConfirm();
        jsAlertPage.DismissAlert();
        String actualResult = jsAlertPage.getValidationMsg();
        String expectedResult = "You clicked: Cancel";
        assertTrue(actualResult.contains(expectedResult));
    }
    @Test
    public void jsSendKey(){
       jsAlertPage jsAlertPage = homePage.clickOnJsAlertsLink();
       jsAlertPage.clickOnJsSendKey();
       jsAlertPage.sendKeyAlert("Ayman Galal");
        String actualResult = jsAlertPage.getValidationMsg();
        String expectedResult = "Ayman Galal";
        assertTrue(actualResult.contains(expectedResult));

    }
}
