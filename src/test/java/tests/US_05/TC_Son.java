package tests.US_05;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import page.SpendinGoodPage;
import tests.US_13.TC_01;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_Son extends TestBaseRapor {

    public SpendinGoodPage spendinGoodPage = new SpendinGoodPage();
    public Actions actions = new Actions(Driver.getDriver());
    ReusableMethods reusable = new ReusableMethods();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    SoftAssert softAssert = new SoftAssert();
    public Select select;

    @Test
    public void TC001() {


        extentTest = extentReports.createTest("Prudoct Title ve Price goruntuleme", "Product Title ve price bilgisi ekleme");
        Driver.getDriver().get(ConfigReader.getProperty("spendingGoodUrl"));
        extentTest.info("spendingGoodUrl sitesine gidildi");
        spendinGoodPage.SignIn.click();
        extentTest.info("signIn butonuna tiklandi");
        spendinGoodPage.userNameBox.sendKeys(ConfigReader.getProperty("ortakVendorEmail"));
        spendinGoodPage.passwordBox.sendKeys(ConfigReader.getProperty("ortakVendorPassword"));
        spendinGoodPage.SignInButton.click();
        extentTest.info("email ve password girilip signin butonuna basildi");
        reusable.waitFor(2);
        spendinGoodPage.myAccount.click();
        extentTest.info("My Account butonuna tiklandi");
        spendinGoodPage.storeManager.click();
        extentTest.info("Store Manager butonuna tiklandi");

        ReusableMethods.jsExecutorClick(spendinGoodPage.storeManagerProducts);


        extentTest.info("Products butonuna tiklandi");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        spendinGoodPage.addNew.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("addNew butonuna tiklandi");
        reusable.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        reusable.waitFor(2);
    }
    @Test(dependsOnMethods = "TC001")
    public void TC002(){
        spendinGoodPage.submit.click();
        extentTest.info("submit butonuna tiklandi");
        reusable.waitFor(2);

        Assert.assertTrue(spendinGoodPage.hataYazisi.isDisplayed());
        extentTest.pass("hata yazisi goruldu");

        Driver.getDriver().navigate().refresh();


    }

    @Test(dependsOnMethods = "TC002")
    public void TC003() {
        Assert.assertTrue(spendinGoodPage.virtual.isDisplayed());
        Assert.assertTrue(spendinGoodPage.downloadable.isDisplayed());
        extentTest.info("virtual ve downloadable butonlarının gorunurlugu dogrulandi");
    }

    @Test(dependsOnMethods = "TC003")
    public void TC004() {
        //Urun eklerken product title ve satis miktari bilgileri girilebilmeli

        ReusableMethods.waitFor(3);

        new SoftAssert().assertTrue(spendinGoodPage.productTitle.isDisplayed());
        new SoftAssert().assertTrue(spendinGoodPage.priceMiktar.isDisplayed());

        ReusableMethods.jsExecutorClick(spendinGoodPage.productTitle);


        spendinGoodPage.productTitle.sendKeys("cerceve");
        extentTest.info("Product Title bilgisi girildi");
        reusable.waitFor(2);
        spendinGoodPage.priceMiktar.click();
        spendinGoodPage.priceMiktar.sendKeys("10");
        extentTest.info("Price bilgisi girildi");
        reusable.waitFor(2);

        ReusableMethods.waitFor(3);
        extentTest.info("User product title ve satis miktari girebildi");
        extentTest.pass("US_005 TC03 PASSED");

    }
    @Test(dependsOnMethods = "TC004")
    public void TC005() throws InterruptedException {
        ReusableMethods.jsExecutorClick(spendinGoodPage.urunIlkResimEkleme);

        extentTest.info("ilk urun ekleme bolumune tiklandi");
        spendinGoodPage.mediaLibrary.click();
        extentTest.info("mediaLibrary butonuna tiklandi");
        spendinGoodPage.eklenecekResim.click();
        extentTest.info("eklenecek ilk resme tiklandi");
        spendinGoodPage.select.click();
        extentTest.info("Select butonuna tiklandi");
        Thread.sleep(1500);

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", spendinGoodPage.urunIkinciResimEkleme);
        Thread.sleep(2000);
        extentTest.info("Ikinci urun ekleme bolumune tiklandi");
        js.executeScript("arguments[0].click();", spendinGoodPage.eklenecekIkinciResim);
        Thread.sleep(1000);
        extentTest.info("Ikinci urun eklendi");
        spendinGoodPage.addToGallery.click();
        Assert.assertTrue(spendinGoodPage.urunIlkResimEkleme.isDisplayed() && spendinGoodPage.urunIkinciResimEkleme.isDisplayed());
        extentTest.info("eklenen iki urunun gorunurlugu dogrulandi");

    }

    @Test(dependsOnMethods = "TC005")
    public void TC006() throws InterruptedException {
        ReusableMethods.waitFor(2);
        WebElement frame = Driver.getDriver().findElement(By.xpath("//iframe[@id='excerpt_ifr']"));
        frame.click();
        extentTest.info("Short Description bolumune tiklandi");
        Driver.getDriver().switchTo().frame(frame);
        WebElement text = Driver.getDriver().findElement(By.xpath("//*[@id=\"tinymce\"]/p"));
        text.sendKeys("cerceve");
        Driver.getDriver().switchTo().defaultContent();
        extentTest.info("Urun ile ilgili kısa bilgi girildi");
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Thread.sleep(1000);
        WebElement frame2 = Driver.getDriver().findElement(By.xpath("//iframe[@id='description_ifr']"));
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", frame2);
        extentTest.info("Description bolumune tiklandi");

        Driver.getDriver().switchTo().frame(frame2);
        WebElement text2 = Driver.getDriver().findElement(By.xpath("//*[@id=\"tinymce\"]/p"));
        text2.sendKeys("kahverengi,orta boy cerceve:)");
        extentTest.info("Urun ile ilgili bilgi girildi");
        ReusableMethods.waitFor(2);


    }

    public static void run() throws InterruptedException {
        TC_Son test = new TC_Son();
        test.TC001();
        test.TC002();
        test.TC003();
        test.TC004();
        test.TC005();
        test.TC006();


    }



}
