package tests.dropDowmList;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.selectPage;

public class dropDownListTests extends BaseTests {

    @Test
    public void dropDownListTest(){
        selectPage selectPage = homePage.clickOnDropDownLink();
        selectPage.selectDropDownList();
    }
}
