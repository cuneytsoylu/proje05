package tests.US_22;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.SpendinGoodPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TC_04 extends TestBaseRapor {

    @Test
    public void test1() {
        extentTest = extentReports.createTest("sorting the products prices", "sort:high to low");
        SpendinGoodPage spendinGoodPage = new SpendinGoodPage();


        extentTest.info("https://spendinggood.com/ kullanici ana sayfaya gider");
        Driver.getDriver().get(ConfigReader.getProperty("spendingGoodUrl"));

        extentTest.info(" // daily deals linkini tiklar");
        spendinGoodPage.dailyDeals.click();
        extentTest.info("// sort by menuden fiyati yuksekten dusuge  secer");
        Select select = new Select(spendinGoodPage.ddm);
        select.selectByVisibleText("Sort by price: high to low");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(spendinGoodPage.mostExpensive));


        extentTest.info("// fiyatlarin yuksekten dusuge siralandigini dogrular");

        spendinGoodPage.DailyDealsAllPricesList.forEach(t -> System.out.println(t.getText()));

        List<String> listeString = new ArrayList<>();

        for (WebElement w : spendinGoodPage.DailyDealsAllPricesList
        ) {
            listeString.add(w.getText());
        }

        String arr[];
        for (int i = 0; i < listeString.size(); i++) {
            listeString.set(i, listeString.get(i).replace("$", "").trim());
            String part1 = listeString.get(i).split(" ")[0];
            listeString.set(i, part1);
            listeString.set(i, listeString.get(i).replace(",", ""));
        }


        List<Double> actualList = new ArrayList<>();

        for (String w : listeString
        ) {
            actualList.add(Double.parseDouble(w));
        }
        System.out.println("listeString = " + listeString);

        List<Double> expectedList = new ArrayList<>();

        for (Double w : actualList
        ) {
            expectedList.add(w);
        }

        expectedList.stream().sorted(Comparator.reverseOrder());

        System.out.println("actualList = " + actualList);
        extentTest.pass("beklenen siralama ile olan siralama birbirine esit");

        Assert.assertEquals(actualList, expectedList);

        extentTest.info("close driver");
        Driver.closeDriver();




    }
}

