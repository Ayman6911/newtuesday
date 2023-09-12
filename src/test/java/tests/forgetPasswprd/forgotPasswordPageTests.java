package tests.forgetPasswprd;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.forgotPasswordPage;

public class forgotPasswordPageTests extends BaseTests {
    @Test
    public void forgotPasswordPageTests(){
        forgotPasswordPage forgotPasswordPage = homePage.clickOnForgotPassword();
        forgotPasswordPage.insert_E_mail_Adress("Aymangalal@test.com");
       forgotPasswordPage.clickOnRetrive_Button();

    }
}
