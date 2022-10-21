package tests.US_14;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.ReusableMethods;



public class TC_001 extends tests.US_13.TC_01 {

    @Test(priority = 1)
    public void TC001() {
        run();
        spendinGoodPage.minimumSpend.sendKeys("1500");
        extentTest.pass("Minimum spend text'ine deger girildi");

    }


    @Test(priority = 2)
    public void TC002() {
        spendinGoodPage.maximumSpend.sendKeys("15000");
        extentTest.pass("Minimum spend text'ine deger girildi");


    }

    @Test(priority = 3)
    public void TC003() {
        ReusableMethods.jsExecutorScrool(spendinGoodPage.individualUseOnly);
        ReusableMethods.jsExecutorClick(spendinGoodPage.individualUseOnly);
        extentTest.pass("Individual use only checkbox'ina tiklanir");

    }

    @Test(priority = 4)
    public void TC004() {
        ReusableMethods.jsExecutorScrool(spendinGoodPage.excludeSaleItems);
        ReusableMethods.jsExecutorClick(spendinGoodPage.excludeSaleItems);
        extentTest.pass("Exclude Sale Items checkbox'ina tiklar");
    }

    @Test(priority = 5)
    public void TC005() {
        spendinGoodPage.productsTextbox.sendKeys("CCS-saat", Keys.ENTER);
        extentTest.pass("Products Textbox'a kupon uygulanacak urunler secildi");
    }
    @Test(priority = 6)
    public void TC006() {
        spendinGoodPage.excludeCategoriesTextbox.sendKeys("CCS-saat");
        ReusableMethods.jsExecutorScrool(spendinGoodPage.productsTextboxClick);
        ReusableMethods.jsExecutorClick(spendinGoodPage.productsTextboxClick);
        extentTest.pass("Products Textbox'a kupon uygulanacak urunler secildi");
    }
    @Test(priority = 7)
    public void TC007() {
        spendinGoodPage.excludeProductsTextbox.sendKeys("CCS-saat");
        ReusableMethods.jsExecutorScrool(spendinGoodPage.productsTextboxClick);
        ReusableMethods.jsExecutorClick(spendinGoodPage.productsTextboxClick);
        extentTest.pass("Products Textbox'a kupon uygulanacak urunler secildi");
    }
    @Test(priority = 8)
    public void TC008() {
        select=new Select(spendinGoodPage.productCategoriesTextbox);
        select.selectByIndex(0);
    }


}