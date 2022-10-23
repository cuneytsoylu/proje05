package tests.US_21;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.SpendinGoodPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_01 extends TestBaseRapor {
    SpendinGoodPage spend = new SpendinGoodPage();
    Actions action = new Actions(Driver.getDriver());
    ReusableMethods reusable= new ReusableMethods();

    @Test
    public void raporGoruntuleme() throws InterruptedException{
        extentTest = extentReports.createTest("Istenen Sayfaya gidilmeli", "Istenen Sayfaya gidildi");
        extentTest.info("https://spendinggood.com/ adresine gidilir");
        Driver.getDriver().get(ConfigReader.getProperty("spendingGoodUrl"));
        extentTest = extentReports.createTest("SignIn Buttonuana tiklamali", "SignIn Buttonuana tiklandi");
        extentTest.info("SignIn Buttonuna click yapar");
        spend.signIn.click();
        extentTest=extentReports.createTest("UserBox a username girilebilmeli","UserBox a user name girildi");
        extentTest.info("UserBox a username girer");
        spend.userNameBox.sendKeys(ConfigReader.getProperty("selcukEmail"));
        extentTest=extentReports.createTest("PasswordBox a password girilmeli","PasswordBox a password girildi");
        extentTest.info("PasswordBox a password girer");
        spend.passwordBox.sendKeys(ConfigReader.getProperty("selcukPassword"));
        extentTest=extentReports.createTest("Ikinci Sign in Butonuna tiklamali","Ikinci Sign In butonuna tikladi");
        extentTest.info("Ikinci Sign In butonuna tiklar");
        spend.SignInButton.click();
        reusable.waitFor(2);
        extentTest=extentReports.createTest("MyAccount a tiklanmali","MyAccount a tiklandi");
        spend.myAccount.click();
        extentTest.info("My Account a tiklanir");
        extentTest=extentReports.createTest("Store Manager a tiklanmali","Store Manager a tiklandi");
        spend.storeManager.click();
        extentTest.info("Store Manager a tiklanir");
        extentTest=extentReports.createTest("Reports a tiklanmali","Reports a tiklandi");
        reusable.jsExecutorClick(spend.reports);
        extentTest.info("Reports a tiklanir");
        extentTest=extentReports.createTest("Yillik butonu tiklanabilmeli","Yillik button tiklandi");
        spend.year.click();
        extentTest.info("Yillik buttonuna tiklanir");
        extentTest=extentReports.createTest("Yillik raporlari iceren tablo goruntulenmeli","Yillik raporlari iceren Tablo goruntulendi");
        Assert.assertTrue(spend.table.isDisplayed());
        extentTest.info("Yillik Raporlari iceren Tablo Goruntulenir");
        extentTest=extentReports.createTest("Last Month buttonuna tiklanabilmeli","Last Month Buttonuna tiklandi");
        spend.lastMonth.click();
        extentTest.info("Last Month butonuna tiklanir");
        extentTest=extentReports.createTest("Last Month raporlari iceren tablo goruntulenmeli","Last Month raporlari iceren tablo goruntulendi");
        Assert.assertTrue(spend.table.isDisplayed());
        extentTest.info("Last Month raporlari iceren Tablo goruntulenir");
        extentTest=extentReports.createTest("This Month buttonuna tiklanabilmeli","This Month Buttonuna tiklandi");
        spend.thisMonth.click();
        extentTest.info("This Month butonuna tiklanir");
        extentTest=extentReports.createTest("This Month raporlari iceren tablo goruntulenmeli","This Month raporlari iceren tablo goruntulendi");
        Assert.assertTrue(spend.table.isDisplayed());
        extentTest.info("This Month raporlari iceren Tablo goruntulenir");
        extentTest=extentReports.createTest("Last 7 Days buttonuna tiklanabilmeli","Last 7 Days Buttonuna tiklandi");
        spend.last7Days.click();
        extentTest.info("Last 7 Days butonuna tiklanir");
        extentTest=extentReports.createTest("Last 7 Days raporlari iceren tablo goruntulenmeli","Last 7 Days raporlari iceren tablo goruntulendi");
        Assert.assertTrue(spend.table.isDisplayed());
        extentTest.info("Last 7 Days raporlari iceren Tablo goruntulenir");

        Driver.closeDriver();
          }
}