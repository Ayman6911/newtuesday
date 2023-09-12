package tests.iframeTests;
import Base.BaseTests;
import org.testng.annotations.Test;
import pages.framePage;
import pages.iFramePage;
import static org.testng.Assert.assertEquals;
public class iFrameTest extends BaseTests {
    @Test
    public void  iFrametest(){
        framePage framePage = homePage.cloickOnFrameLink();
        iFramePage iFramePage = framePage.goToIframePage();
        iFramePage.clearBox();
      String text = "Hello World";
        iFramePage.insertText(text);
         String actualMsg = iFramePage.getActualResult();
        iFramePage.clickOnIncreaseIndentButton();
        assertEquals(actualMsg,text);
    }
}
