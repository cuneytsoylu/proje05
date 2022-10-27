package tests.US_04.US_04;

import com.github.javafaker.Faker;
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

public class TC_05 extends TestBaseRapor {
    SpendinGoodPage spendinGoodPage = new SpendinGoodPage();
    Actions actions = new Actions(Driver.getDriver());
    ReusableMethods reusableMethods = new ReusableMethods();
    Faker faker = new Faker();

    @Test
    public void shippingBilgileriVeUrunMiktariTest() {
        extentTest = extentReports.createTest("Shipping Bilgileri Toplam Tutarin Oldugu Gorulmeli");
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
        extentTest.info("MyAccount Buttonuna click yapar");
        reusableMethods.waitFor(3);
        spendinGoodPage.MyAccount.click();
        extentTest.info("Orders Buttonuna click yapilir");
        reusableMethods.waitFor(2);
        spendinGoodPage.Orders.click();
        extentTest.info("Browse Products Buttonuna click yapar");
        reusableMethods.waitFor(2);
        spendinGoodPage.BrowseProductsButtonu.click();
        extentTest.info("All Catagories ve Searh den urun araması yapılıp secilir");
        reusableMethods.waitFor(2);
        spendinGoodPage.AllCatagoriesButtonu.click();
        actions.sendKeys("Electronics").sendKeys(Keys.TAB).sendKeys("hoparlor").sendKeys(Keys.ENTER).perform();
        reusableMethods.waitFor(4);
        spendinGoodPage.AdToCartButton.click();
        reusableMethods.waitFor(4);
        Driver.getDriver().navigate().back();
        reusableMethods.waitFor(4);
        spendinGoodPage.AllCatagoriesButtonu.click();
        actions.sendKeys("Electronics, Kitchen").sendKeys(Keys.TAB).sendKeys("Arcelik").sendKeys(Keys.ENTER).perform();
        reusableMethods.waitFor(4);
        spendinGoodPage.AdToCartButton.click();
        reusableMethods.waitFor(4);
        Driver.getDriver().navigate().back();
        reusableMethods.waitFor(4);
        spendinGoodPage.AllCatagoriesButtonu.click();
        actions.sendKeys("Gift İdeas").sendKeys(Keys.TAB).sendKeys("kalemlik").sendKeys(Keys.ENTER).perform();
        reusableMethods.waitFor(4);
        spendinGoodPage.AdToCartButton.click();
        reusableMethods.waitFor(4);
        Driver.getDriver().navigate().back();
        reusableMethods.waitFor(4);
        spendinGoodPage.AllCatagoriesButtonu.click();
        actions.sendKeys("Best Seller").sendKeys(Keys.TAB).sendKeys("kupa").sendKeys(Keys.ENTER).perform();
        reusableMethods.waitFor(4);
        spendinGoodPage.AdToCartButton.click();
        reusableMethods.waitFor(4);
        Driver.getDriver().navigate().back();
        spendinGoodPage.AllCatagoriesButtonu.click();
        actions.sendKeys("Fashion").sendKeys(Keys.TAB).sendKeys("bracelet").sendKeys(Keys.ENTER).perform();
        reusableMethods.waitFor(4);
        spendinGoodPage.AdToCartButton.click();
        extentTest.info("SepetButtonuna tiklar");
        reusableMethods.waitFor(3);
        spendinGoodPage.SepetButtonu.click();
        extentTest.info("View Cart Buttonua tiklar");
        reusableMethods.waitFor(1);
        spendinGoodPage.ViewCartButton.click();
        extentTest.info("Rakam ve Toplam urun gorulur");
        reusableMethods.waitFor(2);
        Assert.assertTrue(spendinGoodPage.RakamMiktarVeToplamUrun.isDisplayed());
        extentTest.info("Urun Sayisini Artira Bilmeli");
        reusableMethods.waitFor(2);
        spendinGoodPage.ArtiTusu.click();
        Assert.assertTrue(spendinGoodPage.ArtiTusu.isEnabled());
        extentTest.info("Urun Sayisini Azlata Bilmei");
        reusableMethods.waitFor(2);
        spendinGoodPage.EksiTusu.click();
        Assert.assertTrue(spendinGoodPage.EksiTusu.isEnabled());
        extentTest.info("Continue Shopping buttonu ile urun sitesine geri gidilir");
        reusableMethods.waitFor(2);
        spendinGoodPage.ContinueShoppingButtonu.click();
        extentTest.info("Stock fazlasi urunun secilemedigi test edilir");
        reusableMethods.waitFor(2);
        spendinGoodPage.StockFazlasiUrun.click();
        Assert.assertTrue(spendinGoodPage.StockFazlasiUrun.isDisplayed());
        reusableMethods.waitFor(2);
        Driver.getDriver().navigate().back();
        reusableMethods.waitFor(2);
        Driver.getDriver().navigate().back();
        reusableMethods.waitFor(2);
        spendinGoodPage.ArtiTusu.click();
        extentTest.info("Update Cart ile urun sayisi guncellenir");
        reusableMethods.waitFor(2);
        spendinGoodPage.UpdateCartButtonu.click();
        extentTest.info("Cupon buttonu oldugu gorulur");
        reusableMethods.waitFor(2);
        Assert.assertTrue(spendinGoodPage.ApplyCouponButtonu.isDisplayed());
        extentTest.info("Shopping bilgileri ve toplam tutari gorur");
        reusableMethods.waitFor(2);
        Assert.assertTrue(spendinGoodPage.ShoppingBilgileri.isDisplayed());
        Assert.assertTrue(spendinGoodPage.ToplamTutar.isDisplayed());
        extentTest.pass("Sayfa kapatilir");
        reusableMethods.waitFor(3);
        Driver.closeDriver();

    }
}
