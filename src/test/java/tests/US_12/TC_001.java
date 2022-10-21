package tests.US_12;

import org.testng.annotations.Test;
import page.SpendinGoodPage;
import utilities.*;

public class TC_001 extends TestBaseRapor {
    SpendinGoodPage spendinGoodPage = new SpendinGoodPage();
    ReusableMethods reusable = new ReusableMethods();

    @Test
    public void testcase01()  {
        extentTest = extentReports.createTest("Siparis Urunleri Test", "siparisler goruntulenip,siralandi");
        Driver.getDriver().get(ConfigReader.getProperty("spendingGoodUrl"));
        extentTest.info("spendingGoodUrl sitesine gidildi");
        spendinGoodPage.SignIn.click();
        extentTest.info("signIn butonuna tiklandi");
        spendinGoodPage.userNameBox.sendKeys(ConfigReader.getProperty("cuneytEmail"));
        spendinGoodPage.passwordBox.sendKeys(ConfigReader.getProperty("cuneytPassword"));
        spendinGoodPage.SignInButton.click();
        extentTest.info("email ve password girilip signin butonuna basildi");
        reusable.waitFor(2);
        spendinGoodPage.myAccount.click();
        extentTest.info("My Account butonuna tiklandi");

    }
}
