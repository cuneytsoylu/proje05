package tests.US_19;

import net.bytebuddy.agent.builder.AgentBuilder;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.SpendinGoodPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_001 extends TestBaseRapor {
    SpendinGoodPage spend = new SpendinGoodPage();
    Actions action = new Actions(Driver.getDriver());
    ReusableMethods reusable= new ReusableMethods();


    @Test
    public void followersNameMail() throws InterruptedException{
        extentTest = extentReports.createTest("Istenen Sayfaya gidilmeli","Istenen Sayfaya gidildi");
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
        spend.storeManager.click();
        extentTest.info("Store Manager a tiklanir");
        reusable.waitFor(2);
        reusable.jsExecutorClick(spend.followers);
        extentTest.info("Followers a tiklandi");
        Assert.assertTrue(spend.followerTable.isDisplayed());
        extentTest.info("Followers da ki tablo bolumu goruntulenebilmeli");








       Driver.closeDriver();
    }
}
