package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


import java.util.List;
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

  @FindBy (xpath ="(//*[@class='sorting_disabled'])[3]")
  public WebElement stock;

  @FindBy (xpath ="(//*[@class='sorting'])[2]")
  public WebElement price;

  @FindBy (xpath ="(//*[@class='sorting'])[4]")
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

  @FindBy (xpath ="//*[@id='menu-item-browse']")
  public WebElement mediaLibrary;
  @FindBy (xpath ="(//*[@class='thumbnail'])[1]")
  public WebElement eklenecekResim;
  @FindBy (xpath ="(//*[@class='thumbnail'])[16]")
  public WebElement eklenecekIkinciResim;

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
  @FindBy (xpath ="(//*[@style='visibility: visible;'])[6]")
  public WebElement healthTik;
  @FindBy (xpath ="(//*[@name='product_cats[]'])[41]")
  public WebElement vitamin;
  @FindBy (xpath ="//*[@value='225']")
  public WebElement bestSeller;
  @FindBy (xpath ="//*[@value='230']")
  public WebElement electronics;
  @FindBy (xpath ="//*[@value='228']")
  public WebElement homeGarden;
  @FindBy (xpath ="(//*[@name='product_cats[]'])[9]")
  public WebElement booksMusicFilm;
  @FindBy (xpath ="(//*[@name='product_cats[]'])[35]")
  public WebElement healthBeauty;
  @FindBy (xpath ="(//*[@name='product_cats[]'])[24]")
  public WebElement fashion;
  @FindBy (xpath ="(//*[@name='product_cats[]'])[70]")
  public WebElement toys;
  @FindBy (xpath ="//*[@name='product_cats[]']")
  public WebElement accessories;
  @FindBy (xpath ="(//*[@name='product_cats[]'])[65]")
  public WebElement newArrivals;
  @FindBy (xpath ="(//*[@name='product_cats[]'])[52]")
  public WebElement indirimliUrunler;
























  /*US_07(404-454 satır)*/
  @FindBy (xpath ="//*[@value='35']")
  public WebElement elegantAutoGroup;

  @FindBy (xpath ="//*[@value='41']")
  public WebElement greenGrace;

  @FindBy (xpath ="//*[@value='46']")
  public WebElement nodeJs;

  @FindBy (xpath ="//*[@value='47']")
  public WebElement ns8;

  @FindBy (xpath ="//*[@value='50']")
  public WebElement red;

  @FindBy (xpath ="//*[@value='52']")
  public WebElement skySuiteTech;

  @FindBy (xpath ="//*[@value='55']")
  public WebElement sterling;
  @FindBy (xpath ="//*[@id='coupons_manage_restriction']")
  public WebElement res;
  @FindBy (xpath ="//*[@id='individual_use']")
  public WebElement inv;
  @FindBy (xpath ="(//*[@class='text'])[6]")
  public WebElement kupon;
























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
@FindBy(xpath = "//p[@class='text-uppercase text-center mb-0']")
public WebElement ordersClick;
@FindBy(xpath = "//div[@class='woocommerce-MyAccount-content col-md-9 pt-2']")
public WebElement orders;
@FindBy(xpath = "//div[@class='woocommerce-MyAccount-content col-md-9 pt-2']")
public WebElement donwnloadableproducts;
@FindBy(xpath = "//*[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--edit-address']")
public WebElement adresses;
@FindBy(xpath = "(//div[@class='woocommerce-Address'])[1]")
public WebElement billingAdress;
@FindBy(xpath = "(//div[@class='woocommerce-Address'])[2]")
public WebElement shippingAddress;
@FindBy(xpath = "//*[text()='Account details']")
public WebElement accountDetails;
@FindBy(xpath = "//*[@id='account_first_name']")
public WebElement firstName;
@FindBy(xpath = "//*[@id='account_last_name']")
public WebElement lastName;
@FindBy(xpath = "//*[@id='account_display_name']")
public WebElement displayName;
@FindBy(xpath = "//*[@id='account_email']")
public WebElement emailAddress;
@FindBy(xpath = "(//button[@type='submit'])[2]")
public WebElement saveChanges;
@FindBy(xpath = "//div[@class='woocommerce-message alert alert-simple alert-icon alert-close-top alert-success']")
public WebElement updateIsdisplay;
























 /*US_13(710-760 satır)*/


    @FindBy(xpath = "//span[@class='wcfmfa fa-gift']")
    public WebElement couponButton;
  @FindBy(xpath = "//*[text()=\"Add New\"]")
  public WebElement couponAddNewButton;
  @FindBy(xpath = "//input[@id=\"title\"]")
  public WebElement codeText;
  @FindBy(xpath = "//textarea[@id='description']")
  public WebElement descriptionText;
  @FindBy(xpath = "//select[@id=\"discount_type\"]")
  public WebElement discountType;
  @FindBy(xpath = "//input[@id='coupon_amount']")
  public WebElement couponAmount;
  @FindBy(xpath = "//input[@id='expiry_date']")
  public WebElement couponExpiryDate;
  @FindBy(xpath = "//input[@id='free_shipping']")
  public WebElement allowFreeShipping;
  @FindBy(xpath = "//input[@id='show_on_store']")
  public WebElement showOnStore;

 // locate ler tamamlandılar




























 /*US_14(761-811 satır)*/
  @FindBy(xpath = "//input[@id='individual_use']")
  public WebElement individualUseOnly;
  @FindBy(xpath = "//input[@id='exclude_sale_items']")
  public WebElement excludeSaleItems;
  @FindBy(xpath = "(//input[@class='select2-search__field'])[1]")
  public WebElement productsTextbox;
  @FindBy(xpath = "(//input[@class='select2-search__field'])[2]")
  public WebElement excludeProductsTextbox;
  @FindBy(xpath = "(//*[text()='CCS-saat (watch unit)'])[1]")
  public WebElement productsTextboxClick;
  @FindBy(xpath = "(//*[text()=\"CCS-saat (watch unit)\"])[2]")
  public WebElement excludeProductsTextboxClick;
  @FindBy (xpath ="(//*[@class='select2-search__field'])[3]")
  public WebElement productCategoriesTextbox;
  @FindBy (xpath ="(//*[@class='select2-search__field'])[4]")
  public WebElement excludeCategoriesTextbox;
  @FindBy (xpath ="//*[@id='customer_email']")
  public  WebElement emailRestrictions;
  @FindBy(xpath = "//input[@id='minimum_amount']")
  public WebElement minimumSpend;
  @FindBy(xpath = "//input[@id='maximum_amount']")
  public WebElement maximumSpend;
  @FindBy(xpath = "(//li[text()='CCS-saat (watch unit)'])[2]")
  public WebElement productsTextboxClick2;
  @FindBy (xpath ="//*[@class='select2-results__option select2-results__option--highlighted']")
  public WebElement selectThing;
























  /*US_15(812-862 satır)*/

  @FindBy (xpath ="//*[text()='kupa']")
  public WebElement kupa;
  @FindBy (xpath ="//*[@class='wcfm-content']")
  public WebElement bosluk;
  @FindBy (xpath ="//div[@id='coupons_manage_limit']")
  public WebElement limitButton;
  @FindBy (xpath ="//input[@id='usage_limit']")
  public WebElement usageLimitPerCoupon;
  @FindBy (xpath ="//input[@id='limit_usage_to_x_items']")
  public WebElement limitUsageToXItems;
  @FindBy (xpath ="//input[@id='usage_limit_per_user']")
  public WebElement usageLimitPerUser;

  @FindBy (xpath ="//*[@id='wcfm_coupon_manager_submit_button']")
  public WebElement sonSubmit;

  @FindBy (xpath ="//*[contains(text(), 'kupa')]")
  public WebElement kupaLocate;































  /*US_16(863-913 satır)*/


  @FindBy(xpath ="//*[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--wcfm-store-manager']")
  public WebElement StoreManager;

  @FindBy(xpath = "(//*[@class='text'])[7]")
       public WebElement Customerss;




 @FindBy(xpath ="//tbody//tr//td[1]")
  public List<WebElement> bütünisimlerlist;


  //@FindBy(xpath ="//*[@id='piecetype']")
  //public WebElement piecetype;

































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
  public WebElement billingFirstName;
  @FindBy (xpath = "//*[@id='select2-billing_country-container']")
  public WebElement billingCountryRegion;
  @FindBy (xpath = "(//*[text()='Belgium'])[3]")
  public WebElement belgium;
  @FindBy (xpath = "//*[text()='Save address']")
  public WebElement saveAddress;
  @FindBy (xpath = "//*[text()='Edit Your Shipping Address']")
  public WebElement editYourShipping;
  @FindBy (xpath = "//*[@id='shipping_first_name']")
  public WebElement shippingFirstName;
  @FindBy (id = "select2-shipping_country-container")
  public WebElement shippingCountryContainer;
  @FindBy (xpath = "(//*[text()='Belgium'])[3]")
  public WebElement shippingBelgium;



















