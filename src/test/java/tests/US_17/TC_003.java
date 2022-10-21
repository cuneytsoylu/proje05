package tests.US_17;
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import page.SpendinGoodPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_003 {
    SpendinGoodPage spend = new SpendinGoodPage();
    Actions action = new Actions(Driver.getDriver());
    ReusableMethods reusable= new ReusableMethods();
    Faker faker=new Faker();
    @Test public void farkliShippingBillingAddress(){
        Driver.getDriver().get("https://spendinggood.com/");
        spend.SignIn.click();
        spend.userNameBox.sendKeys(ConfigReader.getProperty("selcukEmail"));
        spend.passwordBox.sendKeys(ConfigReader.getProperty("selcukPassword"));
        spend.SignInButton.click();
        reusable.waitFor(2);
        spend.myAccount.click();
        spend.shippingAndBillingAddresses.click();
        action.sendKeys(Keys.PAGE_DOWN).perform();
        reusable.waitFor(2);
        spend.editYourBilling.click();
        spend.billingFirstName.clear();
        spend.billingFirstName.sendKeys(faker.name().firstName());
        action.sendKeys(Keys.TAB).sendKeys(faker.name().lastName()).sendKeys(Keys.TAB)
                .sendKeys(faker.company().name()).perform();
        spend.billingCountryRegion.click();
        spend.belgium.click();
        action.sendKeys(Keys.TAB,faker.address().streetAddress()).sendKeys(Keys.TAB,faker.address().streetAddressNumber())
                .sendKeys(Keys.TAB,"9832").sendKeys(Keys.TAB,faker.address().cityName())
                .sendKeys(Keys.TAB,faker.phoneNumber().cellPhone()).sendKeys(Keys.TAB,faker.internet().emailAddress()).perform();
        action.sendKeys(Keys.PAGE_DOWN).perform();
        reusable.waitFor(2);
        spend.saveAddress.click();
        reusable.waitFor(2);
        action.sendKeys(Keys.PAGE_DOWN).perform();
        reusable.waitFor(2);
        spend.editYourShipping.click();
        spend.shippingFirstName.clear();
        spend.shippingFirstName.sendKeys(faker.name().firstName());
        action.sendKeys(Keys.TAB).sendKeys(faker.name().lastName()).sendKeys(Keys.TAB)
                .sendKeys(faker.company().name()).perform();
        spend.shippingCountryContainer.click();
        spend.shippingBelgium.click();
        action.sendKeys(Keys.TAB,"Bargiesstraat").sendKeys(Keys.TAB,"40")
                .sendKeys(Keys.TAB,"8900").sendKeys(Keys.TAB,"Leper").perform();
        action.sendKeys(Keys.PAGE_DOWN).perform();
        reusable.waitFor(2);
        spend.saveAddress.click();
        action.sendKeys(Keys.TAB,faker.address().streetAddress()).sendKeys(Keys.TAB,faker.address().streetAddressNumber())
                .sendKeys(Keys.TAB,"9832").sendKeys(Keys.TAB,faker.address().cityName())
                .sendKeys(Keys.ENTER).perform();




    }

}
