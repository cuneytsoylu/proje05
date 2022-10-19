package tests.US_01;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.SpendinGoodPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_04 extends TestBaseRapor {
    SpendinGoodPage spendinGoodPage = new SpendinGoodPage();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void UniqMailTest() throws InterruptedException {
        extentTest = extentReports.createTest("Istenen sayfaya gidilmeli","Istenen sayfaya gidildi");
        extentTest.info("https://spendinggood.com/ adresine gidilir");
        Driver.getDriver().get(ConfigReader.getProperty("spendingGoodUrl"));
        Thread.sleep(1500);
        extentTest = extentReports.createTest("SignIn Buttonuana tiklamali", "SignIn Buttonuana tiklandi");
        extentTest.info("SignIn Buttonuna click yapar");
        spendinGoodPage.signIn.click();
        Thread.sleep(1500);
        extentTest = extentReports.createTest("SIGNUP Buttonuana tiklamali", "SIGNUP Buttonuana tiklandi");
        extentTest.info("SIGNUP Buttonuna click yapar");
        spendinGoodPage.SIGNUP.click();
        Thread.sleep(1500);
        extentTest = extentReports.createTest("Become a Vendor Buttonuana tiklamali", "Become a Vendor Buttonuana tiklandi");
        extentTest.info("Becom a Vendora click yapar");
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        Thread.sleep(2000);
        extentTest = extentReports.createTest("Email,Password ve ConfirmPassword gorunur olmali", "Email,Password ve ConfirmPassword gorunur");
        extentTest.info("Email,Password ve ConfirmPassword gorunur olmali");
        Assert.assertTrue(spendinGoodPage.UcEmailPasswordConfirmPassword.isDisplayed());
        Thread.sleep(1500);
        extentTest = extentReports.createTest("Email kismina click yapar", "Email kismina click yapildi");
        extentTest.info("Email kismina click yapilmali");
        spendinGoodPage.Email.click();
        Thread.sleep(1500);
        extentTest = extentReports.createTest("Ilk girilen mail adresinin kullanilip kullanilmadigini test eder", "Giirilen Email adresi test edildi");
        extentTest.info("Email adresi ve sifre bilgileri girilmeli");
        actions.sendKeys("kmlky4444@gmail.com").sendKeys(Keys.TAB).
                sendKeys("310366").sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys("Team05").sendKeys(Keys.TAB).
                sendKeys("Team05").sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).perform();
        extentTest.fail("Girilen mail adresinin kullanildigi gorulur");
        spendinGoodPage.UniqOlmayanYazisi.isDisplayed();
        extentTest = extentReports.createTest("Sayfayi kapatma islemini yapar","Sayfa kapatildi");
        extentTest.pass("Son olarak sayfayi kapatir");
        Thread.sleep(2000);
        Driver.closeDriver();

    }
}
