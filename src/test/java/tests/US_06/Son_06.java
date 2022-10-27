package tests.US_06;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import page.SpendinGoodPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class Son_06 extends TestBaseRapor {

    public SpendinGoodPage spendinGoodPage = new SpendinGoodPage();
    public Actions actions = new Actions(Driver.getDriver());
    ReusableMethods reusable = new ReusableMethods();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    SoftAssert softAssert = new SoftAssert();
    public Select select;

    @Test
    public void TC001() {


        extentTest = extentReports.createTest("Urun kategorilerinin belirlenebilmesi");

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
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        spendinGoodPage.storeManagerProducts.click();
        extentTest.info("Products butonuna tiklandi");
       // actions.sendKeys(Keys.PAGE_DOWN).perform();
        spendinGoodPage.addNew.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("addNew butonuna tiklandi");

        reusable.waitFor(2);


    }

    @Test(dependsOnMethods = "TC001")
    public void TC002() {

        Assert.assertTrue(spendinGoodPage.categories.isDisplayed());
        extentTest.pass("Categories bolumunun gorunurlugu dogrulandi");

    }

    @Test(dependsOnMethods = "TC002")
    public void TC003() throws InterruptedException {


        Thread.sleep(2000);


        ReusableMethods.jsExecutorScrool(spendinGoodPage.healthTik);
        ReusableMethods.jsExecutorClick(spendinGoodPage.healthTik);

        spendinGoodPage.vitamin.click();
        Thread.sleep(2000);

        extentTest.info("vitamin kategorisi tiklandi");
        Thread.sleep(2000);
        Assert.assertTrue(spendinGoodPage.vitamin.isEnabled());
        extentTest.pass("vitamin kategorisinin gorunurlugu dogrulandi");

    }

    @Test(dependsOnMethods = "TC003")
    public void TC004() throws InterruptedException {


        spendinGoodPage.bestSeller.click();
        extentTest.info("bestSeller kategorisi tiklandi");
        Thread.sleep(2000);
        Assert.assertTrue(spendinGoodPage.bestSeller.isEnabled());
        extentTest.pass("bestSeller kategorisinin gorunurlugu dogrulandi");


    }

    @Test(dependsOnMethods = "TC004")
    public void TC005() throws InterruptedException {
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        reusable.waitFor(2);

        Thread.sleep(2000);
        spendinGoodPage.electronics.click();
        extentTest.info("electronics kategorisi tiklandi");
        Thread.sleep(2000);
        Assert.assertTrue(spendinGoodPage.electronics.isEnabled());
        extentTest.pass("electronics kategorisinin gorunurlugu dogrulandi");
    }

    @Test(dependsOnMethods = "TC005")
    public void TC006() throws InterruptedException {
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        reusable.waitFor(2);

        Thread.sleep(2000);
        spendinGoodPage.homeGarden.click();
        extentTest.info("homeGarden kategorisi tiklandi");
        Thread.sleep(2000);
        Assert.assertTrue(spendinGoodPage.homeGarden.isEnabled());
        extentTest.pass("homeGarden kategorisinin gorunurlugu dogrulandi");
    }

    @Test(dependsOnMethods = "TC006")
    public void TC007() throws InterruptedException {
        spendinGoodPage.indirimliUrunler.click();
        extentTest.info("Indirimli urunler kategorisine tiklandi");

        Assert.assertTrue(spendinGoodPage.indirimliUrunler.isEnabled());
        extentTest.pass("homeGarden kategorisinin gorunurlugu dogrulandi");


    }

    @Test(dependsOnMethods = "TC007")
    public void TC008() throws InterruptedException {
        spendinGoodPage.booksMusicFilm.click();
        extentTest.info("booksMusicFilm kategorisine tiklandi");

        Assert.assertTrue(spendinGoodPage.booksMusicFilm.isEnabled());
        extentTest.pass("booksMusicFilm kategorisinin gorunurlugu dogrulandi");

    }

    @Test(dependsOnMethods = "TC008")
    public void TC009() throws InterruptedException {
        spendinGoodPage.healthBeauty.click();
        extentTest.info("healthBeauty kategorisine tiklandi");

        Assert.assertTrue(spendinGoodPage.healthBeauty.isEnabled());
        extentTest.pass("healthBeauty kategorisinin gorunurlugu dogrulandi");
    }

    @Test(dependsOnMethods = "TC009")
    public void TC010() throws InterruptedException {
        spendinGoodPage.fashion.click();
        extentTest.info("fashion kategorisine tiklandi");

        Assert.assertTrue(spendinGoodPage.fashion.isEnabled());
        extentTest.pass("fashion kategorisinin gorunurlugu dogrulandi");
    }

    @Test(dependsOnMethods = "TC010")
    public void TC011() throws InterruptedException {
        spendinGoodPage.toys.click();
        extentTest.info("toys kategorisine tiklandi");

        Assert.assertTrue(spendinGoodPage.toys.isEnabled());
        extentTest.pass("toys kategorisinin gorunurlugu dogrulandi");
    }

    @Test(dependsOnMethods = "TC011")
    public void TC012() throws InterruptedException {
        spendinGoodPage.accessories.click();
        extentTest.info("accessories kategorisine tiklandi");

        Assert.assertTrue(spendinGoodPage.accessories.isEnabled());
        extentTest.pass("accessories kategorisinin gorunurlugu dogrulandi");

    }

    @Test(dependsOnMethods = "TC012")
    public void TC013() throws InterruptedException {
        spendinGoodPage.newArrivals.click();
        extentTest.info("newArrivals kategorisine tiklandi");

        Assert.assertTrue(spendinGoodPage.newArrivals.isEnabled());
        extentTest.pass("newArrivals kategorisinin gorunurlugu dogrulandi");
    }

    public static void run() throws InterruptedException {
        Son_06 test = new Son_06();
        test.TC001();
        test.TC002();
        test.TC003();
        test.TC004();
        test.TC005();
        test.TC006();
        test.TC007();
        test.TC008();
        test.TC009();
        test.TC010();
        test.TC011();
        test.TC012();

    }
}