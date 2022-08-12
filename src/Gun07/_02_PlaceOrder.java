package Gun07;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class _02_PlaceOrder extends GenelWebDriver {

/*
   Senaryo :
   1- Siteyi açınız.
   2- Sitede "ipod" kelimesini aratınız
   3- Çıkan sonuçlardan ilkini sepete atınız.
   4- Shopping Chart a tıklatınız.
   5- Checkout yapınız.
   6- Continue butonalarına tıklatıp bilgileri giriniz.
   7- En confirm ile siparişi verdiğinizi doğrulayınız.
      doğrulamayı çıkan sayfadaki "Your order has been placed" yazısı ile yapınız.
*/

    @Test
    void ProceedToCheckout()  {

        // TODO : maximize olmadan sağlıklı çalışması araştıralack

        _03_PlaceOrderElements elements=new _03_PlaceOrderElements(driver);

        driver.manage().window().maximize();  // açılan sekmeyi büyüttük

       elements.searchBox.sendKeys("ipod"); // aramaya ipod kelimesi gönderdik
       elements.searchBox.sendKeys(Keys.ENTER);  // ipod yazıldı ve enter yaptık
       elements.addToCart.click();
       elements.shoppingCartButton.click();
       elements.checkoutBtn.click();

       wait.until(ExpectedConditions.elementToBeClickable(elements.continue1)).click();
       wait.until(ExpectedConditions.elementToBeClickable(elements.continueBtn2)).click();
       wait.until(ExpectedConditions.elementToBeClickable(elements.continueBtn3)).click();
       wait.until(ExpectedConditions.elementToBeClickable(elements.check)).click();
       wait.until(ExpectedConditions.elementToBeClickable(elements.continueBtn4)).click();
       wait.until(ExpectedConditions.elementToBeClickable(elements.continueBtn5)).click();
       elements.confirm.click();

       wait.until(ExpectedConditions.urlContains("success"));
       Assert.assertEquals(elements.h1.getText(),"Your order has been placed!","Karşılaştırma Sonucu : ");

    }
}
