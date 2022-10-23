package tests.US_12;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.SpendinGoodPage;
import utilities.*;

public class TC_001 extends TestBaseRapor {
    SpendinGoodPage spendinGoodPage = new SpendinGoodPage();
    Actions actions=new Actions(Driver.getDriver());
    @Test
    public void TC001()  {
        extentTest = extentReports.createTest("Siparis Urunleri Test", "siparis,adres ve fatura bilgilerinin goruntulenip update edilmesi");
        Driver.getDriver().get(ConfigReader.getProperty("spendingGoodUrl"));
        extentTest.info("spendingGoodUrl sitesine gidildi");
        spendinGoodPage.SignIn.click();
        extentTest.info("signIn butonuna tiklandi");
        spendinGoodPage.userNameBox.sendKeys(ConfigReader.getProperty("cuneytEmail"));
        spendinGoodPage.passwordBox.sendKeys(ConfigReader.getProperty("cuneytPassword"));
        spendinGoodPage.SignInButton.click();
        extentTest.info("email ve password girilip signin butonuna basildi");
     ReusableMethods.waitFor(2);
        spendinGoodPage.myAccount.click();
        extentTest.info("My Account butonuna tiklandi");
        spendinGoodPage.ordersClick.click();
        extentTest.info("Orders'a tiklandi");
        Assert.assertTrue(spendinGoodPage.orders.isDisplayed());
        extentTest.pass("Siparisler oldugu ve siranladigi goruntulendi ");
    }

    @Test(dependsOnMethods = "TC001")
    public void TC002() {
        Assert.assertTrue(spendinGoodPage.donwnloadableproducts.isDisplayed());
        extentTest.pass("tanimlanan indirimli urunler listesi görüntülendi");
    }

    @Test(dependsOnMethods = "TC002")
    public void TC003() {
spendinGoodPage.adresses.click();
extentTest.info("adres bilgilerini goruntuleme kismina giris yapildi");
Assert.assertTrue(spendinGoodPage.billingAdress.isDisplayed());
Assert.assertTrue(spendinGoodPage.shippingAddress.isDisplayed());
extentTest.pass("kaydedilen fatura adresi ve gönderim adresinin listelendigi goruldu");
    }

    @Test(dependsOnMethods = "TC003")
    public void TC004() {
spendinGoodPage.accountDetails.click();
extentTest.info("Account Details'e tiklandi");
Assert.assertTrue(spendinGoodPage.firstName.isDisplayed()&&spendinGoodPage.lastName.isDisplayed()
        &&spendinGoodPage.displayName.isDisplayed()&&spendinGoodPage.emailAddress.isDisplayed());
extentTest.info("hesap bilgisi ve e posta adresi goruntulendi");
spendinGoodPage.firstName.clear();
spendinGoodPage.firstName.sendKeys("soylu");
spendinGoodPage.lastName.clear();
spendinGoodPage.lastName.sendKeys("cuneyt");
spendinGoodPage.displayName.clear();
spendinGoodPage.displayName.sendKeys("csmorex");
spendinGoodPage.emailAddress.clear();
spendinGoodPage.emailAddress.sendKeys("csmorex1@gmail.com");
ReusableMethods.jsExecutorScrool(spendinGoodPage.saveChanges);
ReusableMethods.jsExecutorClick(spendinGoodPage.saveChanges);
Assert.assertTrue(spendinGoodPage.updateIsdisplay.isDisplayed());
extentTest.pass("hesap bilgisi ve e posta adresinin update edildigi görüldü");
    }
}
