package tests.US_20;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import page.SpendinGoodPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import java.time.Duration;

public class TC_01 extends TestBaseRapor {

    SpendinGoodPage spendinGoodPage = new SpendinGoodPage();
    Actions actions = new Actions(Driver.getDriver());

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();


    @Test
    public void test1() {

        extentTest = extentReports.createTest("//TC_01 vendor review islemleri", "vendor views customer info's");


        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        extentTest.info("// vendor url e gidilir");

        Driver.getDriver().get(ConfigReader.getProperty("vendoUrl"));

        extentTest.info("// sign in e click yapilir");

        spendinGoodPage.signIn.click();

        extentTest.info("// vendor kullanici adi veya email girilir");

        spendinGoodPage.userNameBox.sendKeys(ConfigReader.getProperty("ortakVendorEmail"));

        extentTest.info("// vendor sifresi girilir");

        spendinGoodPage.passwordBox.sendKeys(ConfigReader.getProperty("ortakVendorPassword"));

        extentTest.info("// sign in tiklanir giris yapilir");

        spendinGoodPage.signInEnter.click();

        extentTest.info("// My account a click yapilir");

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));

        wait.until(ExpectedConditions.invisibilityOfAllElements(spendinGoodPage.passwordBox,spendinGoodPage.SIGNUP));

        //ReusableMethods.waitFor(4);

        spendinGoodPage.myAccount.click();

        extentTest.info("// Store manager a click yapilir");

        spendinGoodPage.storeManager.click();

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //js.executeScript("window.scrollBy(0,2000)", "");/////Login succesfuly, redirecting...

        extentTest.info("// Review e click yapilir");

        spendinGoodPage.reviews.click();

        extentTest.info("// Product reviews tiklanir");

        spendinGoodPage.productReviews.click();

        extentTest.info("// musteri bilgileri goruntulenir");

        spendinGoodPage.customerInfoList.forEach(t -> System.out.println(t.getText()));

        spendinGoodPage.customerInfoList.forEach(WebElement::isDisplayed);

        extentTest.info("// musterinin yazdigi comment goruntulenir");

        spendinGoodPage.tableAllCommentList.forEach(t -> System.out.println(t.getText()));

        assert !spendinGoodPage.tableAllCommentList.isEmpty();

        extentTest.info(" // musterinin verdigi rate goruntulenir");

        spendinGoodPage.tableAllRatingList.forEach(t -> System.out.println(t.getText()));

        extentTest.info("// musterinin verdigi rate tarihi goruntulenir");

        spendinGoodPage.tableAllDateList.forEach(t -> System.out.println(t.getText()));

        extentTest.info("close driver");

        extentTest.pass("musteri bilgileri basariliyla goruntulendi");


    }
}