/*US_18(965-1015 satır)*/


















































    /*US_19(1016-1066 satır)*/
@FindBy (xpath = "(//*[@class='wcfm_menu_item '])[10]")
  public WebElement followers;
@FindBy (xpath = "//*[text()='No data in the table']")
  public WebElement followerTable;














































    /*US_20(1067-1117 satır)*/


















































    /*US_21(1118-1168 satır)*/
@FindBy (xpath = "(//*[@class='wcfmfa fa-chart-pie'])[1]")
  public WebElement reports;
@FindBy (xpath = "//*[text()='Year']")
  public WebElement year;
@FindBy (xpath = "//*[@id='chart-placeholder-canvas']")
  public WebElement table;
@FindBy (xpath = "//*[text()='Last Month']")
  public WebElement lastMonth;
@FindBy (xpath = "//*[text()='This Month']")
  public WebElement thisMonth;
@FindBy (xpath = "//*[text()='Last 7 Days']")
  public WebElement last7Days;
@FindBy (xpath = "//*[@name='wcfm-date-range']")
  public WebElement customBox;
@FindBy (xpath = "//*[@class='apply-btn disabled']")
  public WebElement closeButton;


































    /*US_22(1169- satır)*/



  @FindBy(xpath = "//a[text()='Daily Deals']")
  public WebElement dailyDeals;
  @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div[4]/ul/li[1]/div/figure/a/img[2]")
  public WebElement dailyDealsfirstItem;

  @FindBy(xpath = "//*[text()='Sort By :']")
  public WebElement sortBy;

  @FindBy(xpath = "//*[@class='orderby form-control']//option")
  public List<WebElement> sortBySelectDDMList;

  @FindBy(xpath = "//*[@class='orderby form-control']")
  public WebElement ddm;

  @FindBy(css = ".spendingGoodUrl")
  public List<WebElement> DailyDealsAllProductList;

  @FindBy(xpath = "no location")
  public WebElement viewAll;

  @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div[4]/ul/li[1]/div/div/span/ins/span/bdi")
  public WebElement mostExpensive;
  @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div[4]/ul/li[1]/div/div/div/div")
  public WebElement cheapest;

  @FindBy(xpath = "//span[@class='price']")
  public List<WebElement> DailyDealsAllPricesList;

  @FindBy(xpath = "//button[.='Sign In']")
  public WebElement signInEnter;

    @FindBy(xpath = "//*[text()='Store Manager']")
    public WebElement storeManagerUS20;

    @FindBy(xpath = "//table//tr//td[3]")
    public List<WebElement> tableAllCommentList;

    @FindBy(xpath = "//table//tr//td[4]")
    public List<WebElement> tableAllRatingList;

    @FindBy(xpath = "//table//tr//td[6]")
    public List<WebElement> tableAllDateList;
    @FindBy(xpath = "(//a[@href='https://spendinggood.com/store-manager/reviews/'])[1]")
    public WebElement reviews;

    @FindBy(css = "#add_new_product_dashboard")
    public WebElement productReviews;

    @FindBy(xpath = "//tfoot//th")
    public List<WebElement> customerInfoList;

    @FindBy(xpath = "//span[@class='price']")
    public List<WebElement> visibleElementOnMainMenu;























}
