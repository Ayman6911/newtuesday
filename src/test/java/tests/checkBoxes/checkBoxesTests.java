package tests.checkBoxes;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.checkBoxesPage;

public class checkBoxesTests extends BaseTests {
    @Test
    public void checkBoxes_Tests(){
       checkBoxesPage checkBoxesPage = homePage.clickOnCheckBoxesLink();
       boolean box1_isSelected = checkBoxesPage.checkBox1_is_selected();
       if(box1_isSelected == false){
           System.out.println("--------------------");
           System.out.println("checkBox_1 is unselected");
           checkBoxesPage.select_Box1();
       }
       boolean box2_isSelected = checkBoxesPage.checkBox2_is_selected();
       if(box2_isSelected==true){
           System.out.println("checkBox_2 is Selected");
           checkBoxesPage.Dselect_Box2();
       }

    }
}
