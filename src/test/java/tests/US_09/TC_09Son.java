package tests.US_09;

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
import tests.US_05.TC_Son;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;



public class TC_09Son extends TestBaseRapor {

    public SpendinGoodPage spendinGoodPage = new SpendinGoodPage();
    public Actions actions = new Actions(Driver.getDriver());
    ReusableMethods reusable = new ReusableMethods();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    SoftAssert softAssert = new SoftAssert();
    public Select select;

    @Test
    public void TC001() {


        Driver.getDriver().get(ConfigReader.getProperty("spendingGoodUrl"));

        spendinGoodPage.SignIn.click();

        spendinGoodPage.userNameBox.sendKeys(ConfigReader.getProperty("ortakVendorEmail"));
        spendinGoodPage.passwordBox.sendKeys(ConfigReader.getProperty("ortakVendorPassword"));
        spendinGoodPage.SignInButton.click();

        reusable.waitFor(2);
        spendinGoodPage.myAccount.click();

        spendinGoodPage.storeManager.click();


        ReusableMethods.jsExecutorClick(spendinGoodPage.storeManagerProducts);


        actions.sendKeys(Keys.PAGE_DOWN).perform();
        spendinGoodPage.addNew.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        reusable.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        reusable.waitFor(2);


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


    }

    @Test(dependsOnMethods = "TC004")
    public void TC005() throws InterruptedException {
        ReusableMethods.jsExecutorClick(spendinGoodPage.urunIlkResimEkleme);


        spendinGoodPage.mediaLibrary.click();

        spendinGoodPage.eklenecekResim.click();

        spendinGoodPage.select.click();

        Thread.sleep(1500);

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", spendinGoodPage.urunIkinciResimEkleme);
        Thread.sleep(2000);

        js.executeScript("arguments[0].click();", spendinGoodPage.eklenecekIkinciResim);
        Thread.sleep(1000);

        spendinGoodPage.addToGallery.click();
        Assert.assertTrue(spendinGoodPage.urunIlkResimEkleme.isDisplayed() && spendinGoodPage.urunIkinciResimEkleme.isDisplayed());


    }

    @Test(dependsOnMethods = "TC005")
    public void TC006() throws InterruptedException {

        ReusableMethods.jsExecutorScrool(spendinGoodPage.shipping);
        ReusableMethods.jsExecutorClick(spendinGoodPage.shipping);
        // js.executeScript("arguments[0].scrollIntoView(true);", spendinGoodPage.shipping);
        //js.executeScript("arguments[0].click()", spendinGoodPage.shipping);
        Thread.sleep(1500);
        spendinGoodPage.weight.clear();
        spendinGoodPage.weight.sendKeys("0.3");
        spendinGoodPage.submit.sendKeys(Keys.ENTER);
        ReusableMethods.waitFor(5);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);

        Assert.assertEquals(spendinGoodPage.weight.getAttribute("value"), "0.3");
        ReusableMethods.waitFor(3);


    }

    @Test(dependsOnMethods = "TC006")
    public void TC007() throws InterruptedException {
        spendinGoodPage.length.clear();
        //length kisminindaki degeri temizler
        spendinGoodPage.length.sendKeys("10");
        //length degerini 10 olarak girer
        spendinGoodPage.width.clear();
        spendinGoodPage.width.sendKeys("5");
        spendinGoodPage.height.clear();
        spendinGoodPage.height.sendKeys("15");
        spendinGoodPage.submit.sendKeys(Keys.ENTER);
        ReusableMethods.waitFor(5);
        js.executeScript("arguments[0].scrollIntoView(true);", spendinGoodPage.shipping);
        js.executeScript("arguments[0].click()", spendinGoodPage.shipping);
        Assert.assertEquals(spendinGoodPage.length.getAttribute("value"), "10");
        Assert.assertEquals(spendinGoodPage.width.getAttribute("value"), "5");
        Assert.assertEquals(spendinGoodPage.height.getAttribute("value"), "15");
        //degerlerin dogrulugunu kontrol eder
        ReusableMethods.waitFor(3);
        Driver.closeDriver();


    }

    @Test(dependsOnMethods = "TC007")
    public void TC008() throws InterruptedException {
        //proccessing time zamanini 3-5 business day olarak secer
        Select select = new Select(spendinGoodPage.processingTimeDDM);
        select.selectByIndex(4);
        //submit butonuna tiklar
        spendinGoodPage.submit.sendKeys(Keys.ENTER);
        ReusableMethods.waitFor(5);
        js.executeScript("arguments[0].scrollIntoView(true);", spendinGoodPage.shipping);
        js.executeScript("arguments[0].click()", spendinGoodPage.shipping);
        //görünen islem süresinin 3-5 business day oldugunu dogrular
        String expectedResult = "3-5 business days";
        String actualResult = select.getFirstSelectedOption().getText();
        System.out.println(actualResult);
        Assert.assertEquals(actualResult, expectedResult);


    }

    public static void run() throws InterruptedException {
        TC_09Son test = new TC_09Son();
        test.TC001();
        test.TC002();
        test.TC003();
        test.TC004();
        test.TC005();
        test.TC006();
        test.TC007();
        test.TC008();

    }

    private void TC003() {
    }

    private void TC002() {
    }
}

