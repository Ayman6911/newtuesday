package tests.waitDynamicLoadingPages;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.dynamicLoadingPage;
import pages.onePage;
import pages.twoPage;

import static org.testng.Assert.assertTrue;

public class dynamicLoadingTests extends BaseTests {

    @Test
    public void ExampleOnePage(){
        dynamicLoadingPage dynamicLoadingPage = homePage.clickOnDynamicLoadLink();
        onePage onePage =  dynamicLoadingPage.clickOnExample_1();
        onePage.clickOnStartButton();
        String actualResult = onePage.getValidationMsg();
        String expectedResult = "Hello World!";
        assertTrue(actualResult.contains(expectedResult));
    }
    @Test
    public void ExampleTwoPage(){
        dynamicLoadingPage dynamicLoadingPage = homePage.clickOnDynamicLoadLink();
        twoPage twoPage =dynamicLoadingPage.clickOnExample_2();
        twoPage.clickOnStartButton();

        String actualResult = twoPage.getMsg();
        String expectedResult = "Hello World!";
        assertTrue(actualResult.contains(expectedResult));
    }
}
