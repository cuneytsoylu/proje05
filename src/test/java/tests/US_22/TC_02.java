package tests.US_22;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import page.SpendinGoodPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TC_02 extends TestBaseRapor {


    SpendinGoodPage spendinGoodPage = new SpendinGoodPage();
    Select select;

    @Test
    public void test1() {

        extentTest = extentReports.createTest("urunlerin siralanmasi", "// TC_02 İndirimli Ürünler secilen ozellige gore siralanabilmeli");

        extentTest.info("// kullanici ana sayfaya gider");

        Driver.getDriver().get(ConfigReader.getProperty("spendingGoodUrl"));

        extentTest.info("// daily deals linkini tiklar");

        spendinGoodPage.dailyDeals.click();

        extentTest.info("// sayfada sort by basliginin oldugunu dogrulamali");

        assert spendinGoodPage.sortBy.isDisplayed();

        extentTest.fail(" HATA  : sayfada varsayilan siralamamin 'sort default' oldugunu dogrulamali ||(gercekte olan " +
                "popularity)||");

        select = new Select(spendinGoodPage.ddm);

        System.out.println("select.getFirstSelectedOption().getText() = " + select.getFirstSelectedOption().getText());

        String actualSorting = select.getFirstSelectedOption().getText();

        String expectedSorting = "Default sorting";

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(actualSorting, expectedSorting);


        extentTest.info("// siralama secenekleri arasinda ;");

        List<String> expectedlist = new ArrayList<>(Arrays.asList("Default sorting", "Sort by popularity", "Sort by average rating", "Sort by latest", "Sort by price: low to high", "Sort by price: high to low"));

        List<String> actualList = new ArrayList<>();

        for (WebElement w : select.getOptions()
        ) {
            actualList.add(w.getText());
            System.out.println("w.getText() = " + w.getText());
        }


        extentTest.info(" // Default sorting\n" +
                "      // Sort by popularity\n" +
                "      // Sort by average rating\n" +
                "      // Sort by latest\n" +
                "      // Sort by price: low to high\n" +
                "      // Sort by price: high to low\n" +
                "      // bulundugunu dogrulamali");


        Assert.assertEquals(actualList, expectedlist);

        softAssert.assertAll("acilan sayfada siralama default sort degil");

        extentTest.info("close driver");

        extentTest.fail("test not passed");


    }
}
