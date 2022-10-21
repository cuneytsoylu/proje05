package tests.US_22;


import org.openqa.selenium.JavascriptExecutor;
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
import java.util.Collections;
import java.util.List;

public class TC_03 extends TestBaseRapor {

    @Test
    public void test1() {
        extentTest = extentReports.createTest("sorting the product prices", "sort: low to high");

        SpendinGoodPage spendinGoodPage = new SpendinGoodPage();

        extentTest.info("kullanici ana sayfaya gider");

        Driver.getDriver().get(ConfigReader.getProperty("spendingGoodUrl"));

        extentTest.info("daily deals linkini tiklar");

        spendinGoodPage.dailyDeals.click();

        extentTest.info("sort by menuden fiyati dusukten yuksege secer");
        Select select = new Select(spendinGoodPage.ddm);
        select.selectByVisibleText("Sort by price: low to high");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,1200)", "");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(spendinGoodPage.cheapest));

        extentTest.info("fiyatlarin dusukten yuksege siralandigini dogrular");
        spendinGoodPage.DailyDealsAllPricesList.forEach(t -> System.out.println(t.getText()));
        System.out.println("*******************");

        List<String> listeStiring = new ArrayList<>();

        for (WebElement w : spendinGoodPage.DailyDealsAllPricesList
        ) {
            listeStiring.add(w.getText());
        }

        String arr[];

        extentTest.info("listedeki fiyatlar stringden double cevrildi");

        for (int i = 0; i < listeStiring.size(); i++) {
            listeStiring.set(i, listeStiring.get(i).replace("$", ""));
            String part1 = listeStiring.get(i).split(" ")[0];
            listeStiring.set(i, part1);
            listeStiring.set(i, listeStiring.get(i).replace(",", ""));
        }
        List<Double> actualList = new ArrayList<>();
        List<Double> expectedList = new ArrayList<>();

        for (String w : listeStiring
        ) {
            actualList.add(Double.parseDouble(w));
            expectedList.add(Double.parseDouble(w));
        }
        actualList.forEach(t -> System.out.println("actual sorting = " + t));
        Collections.sort(expectedList);
        extentTest.info("close driver");
        extentTest.pass("beklenen siralama ile olan siralama birbirne esit");
        Assert.assertEquals(actualList, expectedList);


      Driver.closeDriver();
    }
}
