package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SpendinGoodPage {

    public SpendinGoodPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }




  /* US_01 (17-67) */


















































    /*US_02(68-118)*/


















































    /*US_03(119-169 satır)*/


















































    /*US_04(170-220 satır)*/


















































    /*US_04(221-271 satır)*/


















































    /*US_05(272-352 satır)*/
    @FindBy (xpath ="//*[text()='Store Manager']")
    public WebElement storeManager;

    @FindBy (xpath ="(//*[@class='text'])[4]")
    public WebElement storeManagerProducts;

    @FindBy (xpath ="(//*[@style='width: 98px;']")
    public WebElement status;

    @FindBy (xpath ="(//*[@style='width: 59px;']")
    public WebElement stock;

    @FindBy (xpath ="(//*[@style='width: 51px;']")
    public WebElement price;

    @FindBy (xpath ="(//*[@class='sorting_desc']")
    public WebElement date;

    @FindBy (xpath ="(//*[text()='Add New']")
    public WebElement addNew;

    @FindBy (xpath ="(//*[text()='Virtual']")
    public WebElement virtual;

    @FindBy (xpath ="(//*[text()='Downloadable']")
    public WebElement downloadable;

    @FindBy (xpath ="(//*[@id='pro_title']")
    public WebElement productTitle;

    @FindBy (xpath ="(//*[text()='Price ($)']")
    public WebElement priceMiktar;

    @FindBy (xpath ="(//*[@id='featured_img_display']")
    public WebElement urunIlkResimEkleme;

    @FindBy (xpath ="(//*[@id='gallery_img_gimage_0_display']")
    public WebElement urunIkinciResimEkleme;

    @FindBy (xpath ="(//*[text()='Short Description']")
    public WebElement shortDescrip;

    @FindBy (xpath ="(//*[text()='Description']")
    public WebElement description;




































    /*US_06(353-403 satır)*/
    @FindBy (xpath ="(//*[text()='Accessories'])[3]")
    public WebElement accessories;

    @FindBy (xpath ="(//*[text()='Appointment'])[2]")
    public WebElement appointment;

    @FindBy (xpath ="(//*[text()='Best Seller'])[2]")
    public WebElement bestSeller;

    @FindBy (xpath ="(//*[text()='Electronics'])[3]")
    public WebElement electronics;

    @FindBy (xpath ="(//*[text()='Books & Music & Film'])[3]")
    public WebElement booksMusicFilm;

    @FindBy (xpath ="(//*[text()='Health & Beauty'])[2]")
    public WebElement healthBeauty;

    @FindBy (xpath ="(//*[text()='Home & Garden'])[3]")
    public WebElement homeGarden;

    @FindBy (xpath ="(//*[text()='Fashion'])[3]")
    public WebElement fashion;

    @FindBy (xpath ="(//*[text()='New Arrivals'])[3]")
    public WebElement newArrivals;

    @FindBy (xpath ="(//*[text()='Toys & Games'])[3]")
    public WebElement toys;

    @FindBy (xpath ="(//*[text()='Trending'])[2]")
    public WebElement trending;


















    /*US_07(404-454 satır)*/


















































    /*US_08(455-505 satır)*/


















































    /*US_09(506-556 satır)*/


















































    /*US_10(557-607 satır)*/


    @FindBy(xpath ="//*[@id='wcfm_products_manage_form_attribute_head']" )
    public WebElement atributesbutton;

    @FindBy(xpath ="//*[@id='attributes_is_active_1']")
    public WebElement color;

    @FindBy(xpath ="//*[@id='attributes_is_active_2']")
    public WebElement size;
    @FindBy(xpath ="//span[@class='select2-results']")
    public WebElement activeColor;
















































    /*US_11(608-658 satır)*/


    @FindBy(xpath ="//*[@class='page_collapsible_content_holder'][9]")
    public WebElement toptanurungosterme;

    @FindBy(xpath ="//*[@id='piecetype']")
    public WebElement piecetype;

















































    /*US_12(659-709 satır)*/


















































    /*US_13(710-760 satır)*/


















































    /*US_14(761-811 satır)*/


















































    /*US_15(812-862 satır)*/


















































    /*US_16(863-913 satır)*/


































    /*US_17(914-964 satır)*/
    @FindBy(xpath = "//*[text()='Sign In '] ")
    public WebElement SignIn;
    @FindBy (xpath = "//*[@id='username']")
    public WebElement userNameBox;
    @FindBy (xpath = "//*[@id='password']")
    public WebElement passwordBox;
    @FindBy (xpath = "(//*[text()='Sign In'])[2]")
    public WebElement SignInButton;
    @FindBy(xpath = "(//*[text()='My Account'])[1]")
    public WebElement myAccount;
    @FindBy (xpath = "//*[text()='shipping and billing addresses']")
    public WebElement shippingAndBillingAddresses;
    @FindBy (xpath = "//*[text()='Edit Your Billing Address']")
    public WebElement editYourBilling;
    @FindBy (xpath = "//*[@id='billing_first_name']")
    public WebElement billingName;
    @FindBy (xpath = "//*[@id='select2-billing_country-container']")
    public WebElement countryRegion;
    @FindBy (xpath = "(//*[text()='Belgium'])[3]")
    public WebElement belgium;
    @FindBy (xpath = "//*[text()='Save address']")
    public WebElement saveAddress;




























    /*US_18(965-1015 satır)*/


















































    /*US_19(1016-1066 satır)*/


















































    /*US_20(1067-1117 satır)*/


















































    /*US_21(1118-1168 satır)*/


















































    /*US_22(1169- satır)*/

























}
