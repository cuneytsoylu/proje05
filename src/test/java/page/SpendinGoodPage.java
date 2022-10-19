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
    //GİRİS İSLEMİ LOCATLERİ
    @FindBy(xpath = "//*[text()='Register']")
    public WebElement Register;
    @FindBy(xpath = "//*[text()='Sign In ']")
    public WebElement signIn;
    @FindBy(xpath = "//*[@class='nav-link']")
    public WebElement SIGNUP;

    @FindBy(xpath = "//*[@class='wcfmmp_become_vendor_link']")
    public WebElement BecomeVendor;

    @FindBy(xpath = "//*[@class='page-title']")
    public WebElement VendorRegistration;

    @FindBy(xpath = "//*[@id='wcfm_membership_registration_form']")
    public WebElement EmailPasswordConfirmPassword;
    @FindBy(xpath = "//*[@class='wcfm-membership-wrapper']")
    public WebElement UcEmailPasswordConfirmPassword;
    @FindBy(xpath = "//*[@id='user_email']")
    public WebElement Email;
    @FindBy(xpath = "//*[@class='wcfm-text wcfm_email_verified_input']")
    public WebElement VerificationCodeBox;
    @FindBy(xpath = "//*[@class='wcfm-text wcfm_submit_button wcfm_email_verified_button']")
    public WebElement ReSendCode;
    @FindBy(xpath = "//*[@id='passoword']")
    public WebElement Password;
    @FindBy(xpath = "//*[@id='confirm_pwd']")
    public WebElement ConfirmPassword;
    @FindBy(xpath = "//*[@id='wcfm_membership_register_button']")
    public WebElement RegisterButton;
    @FindBy(xpath = "//*[@class='wcfm-message wcfm-error']")
    public WebElement UniqOlmayanYazisi;
    @FindBy(xpath = "//*[@class='button button-large']")
    public WebElement NotRıghtNowButton;
    @FindBy(xpath = "//*[@id='menu-item-1074']")
    public WebElement MyAccount;
    //verification code div.email
    @FindBy (xpath = "//*[@class='email']")
    public WebElement geciciEmail;
    @FindBy (css = "a#renew")
    public WebElement emailBoxRefresh;
    @FindBy(xpath = "//tbody//tr[1]")
    public WebElement geciciEmailBox;
    @FindBy(xpath = "//*[@id='body_content_inner']")
    public WebElement verificationCode;
    @FindBy(xpath = "//*[@id='renew']")
    public WebElement yenilemeTusu;

















































    /*US_02(68-118)*/


















































    /*US_03(119-169 satır)*/


















































    /*US_04(170-220 satır)*/


















































    /*US_04(221-271 satır)*/


















































    /*US_05(272-352 satır)*/
    @FindBy (xpath ="//*[text()='Store Manager']")
    public WebElement storeManager;

    @FindBy (xpath ="(//*[@class='text'])[4]")
    public WebElement storeManagerProducts;

    @FindBy (xpath ="//*[@style='width: 98px;']")
    public WebElement status;

    @FindBy (xpath ="//*[@style='width: 59px;']")
    public WebElement stock;

    @FindBy (xpath ="//*[@style='width: 51px;']")
    public WebElement price;

    @FindBy (xpath ="//*[@class='sorting_desc']")
    public WebElement date;

    @FindBy (xpath ="//*[text()='Add New']")
    public WebElement addNew;

    @FindBy (xpath ="//*[text()='Virtual']")
    public WebElement virtual;

    @FindBy (xpath ="//*[text()='Downloadable']")
    public WebElement downloadable;

    @FindBy (xpath ="//*[@id='pro_title']")
    public WebElement productTitle;

    @FindBy (xpath ="//*[@id='regular_price']")
    public WebElement priceMiktar;

    @FindBy (xpath ="//*[@id='featured_img_display']")
    public WebElement urunIlkResimEkleme;

    @FindBy (xpath ="//*[@id='__wp-uploader-id-1']")
    public WebElement selectFiles;

    @FindBy (xpath ="//*[text()='Select']")
    public WebElement select;

    @FindBy (xpath ="//*[@id='gallery_img_gimage_0_display']")
    public WebElement urunIkinciResimEkleme;

    @FindBy (xpath ="(//*[text()='Add to Gallery'])[3]")
    public WebElement addToGallery;

    @FindBy (xpath ="//*[@id='excerpt_ifr']")
    public WebElement shortDescription;
    @FindBy (xpath ="//*[@id='description_ifr']")
    public WebElement description;
    @FindBy (xpath ="//*[@id='wcfm_products_simple_submit_button']")
    public WebElement submit;
    @FindBy (xpath ="//*[@id='featured_img_display']")
    public WebElement ikinciResimGorunurluk;
    @FindBy (xpath ="//*[@class='wcfm-message wcfm-error']")
    public WebElement hataYazisi;






















    /*US_06(353-403 satır)*/
    @FindBy (xpath ="//*[@class='wcfm_product_manager_cats_checklist_fields']")
    public WebElement categories;
    @FindBy (xpath ="(//*[@name='product_cats[]'])[40]")
    public WebElement vitamin;

    @FindBy (xpath ="//*[@value='225']")
    public WebElement bestSeller;

    @FindBy (xpath ="//*[@value='230']")
    public WebElement electronics;

    @FindBy (xpath ="//*[@value='228']")
    public WebElement homeGarden;

    @FindBy (xpath ="//*[@value='232']")
    public WebElement booksMusicFilm;

    @FindBy (xpath ="//*[@value='235']")
    public WebElement healthBeauty;

    @FindBy (xpath ="//*[@value='344']")
    public WebElement fashion;

    @FindBy (xpath ="//*[@value='233']")
    public WebElement toys;

    @FindBy (xpath ="//*[@value='229']")
    public WebElement accessories;

    @FindBy (xpath ="//*[@value='226']")
    public WebElement newArrivals;



















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
