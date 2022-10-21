package tests.US_22;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import page.SpendinGoodPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_01 extends TestBaseRapor {


    @Test
    public void test1() {
        extentTest = extentReports.createTest("daily deals products page test", "clicking to a product on dailydeals page, should navigate us to the main cathegory ");

        SpendinGoodPage spendinGoodPage=new SpendinGoodPage();

        extentTest.info("// kullanici ana sayfaya gider");

        Driver.getDriver().get(ConfigReader.getProperty("spendingGoodUrl"));

        extentTest.info("// Daily Deals linkini tiklar");

        spendinGoodPage.dailyDeals.click();

        extentTest.info("// sayfadaki ilk urune click yapar");

        spendinGoodPage.dailyDealsfirstItem.click();

        extentTest.info("// view all  linkinine click yapar ( HATA : link yok)");

        //spendinGoodPage.viewAll.click();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(spendinGoodPage.viewAll.isDisplayed());

        softAssert.assertAll();

        /////// link yok bug !!!!!!!!!!!!!!!!!!!!

        extentTest.fail("// aranan urun ile sayfada cikan urunlerin iliskili oldugunu dogrular (boyle bi sayfa yok)");


    }
}
