package ProjectDays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements {




    public Elements (WebDriver driver){
        PageFactory.initElements(driver,this);

    }

    @FindBy (linkText = "Log in")
    public WebElement LoginLink;

    @FindBy(id="Email")
    public WebElement email;

    @FindBy(id="Password")
    public WebElement password;

    @FindBy (css = "[class='button-1 login-button']")
    public WebElement logInBtn;

    @FindBy (css = "[class='validation-summary-errors']>span")
    public WebElement assertLogin;

    @FindBy (css = "[onclick*='addproducttocart/catalog/31/1/1']")
    public WebElement addTocardOne ;

    @FindBy (linkText = "Shopping cart")
    public WebElement shoppingCartButn;

    @FindBy (xpath = "//input[@id='termsofservice']")
    public WebElement checkBox;

    @FindBy (xpath = "//button[@id='checkout']")
    public WebElement checkout;

    @FindBy (xpath = "//input[@onclick='Billing.save()']")
    public WebElement continue1;

    @FindBy (css = "[class='button-1 new-address-next-step-button'][onclick='Shipping.save()']")
    public WebElement continue2;

    @FindBy (css = "[class='button-1 shipping-method-next-step-button']")
    public WebElement continue3;

    @FindBy (css = "[class='button-1 payment-method-next-step-button']")
    public WebElement continue4;

    @FindBy (css = "[class='button-1 payment-info-next-step-button']")
    public WebElement continue5;

    @FindBy (css = "[class='button-1 confirm-order-next-step-button']")
    public WebElement confirm;

    @FindBy (css="[class='title']>strong")
    public WebElement lastAssert;










}
