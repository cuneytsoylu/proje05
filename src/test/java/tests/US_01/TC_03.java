package tests.US_01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.SpendinGoodPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import java.util.ArrayList;
import java.util.List;

public class TC_03 extends TestBaseRapor {
    SpendinGoodPage spendinGoodPage = new SpendinGoodPage();
    Actions actions = new Actions(Driver.getDriver());
    @Test
    public void EmailOlusturmaTest() throws InterruptedException {
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
        extentTest = extentReports.createTest("Yeni sekme acmali","Yeni sekme acildi");
        extentTest.info("Yeni sekme acilir");
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        extentTest = extentReports.createTest("https://www.mohmal.com/tr/inbox adresine gidilmeli","Belirtilen adrese gidildi");
        extentTest.info("Yeni sekmede https://www.mohmal.com/tr/inbox adresine gitmeli ");
        Driver.getDriver().get("https://www.mohmal.com/tr/inbox");
        Thread.sleep(1500);
        extentTest = extentReports.createTest("Olusan mail adresini getirmeli","Email adresini aldi");
        extentTest.info("Olusan emaili getirip mail kismina yazmali");
        List<String> windowList = new ArrayList<>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(windowList.get(1));
        Thread.sleep(1500);
        String email = spendinGoodPage.geciciEmail.getText();
        System.out.println(email);
        extentTest = extentReports.createTest("Olusan maili Email kismina girmeli","Email kismina maili girdi");
        extentTest.info("Olusan maili Email kismina yazmali");
        Driver.getDriver().switchTo().window(windowList.get(0));
        spendinGoodPage.Email.sendKeys(email);
        Thread.sleep(1500);
        Driver.getDriver().switchTo().window(windowList.get(1));
        Thread.sleep(4000);
        extentTest = extentReports.createTest("Olusan mail kisminin altindaki yenileme buttonuna basmali","Yenileme Buttonuna basildi");
        extentTest.info("Yenileme Buttonuna basmali");
        spendinGoodPage.yenilemeTusu.click();
        Thread.sleep(1500);
        extentTest = extentReports.createTest("Acilan reklami kapatmali","Acilan reklami kapatildi");
        extentTest.info("Acilan reklami kapatmali");
        Driver.getDriver().navigate().refresh();
        extentTest = extentReports.createTest("Maile gelen mesaj kismina tiklamali","Mail mesaj gelen kismina tiklandi ");
        extentTest.info("Email mesaj kismina girilmeli");
        spendinGoodPage.geciciEmailBox.click();
        extentTest = extentReports.createTest("Iframe icin method olusturulmali","Iframe icin method olusturuldu ");
        extentTest.info("Iframe methodu olusturur");
        WebElement iframe = Driver.getDriver().findElement(By.cssSelector("div>#read>div>iframe")); //iframe gir
        Driver.getDriver().switchTo().frame(iframe);
        Thread.sleep(1500);
        extentTest = extentReports.createTest("Emaile gelen onay kodunu almali","Emaile gelen onay kodu alindi ");
        extentTest.info("Emaile gelen onay kodu alinir");
        int code = Integer.parseInt(spendinGoodPage.verificationCode.getText().replaceAll("\\D", ""));
        String code2 = String.valueOf(code);
        extentTest = extentReports.createTest("Iframe den cikilmali,onay kodu girilmeli","Iframe den cikis yapilip, onay kodu girildi ");
        extentTest.info("Iframe den cikis yapilmali ve onay kodu girilmeli");
        Driver.getDriver().switchTo().defaultContent(); //iframe den cikis
        Driver.getDriver().switchTo().window(windowList.get(0));
        Thread.sleep(1000);
        extentTest = extentReports.createTest("Ayni sifre tekrar girilmeli","Ayni sifre tekrar girildi");
        extentTest.info("Ayni sifre tekrar girilmeli");
        spendinGoodPage.VerificationCodeBox.sendKeys(code2);
        Thread.sleep(1000);
        extentTest = extentReports.createTest("Sayfayi kapatma islemini yapar","Sayfa kapatildi");
        extentTest.pass("Son olarak sayfayi kapatir");
        Driver.closeDriver();
    }
}
