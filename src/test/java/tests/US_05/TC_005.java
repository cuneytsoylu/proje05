package tests.US_05;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import page.SpendinGoodPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;
    public class TC_005 extends TestBaseRapor {
        SpendinGoodPage spendinGoodPage = new SpendinGoodPage();
        ReusableMethods reusable = new ReusableMethods();
        Actions actions = new Actions(Driver.getDriver());

        @Test
        public void testCase01() {
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
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            spendinGoodPage.storeManagerProducts.click();
            extentTest.info("Products butonuna tiklandi");
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            spendinGoodPage.addNew.click();
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            extentTest.info("addNew butonuna tiklandi");

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

            ReusableMethods.waitFor(3);
            WebElement frame2 = Driver.getDriver().findElement(By.xpath("//iframe[@id='description_ifr']"));
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            js.executeScript("arguments[0].click();",frame2);
            extentTest.info("Description bolumune tiklandi");

            Driver.getDriver().switchTo().frame(frame2);
            WebElement text2 = Driver.getDriver().findElement(By.xpath("//*[@id=\"tinymce\"]/p"));
            text2.sendKeys("kahverengi,orta boy cerceve:)");
            extentTest.info("Urun ile ilgili bilgi girildi");
            ReusableMethods.waitFor(2);


        }
    }