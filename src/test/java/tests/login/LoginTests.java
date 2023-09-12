package tests.login;
import Base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;
import static org.testng.Assert.assertTrue;
public class LoginTests extends BaseTests {
   @Test
    public void LoginWithValidData(){
      LoginPage loginPage= homePage.clickOnFormAuthentication();
      loginPage.enterUserName("tomsmith");
      loginPage.insertPassword("SuperSecretPassword!");
      SecureAreaPage secureAreaPage= loginPage.clickOnLoginButton();
      String actualResult = secureAreaPage.getValidationMsg();
      String expectedResult = "You logged into a secure area!";
      assertTrue(actualResult.contains(expectedResult));
   }
   @Test
    public void loginWithInvalidData(){
       LoginPage loginPage =  homePage.clickOnFormAuthentication();
       loginPage.enterUserName("Ayman");
       loginPage.insertPassword("SuperSecretPassword!");
       SecureAreaPage secureAreaPage =   loginPage.clickOnLoginButton();
       String actualResult = secureAreaPage.getValidationMsg();
       String expectedResult = "Your username is invalid!";
       assertTrue(actualResult.contains(expectedResult));
   }



}
