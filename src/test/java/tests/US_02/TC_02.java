package tests.US_02;

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
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.ArrayList;
import java.util.List;

public class TC_02 extends TestBaseRapor {
    SpendinGoodPage spendinGoodPage = new SpendinGoodPage();
    Actions actions = new Actions(Driver.getDriver());
    ReusableMethods reusableMethods = new ReusableMethods();
    @Test
    public void OrdersVeDigerElementelerTest() {
        extentTest = extentReports.createTest("Dowlands ve diger Elementlerin gorunurlugune bakilir");
        extentTest.info("https://spendinggood.com/ adresine gidilir");
        Driver.getDriver().get(ConfigReader.getProperty("spendingGoodUrl"));
        reusableMethods.waitFor(2);
        extentTest.info("SignIn Buttonuna click yapar");
        spendinGoodPage.signIn.click();
        reusableMethods.waitFor(2);
        extentTest.info("SIGNUP Buttonuna click yapar");
        spendinGoodPage.SIGNUP.click();
        reusableMethods.waitFor(2);
        extentTest.info("Becom a Vendora click yapar");
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        reusableMethods.waitFor(2);
        extentTest.info("Email,Password ve ConfirmPassword gorunur olmali");
        Assert.assertTrue(spendinGoodPage.UcEmailPasswordConfirmPassword.isDisplayed());
        reusableMethods.waitFor(2);
        extentTest.info("Email kismina click yapilmali");
        spendinGoodPage.Email.click();
        reusableMethods.waitFor(2);
        extentTest.info("Yeni sekme acilir");
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        extentTest.info("Yeni sekmede https://www.mohmal.com/tr/inbox adresine gitmeli ");
        Driver.getDriver().get("https://www.mohmal.com/tr/inbox");
        reusableMethods.waitFor(2);
        extentTest.info("Olusan emaili getirip mail kismina yazmali");
        List<String> windowList = new ArrayList<>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(windowList.get(1));
        reusableMethods.waitFor(2);
        String email = spendinGoodPage.geciciEmail.getText();
        System.out.println(email);
        extentTest.info("Olusan maili Email kismina yazmali");
        Driver.getDriver().switchTo().window(windowList.get(0));
        spendinGoodPage.Email.sendKeys(email);
        reusableMethods.waitFor(2);
        Driver.getDriver().switchTo().window(windowList.get(1));
        reusableMethods.waitFor(4);
        extentTest.info("Yenileme Buttonuna basmali");
        spendinGoodPage.yenilemeTusu.click();
        reusableMethods.waitFor(2);
        extentTest.info("Acilan reklami kapatmali");
        Driver.getDriver().navigate().refresh();
        extentTest.info("Email mesaj kismina girilmeli");
        spendinGoodPage.geciciEmailBox.click();
        extentTest.info("Iframe methodu olusturur");
        WebElement iframe = Driver.getDriver().findElement(By.cssSelector("div>#read>div>iframe")); //iframe gir
        Driver.getDriver().switchTo().frame(iframe);
        reusableMethods.waitFor(3);
        extentTest.info("Emaile gelen onay kodu alinir");
        int code = Integer.parseInt(spendinGoodPage.verificationCode.getText().replaceAll("\\D", ""));
        String code2 = String.valueOf(code);
        extentTest.info("Iframe den cikis yapilmali ve onay kodu girilmeli");
        Driver.getDriver().switchTo().defaultContent(); //iframe den cikis
        Driver.getDriver().switchTo().window(windowList.get(0));
        reusableMethods.waitFor(2);
        spendinGoodPage.VerificationCodeBox.sendKeys(code2);
        reusableMethods.waitFor(2);
        extentTest.info("Sifre islemi yapilmali");
        spendinGoodPage.Password.sendKeys("Team05");
        reusableMethods.waitFor(2);
        extentTest.info("Ayni sifre tekrar girilmeli");
        spendinGoodPage.ConfirmPassword.sendKeys("Team05");
        reusableMethods.waitFor(2);
        extentTest.info("Kayit icin Register Buttonuna click yapmali");
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        reusableMethods.waitFor(2);
        extentTest.info("Reklami kapatma islemini yapar");
        spendinGoodPage.NotRıghtNowButton.click();
        reusableMethods.waitFor(3);;
        extentTest.pass("Giris yapilip MyAccount yazısı gorulmeli");
        reusableMethods.waitFor(2);
        spendinGoodPage.MyAccount.click();
        Assert.assertTrue(spendinGoodPage.MyAccountYazisi.isDisplayed());
        extentTest.pass("Acilan Sayfada Orders, Downloads, addresses, account details,whislist ve Logout gorulmeli");
        Assert.assertTrue(spendinGoodPage.OrdersGorunurOldugu.isDisplayed());
        Assert.assertTrue(spendinGoodPage.DownloadsGorunurOldugu.isDisplayed());
        Assert.assertTrue(spendinGoodPage.AdressGorunurOldugu.isDisplayed());
        Assert.assertTrue(spendinGoodPage.AccountDetailsGorunurOldugu.isDisplayed());
        Assert.assertTrue(spendinGoodPage.WishlistGorunurOldugu.isDisplayed());
        Assert.assertTrue(spendinGoodPage.LogoutGorunurOldugu.isDisplayed());
        extentTest.pass("Log Out'a tiklar ve Sayfayi kapatir");
        reusableMethods.waitFor(2);
        spendinGoodPage.LogOut.click();
        extentTest.pass("Sayfayi kapatir");
        reusableMethods.waitFor(2);
        Driver.closeDriver();

    }
}