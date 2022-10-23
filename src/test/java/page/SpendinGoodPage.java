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
//US_02 Locatleri
  @FindBy(xpath = "//*[@class='page-title']")
  public WebElement MyAccountYazisi;
  @FindBy(xpath = "//*[@id='username']")
  public WebElement UserName;
  @FindBy(xpath = "//*[@id='password']")
  public WebElement PasswordSıgnIn;

  @FindBy(xpath = "//*[@value='Sign In']")
  public WebElement SıgnInButton;
  @FindBy(xpath = "//*[text()='Log out']")
  public WebElement LogOut;
  @FindBy(xpath = "(//*[@class='icon-box text-center'])[1]")
  public WebElement OrdersGorunurOldugu;
  @FindBy(xpath = "(//*[@class='icon-box text-center'])[2]")
  public WebElement DownloadsGorunurOldugu;
  @FindBy(xpath = "(//*[@class='icon-box text-center'])[3]")
  public WebElement AdressGorunurOldugu;
  @FindBy(xpath = "(//*[@class='icon-box text-center'])[4]")
  public WebElement AccountDetailsGorunurOldugu;
  @FindBy(xpath = "(//*[@class='icon-box text-center'])[5]")
  public WebElement WishlistGorunurOldugu;
  @FindBy(xpath = "(//*[@class='icon-box text-center'])[6]")
  public WebElement LogoutGorunurOldugu;
  @FindBy(xpath = "//*[text()='Dashboard']")
  public WebElement Dashboard;
  @FindBy(xpath = "//*[text()='Store Manager']")
  public WebElement StoreManager;
  @FindBy(xpath = "(//*[text()='Orders'])[1]")
  public WebElement Orders;
  @FindBy(xpath = "(//*[text()='Downloads'])[1]")
  public WebElement Downloads;
  @FindBy(xpath = "(//*[text()='Addresses'])[1]")
  public WebElement Adresses;
  @FindBy(xpath = "(//*[text()='Wishlist'])[2]")
  public WebElement Wishlist;
  @FindBy(xpath = "(//*[text()='Account details'])[1]")
  public WebElement Accountdetails;
  @FindBy(xpath = "//*[text()='Support Tickets']")
  public WebElement SupportTickets;
  @FindBy(xpath = "//*[text()='Followings']")
  public WebElement Followings;
  @FindBy(xpath = "(//*[text()='Logout'])[1]")
  public WebElement LogoutDashboardAltinda;






    /*US_03(119-169 satır)*/
    //US_03 LOCATLERİ
    @FindBy(xpath = "//*[text()='Go Shop']")
    public WebElement GoShopButtonu;
    @FindBy(xpath = "//*[text()='Browse products']")
    public WebElement BrowseProductsButtonu;
    @FindBy(xpath = "//*[@id='product_cat']")
    public WebElement AllCatagoriesButtonu;

    @FindBy(xpath = "//*[@class='form-control']")
    public WebElement SearchButtonu;
    @FindBy(xpath = "//*[@class='single_add_to_cart_button button alt']")
    public WebElement AdToCartButton;

    @FindBy(xpath = "(//*[@class='w-icon-cart'])[1]")
    public WebElement SepetButtonu;

    @FindBy(xpath = "//*[@class='button checkout wc-forward']")
    public WebElement CheckoutButton;
    @FindBy(xpath = "//*[@id='billing_first_name']")
    public WebElement FirstName;
    @FindBy(xpath = "//*[@id='billing_last_name']")
    public WebElement LastName;
    @FindBy(xpath = "//*[@id='select2-billing_country-container']")
    public WebElement CountryRegion ;
    @FindBy(xpath = "//*[@id='billing_address_1']")
    public WebElement StreetAddress;
    @FindBy(xpath = "//*[@id='billing_postcode']")
    public WebElement PostcodeZIP;
    @FindBy(xpath = "//*[@id='billing_city']")
    public WebElement TownCity;
    @FindBy(xpath = "//*[@id='select2-billing_state-container']")
    public WebElement Province;
    @FindBy(xpath = "//*[@id='billing_phone']")
    public WebElement Phone;
    @FindBy(xpath = "//*[@id='billing_email']")
    public WebElement EmailAddress;
    @FindBy(xpath = "//*[@id='billing_company']")
    public WebElement CompanyButton;
    @FindBy(xpath = "//*[@id='order_comments']")
    public WebElement OrderCommentsMesaj;
    @FindBy(xpath = "//*[@id='place_order']")
    public WebElement PlaceOrderButtonu;








    /*US_04(170-220 satır)*/
// US_04 Locetleri
    @FindBy(xpath = "//*[text()='View cart']")
    public WebElement ViewCartButton;

    @FindBy(xpath = "//*[@class='cart-information']")
    public WebElement RakamMiktarVeToplamUrun;
    @FindBy(xpath = "//*[@class='quantity-plus w-icon-plus']")
    public WebElement ArtiTusu;
    @FindBy(xpath = "//*[@class='quantity-minus w-icon-minus']")
    public WebElement EksiTusu;
    @FindBy(xpath = "//*[text()='Continue Shopping']")
    public WebElement ContinueShoppingButtonu;
    @FindBy(xpath = "(//*[@class='woocommerce-LoopProduct-link woocommerce-loop-product__link'])[3]")
    public WebElement StockFazlasiUrun;
    @FindBy(xpath = "//*[text()='Update cart']")
    public WebElement UpdateCartButtonu;

    @FindBy(xpath = "//*[text()='Apply coupon']")
    public WebElement ApplyCouponButtonu;

    @FindBy(xpath = "//*[@class='woocommerce-shipping-calculator']")
    public WebElement ShoppingBilgileri;

    @FindBy(xpath = "//*[@class='woocommerce-shipping-calculator']")
    public WebElement ToplamTutar;
    @FindBy(xpath = "//*[@class='checkout-button button alt wc-forward']")
    public WebElement ProceedToCheckoutButtonu;
    @FindBy(xpath = "//*[text()='Clear cart']")
    public WebElement ClearCartButtonu;















































































































































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
