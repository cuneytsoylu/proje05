package tests.US_15;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.SpendinGoodPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.IOException;

public class TC_001 extends TestBaseRapor {
    SpendinGoodPage spendinGoodPage = new SpendinGoodPage();
    Actions actions = new Actions(Driver.getDriver());

    public static void run2() throws InterruptedException {
        tests.US_14.TC_01 test = new tests.US_14.TC_01();
        test.TC001();
        test.TC002();
        test.TC003();
        test.TC004();
        test.TC005();
        test.TC006();
        test.TC007();
        test.TC008();
        test.TC009();
    }

    @Test
    public void TC001() throws InterruptedException {

        run2();
        extentTest = extentReports.createTest("Kupon Olusturma Testi", "kupon olusturabilme");
        ReusableMethods.jsExecutorScrool(spendinGoodPage.limitButton);
        ReusableMethods.jsExecutorClick(spendinGoodPage.limitButton);
        extentTest.pass("Limit butonuna tiklandi");
    }

    @Test(dependsOnMethods = "TC001")
    public void TC002(){
     spendinGoodPage.usageLimitPerCoupon.sendKeys("1");
extentTest.pass("Usage limit per coupon'a limit girildi");
    }
@Test(dependsOnMethods = "TC002")
public void TC003() {
        spendinGoodPage.limitUsageToXItems.sendKeys("10");
        extentTest.pass("Limit usage to X items' limit degeri girildi");
}

    @Test(dependsOnMethods = "TC003")
    public void TC004() {
        spendinGoodPage.usageLimitPerUser.sendKeys("50");
        actions.click(spendinGoodPage.usageLimitPerUser).keyDown(Keys.SHIFT).sendKeys("$").keyUp(Keys.SHIFT).perform();
        extentTest.info("Usage limit per user text'inde kullanim limiti belirlendi");
        spendinGoodPage.submitButton.click();
        extentTest.info("olusturulan Coupon kodunu onaylamak icin submit butonuna tiklandi");
        Assert.assertTrue(spendinGoodPage.success.isDisplayed());


        extentTest.fail("Coupon basariyla olusturuldu");

    }

@Test(dependsOnMethods = "TC004")
    public void TC005(){
        spendinGoodPage.couponButton.click();
    try {
        ReusableMethods.getScreenshot("Spending GoodPage coupon basariyla olusturuldu");
    } catch ( IOException e) {
    }
}



}