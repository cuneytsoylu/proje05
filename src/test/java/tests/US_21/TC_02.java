package tests.US_21;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.SpendinGoodPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_02 extends TestBaseRapor{
    SpendinGoodPage spend = new SpendinGoodPage();
    Actions action = new Actions(Driver.getDriver());
    ReusableMethods reusable= new ReusableMethods();
    @Test
    public void tarihAraligiIleRaporGoruntuleme() throws InterruptedException{
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
        extentTest=extentReports.createTest("Custom Kutucuguna tiklanmali","Custom Kutucuguna tiklandi");
        spend.customBox.click();
        extentTest.info("Custom Kutucuguna tiklanir");
        extentTest=extentReports.createTest("Custom Kutucuguna tarih araligi girilmeli","Custom Kutucuguna tarih araligi girildi");
        action.sendKeys("2022-10-05 to 2022-11-07").perform();
        extentTest.info("Custom Kutucuguna tarih araligi girilir");
        extentTest=extentReports.createTest("Close buttonuna tiklanmali","Close buttonuna tiklandi");
        spend.closeButton.click();
        extentTest.info("Close buttonuna tiklanir");
        Driver.closeDriver();
    }
}
