package tests.US_03.US_03;

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
    public void adressBilgileriTesti() {
        extentTest = extentReports.createTest("Urun secme islemi yapilmali","Urunler secildi");
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
        extentTest.info("Sepet Buttonuna tiklanir");
        reusableMethods.waitFor(3);
        spendinGoodPage.SepetButtonu.click();
        extentTest.info("Checkout Buttonuna tiklanir");
        reusableMethods.waitFor(3);
        spendinGoodPage.CheckoutButton.click();
        reusableMethods.waitFor(3);
        extentTest.info("Adress Bilgileri girilir");
        ReusableMethods.waitFor(2);
        spendinGoodPage.FirstName.click();
        actions.sendKeys(faker.name().firstName()).sendKeys(Keys.TAB).
                sendKeys(faker.name().lastName()).sendKeys(Keys.TAB).sendKeys("Ordinator").
                sendKeys(Keys.TAB).sendKeys("Turkey", Keys.ENTER).sendKeys(Keys.TAB).
                sendKeys(faker.address().streetAddress()).sendKeys(Keys.TAB).
                sendKeys(faker.address().buildingNumber()).sendKeys(Keys.TAB).
                sendKeys(faker.address().zipCode()).sendKeys(Keys.TAB).
                sendKeys("Merkez", Keys.ENTER).sendKeys(Keys.TAB).sendKeys("Erzurum", Keys.ENTER).perform();
        ReusableMethods.waitFor(3);
        actions.sendKeys(Keys.TAB).sendKeys("5426546786").sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys("Herkesin Emegine Saglik TEAM05").sendKeys(Keys.ENTER).perform();
        extentTest.info("Place Order Buttonuna click yapar");
        reusableMethods.waitFor(3);
        ReusableMethods.jsclick(spendinGoodPage.PlaceOrderButtonu);
        spendinGoodPage.PlaceOrderButtonu.click();
        extentTest.pass("Son olarak sayfayi kapatir");
        reusableMethods.waitFor(5);
        Driver.closeDriver();


    }
}
