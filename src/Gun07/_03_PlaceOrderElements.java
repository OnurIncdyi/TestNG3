package Gun07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _03_PlaceOrderElements {

// Bu sayfadaki bütün elemenalrın driverlar bağlantısı gerekiyor
    // bunun için aşağıdaki consructor eklendi ve için PageFatory ile
    // driver üzerinden bu (this) sayfadaki bütün elemnalar ilşkilendirildi.
    // Böylece Sayfada dan nesne türetildiği zaman değil, kullanıldığı
    // anda elemanların bulunması aktif oluyor.Bu yöntemle bütün sayfalarda
    // aynı isimde elemanlar var ise buradaki tanımlama hepsi için geçerli hale
    // gelmiş oluyor. buna yapıya Page Object Model (POM) adı veriliyor.

    public _03_PlaceOrderElements (WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy (name="search")
    public WebElement searchBox;

    @FindBy (css = "button[onclick*='cart.add']")
    public WebElement addToCart;

    @FindBy (css = "[title='Shopping Cart']>i")
    public WebElement shoppingCartButton;

    @FindBy(linkText = "Checkout")
    public WebElement checkoutBtn;

    @FindBy(id = "button-payment-address")
    public WebElement  continue1;

    @FindBy (css = "[id='button-shipping-address']")
    public WebElement continueBtn2;

    @FindBy (css = "[id='button-shipping-method']")
    public WebElement continueBtn3;

    @FindBy(css = "[type='checkbox']")
    public WebElement check;

    @FindBy (css = "[id='button-payment-method']")
    public WebElement continueBtn4;

    @FindBy (css = "[id='button-confirm']")
    public WebElement continueBtn5;

    @FindBy(id = "button-confirm")
    public WebElement confirm;

    @FindBy (css = "[id='content']>h1")
    public WebElement h1;







}
