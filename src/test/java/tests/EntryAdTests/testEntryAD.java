package tests.EntryAdTests;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.entryAdPage;

public class testEntryAD extends BaseTests {
    @Test
    public void EntryAdTest() throws InterruptedException {
        entryAdPage entryAdPage = homePage.clickOnEntryADLink();
        Thread.sleep(3000);
        entryAdPage.clickCloseModal();
//        Thread.sleep(2000);
//        entryAdPage.clickHere();
//        entryAdPage.clickCloseModal();

    }
}
