package tests.US_14;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import page.SpendinGoodPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.IOException;

public class TC_01 extends TestBaseRapor {
    public SpendinGoodPage spendinGoodPage;
    Actions actions= new Actions(Driver.getDriver());
    public Select select;
    public static void run() {
        tests.US_13.TC_01 test = new tests.US_13.TC_01();
        test.TC001();
        test.TC002();
        test.TC003();
        test.TC004();
        test.TC005();
        test.TC006();
        test.TC007();
    }
    @Test()
    public void TC001() {
        run();
        spendinGoodPage = new SpendinGoodPage();
        extentTest = extentReports.createTest("Kupon Olusturma Testi", "kupon olusturabilme");
        spendinGoodPage.minimumSpend.sendKeys("10000");
        extentTest.pass("Minimum spend girildi");
    }

    @Test(dependsOnMethods = "TC001")
    public void TC002() {
        ReusableMethods.jsExecutorScrool(spendinGoodPage.maximumSpend);
        spendinGoodPage.maximumSpend.sendKeys("100000");
        extentTest.pass("Maximum spend girildi");
    }

    @Test(dependsOnMethods = "TC002")
    public void TC003() {
        ReusableMethods.jsExecutorScrool(spendinGoodPage.individualUseOnly);
        ReusableMethods.jsExecutorClick(spendinGoodPage.individualUseOnly);
        extentTest.pass("Individual use only checkbox'a tiklandi");
    }
    @Test(dependsOnMethods = "TC003")
    public void TC004() {
        ReusableMethods.jsExecutorScrool(spendinGoodPage.excludeSaleItems);
        ReusableMethods.jsExecutorClick(spendinGoodPage.excludeSaleItems);
        extentTest.pass("Exclude sale items use only checkbox'a tiklandi ");
    }
    @Test(dependsOnMethods = "TC004")
    public void TC005() {
        spendinGoodPage.productsTextbox.sendKeys("CCS-saat");
        ReusableMethods.waitFor(3);
spendinGoodPage.productsTextboxClick.click();
        extentTest.pass("Products Textbox'a kupon uygulanacak urunler secildi");

    }
    @Test(dependsOnMethods = "TC005")
    public void TC006() throws InterruptedException {

        actions.sendKeys(Keys.TAB).perform();
        spendinGoodPage.excludeProductsTextbox.sendKeys("CCS-saat");
        Thread.sleep(4000);
        spendinGoodPage.productsTextboxClick2.click();
        try {
            ReusableMethods.getScreenshot("Spending GoodPage Exclude ile Products ayni urun eklendi");
        } catch ( IOException e) {
        }
        extentTest.fail("Exclude Products ile Products'ta ayni urun secildi");
    }
  @Test(dependsOnMethods = "TC006")
    public void TC007() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
      actions = new Actions(Driver.getDriver());
      spendinGoodPage.productCategoriesTextbox.click();
      spendinGoodPage.productCategoriesTextbox.sendKeys("For Men");
      actions.moveToElement(spendinGoodPage.selectThing).click(spendinGoodPage.selectThing).perform();
        extentTest.pass("Product categories kupon uygulanacak urun kategorisi secildi");
    }
    @Test(dependsOnMethods = "TC007")
    public void TC008() {

 spendinGoodPage.excludeCategoriesTextbox.click();
        spendinGoodPage.excludeCategoriesTextbox.sendKeys("For Men");
        actions.moveToElement(spendinGoodPage.selectThing).click(spendinGoodPage.selectThing).perform();
        try {
            ReusableMethods.getScreenshot("Spending GoodPage Exclude categories ile Product kategories ayni katagori eklendi");
        } catch (IOException e) {
        }
        extentTest.fail("Exclude categories ile Product categories'de ayni urun katagorileri secildi");
    }

    @Test(dependsOnMethods = "TC008")
    public void TC009() {

        spendinGoodPage.emailRestrictions.click();
        spendinGoodPage.emailRestrictions.sendKeys(ConfigReader.getProperty("cuneytEmail"));
extentTest.pass("Email restrictions'a email girildi");
        actions.sendKeys(Keys.PAGE_UP).sendKeys(Keys.PAGE_UP).perform();
    }
}