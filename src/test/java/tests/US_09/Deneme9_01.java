package tests.US_09;

        import com.github.javafaker.Faker;
        import org.openqa.selenium.JavascriptExecutor;
        import org.openqa.selenium.Keys;
        import org.openqa.selenium.interactions.Actions;
        import org.openqa.selenium.support.ui.Select;
        import org.testng.Assert;
        import org.testng.annotations.Test;

        import page.SpendinGoodPage;
        import utilities.ConfigReader;
        import utilities.Driver;
        import utilities.ReusableMethods;
        import java.util.Random;
public class Deneme9_01 {
    Actions actions =new Actions(Driver.getDriver());
    Random random =new Random();
    public SpendinGoodPage spendinGoodPage = new SpendinGoodPage();

    public Select select;
    ReusableMethods reusable = new ReusableMethods();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Test
    public void test01() throws InterruptedException {

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
            Thread.sleep(1500);

        ReusableMethods.jsExecutorScroll(spendinGoodPage.shippingButton);
        ReusableMethods.jsExecutorClick(spendinGoodPage.shippingButton);

        //Weight (kg) bolumundeki kutucuga deger girilir
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        int kg = 5;
       spendinGoodPage.weightTextBox.sendKeys(String.valueOf(kg));
        //Dimensions(cm) bolumundeki kutucuklara (Length, Width, Height) deger girilir
        actions.sendKeys(Keys.TAB).sendKeys("4").sendKeys(Keys.TAB).sendKeys("7").
                sendKeys(Keys.TAB).sendKeys("2").sendKeys(Keys.PAGE_DOWN).perform();
        //Submit butonuna tiklanir
        //Product Successfully Published mesajinin gorulebilir oldugu test edilir
        Thread.sleep(1000);
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
        Select select = new Select(spendinGoodPage.processingTimeDropdown);
        select.selectByIndex(1);
        //Submit butonuna tiklanir
        //Product Successfully Published mesajinin gorulebilir oldugu test edilir
        Thread.sleep(1000);
        actions.sendKeys(Keys.DOWN).perform();
        spendinGoodPage.submit.click();

        ReusableMethods.waitForVisibility(spendinGoodPage.tamamYazisi,9);
        Assert.assertTrue(spendinGoodPage.tamamYazisi.isDisplayed());
        ReusableMethods.jsExecutorScroll(spendinGoodPage.submitButton);
        ReusableMethods.jsExecutorClick(spendinGoodPage.submitButton);


    }
}


