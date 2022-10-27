package tests.US_09;



        import org.openqa.selenium.By;
        import org.openqa.selenium.JavascriptExecutor;
        import org.openqa.selenium.Keys;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.interactions.Actions;
        import org.openqa.selenium.support.ui.Select;
        import org.openqa.selenium.support.ui.WebDriverWait;
        import org.testng.Assert;
        import org.testng.annotations.Test;
        import page.SpendinGoodPage;

        import utilities.*;

        import java.time.Duration;

public class TC_01 extends TestBaseRapor  {
    public SpendinGoodPage spendinGoodPage = new SpendinGoodPage();
    public Actions actions = new Actions(Driver.getDriver());
    public Select select;
    ReusableMethods reusable = new ReusableMethods();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();


    @Test
    public void TC001() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("spendingGoodUrl"));

        spendinGoodPage.SignIn.click();

        spendinGoodPage.userNameBox.sendKeys(ConfigReader.getProperty("ortakVendorEmail"));
        spendinGoodPage.passwordBox.sendKeys(ConfigReader.getProperty("ortakVendorPassword"));
        spendinGoodPage.SignInButton.click();

        reusable.waitFor(2);
        spendinGoodPage.myAccount.click();

        spendinGoodPage.storeManager.click();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        spendinGoodPage.storeManagerProducts.click();


        spendinGoodPage.addNew.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1500 );
        ReusableMethods.waitFor(2);
        //Sayfasinin altindaki shipping sekmesine tiklar
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1500 );
        spendinGoodPage.productTitle.sendKeys("cerceve");
        extentTest.info("Product Title bilgisi girildi");
        reusable.waitFor(2);
        reusable.waitFor(2);
        spendinGoodPage.priceMiktar.click();
        spendinGoodPage.priceMiktar.sendKeys("10");
        extentTest.info("Price bilgisi girildi");
        reusable.waitFor(2);


        actions.sendKeys(Keys.PAGE_UP).perform();

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


        //Sayfasinin altindaki shipping sekmesine tiklar

        ReusableMethods.jsExecutorScrool(spendinGoodPage.shipping);
        ReusableMethods.jsExecutorClick(spendinGoodPage.shipping);
       // js.executeScript("arguments[0].scrollIntoView(true);", spendinGoodPage.shipping);
        //js.executeScript("arguments[0].click()", spendinGoodPage.shipping);
        Thread.sleep(1500 );
        spendinGoodPage.weight.clear();
        spendinGoodPage.weight.sendKeys("0.3");
        spendinGoodPage.submit.sendKeys(Keys.ENTER);
        ReusableMethods.waitFor(5);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);

         Assert.assertEquals(spendinGoodPage.weight.getAttribute("value"), "0.3");
        ReusableMethods.waitFor(3);

    }

    @Test(dependsOnMethods = "TC001")
    public void US009_TC002() throws InterruptedException {
        ReusableMethods.jsExecutorScrool(spendinGoodPage.addNew);
        ReusableMethods.jsExecutorClick(spendinGoodPage.addNew);

       // spendinGoodPage.addNew.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1500 );
        spendinGoodPage.productTitle.sendKeys("cerceve");

        reusable.waitFor(2);
        spendinGoodPage.priceMiktar.click();
        spendinGoodPage.priceMiktar.sendKeys("10");

        reusable.waitFor(2);
        ReusableMethods.jsExecutorClick(spendinGoodPage.urunIlkResimEkleme);


        spendinGoodPage.mediaLibrary.click();

        spendinGoodPage.eklenecekResim.click();

        spendinGoodPage.select.click();

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

        //Sayfasinin altindaki shipping sekmesine tiklar
        ReusableMethods.jsExecutorScrool(spendinGoodPage.shipping);
        ReusableMethods.jsExecutorClick(spendinGoodPage.shipping);

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
        js.executeScript("arguments[0].click()",spendinGoodPage.shipping);
        Assert.assertEquals(spendinGoodPage.length.getAttribute("value"), "10");
        Assert.assertEquals(spendinGoodPage.width.getAttribute("value"), "5");
        Assert.assertEquals(spendinGoodPage.height.getAttribute("value"), "15");
        //degerlerin dogrulugunu kontrol eder
        ReusableMethods.waitFor(3);
        Driver.closeDriver();
    }

    @Test
    public void US009_TC003() throws InterruptedException {
        ReusableMethods.jsExecutorScrool(spendinGoodPage.addNew);
        ReusableMethods.jsExecutorClick(spendinGoodPage.addNew);
        ReusableMethods.waitFor(2);


        // spendinGoodPage.addNew.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1500 );
        spendinGoodPage.productTitle.sendKeys("cerceve");
        extentTest.info("Product Title bilgisi girildi");
        reusable.waitFor(2);
        spendinGoodPage.priceMiktar.click();
        spendinGoodPage.priceMiktar.sendKeys("10");
        extentTest.info("Price bilgisi girildi");
        reusable.waitFor(2);
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

        //Sayfasinin altindaki shipping sekmesine tiklar
        js.executeScript("arguments[0].scrollIntoView(true);",  spendinGoodPage.shipping);
        js.executeScript("arguments[0].click()", spendinGoodPage.shipping);
        //proccessing time zamanini 3-5 business day olarak secer
        Select select = new Select( spendinGoodPage.processingTimeDDM);
        select.selectByIndex(4);
        //submit butonuna tiklar
        spendinGoodPage.submit.sendKeys(Keys.ENTER);
        ReusableMethods.waitFor(5);
        js.executeScript("arguments[0].scrollIntoView(true);",  spendinGoodPage.shipping);
        js.executeScript("arguments[0].click()",  spendinGoodPage.shipping);
        //görünen islem süresinin 3-5 business day oldugunu dogrular
        String expectedResult= "3-5 business days";
        String actualResult= select.getFirstSelectedOption().getText();
        System.out.println(actualResult);
        Assert.assertEquals(actualResult, expectedResult);

    }
}

