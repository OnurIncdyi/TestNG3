package ProjectDays;

import Utils.GenelWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Senaryo1 extends GenelWebDriver {


//    SENARYO 1 | Giriş İşlevsellik Testi - Olumlu Senaryo:
//            -Giriş sayfasına gitmeli ve geçerli kimlik bilgileriyle giriş yapmayı denemelisiniz.
//            -Beklenen Sonuç başarıyla giriş yapıldı!

    @Test (priority = 1)
    void Senaryo1(){


        Elements e= new Elements(driver);

        e.LoginLink.click();
        wait.until(ExpectedConditions.visibilityOf(e.email)).sendKeys("technostudygrup16@gmail.com");
        wait.until(ExpectedConditions.visibilityOf(e.password)).sendKeys("123456");
        wait.until(ExpectedConditions.visibilityOf(e.logInBtn)).click();
    }

    /*SENARYO 2 | Oturum Açma İşlevsellik Testi - Negatif Senaryo:
            -Giriş sayfasına gitmeli ve geçersiz kimlik bilgileriyle giriş yapmayı denemelisiniz.
            -Beklenen Sonuç “Giriş başarısız. Lütfen hataları düzeltip tekrar deneyin.
● Müşteri hesabı bulunamadı” mesajı görüntülenmelidir. Bu mesajı doğrulayın
    görüntülenir ve metni doğrular. */

    @Test (priority = 2)
    void Senaryo2(){

        Elements e=new Elements(driver);

        e.LoginLink.click();
        wait.until(ExpectedConditions.visibilityOf(e.email)).sendKeys("tep16@gmail.com");
        wait.until(ExpectedConditions.visibilityOf(e.password)).sendKeys("123456");
        wait.until(ExpectedConditions.visibilityOf(e.logInBtn)).click();

        Assert.assertEquals(e.assertLogin.getText(),
                "Login was unsuccessful. Please correct the errors and try again.");

    }
   /* SENARYO 3 - Sipariş Ver:
            -Web sitesine gitmeli ve hesabınıza giriş yapmalısınız.
-Ana Sayfadan ürün seçip sepete eklemelisiniz.
            -Ödeme işlemini tamamlamanız gerekir
-Sonunda aşağıdaki başarı mesajını doğrulamanız gerekir! "Siparişiniz alındı */

    @Test (priority = 3)
    void Senaryo3(){


        Elements e= new Elements(driver);

        e.LoginLink.click();
        wait.until(ExpectedConditions.visibilityOf(e.email)).sendKeys("technostudygrup16@gmail.com");
        wait.until(ExpectedConditions.visibilityOf(e.password)).sendKeys("123456");
        wait.until(ExpectedConditions.visibilityOf(e.logInBtn)).click();

        wait.until(ExpectedConditions.visibilityOf(e.addTocardOne)).click();
        wait.until(ExpectedConditions.visibilityOf(e.shoppingCartButn)).click();
        wait.until(ExpectedConditions.visibilityOf(e.checkBox)).click();
        wait.until(ExpectedConditions.visibilityOf(e.checkout)).click();
        wait.until(ExpectedConditions.visibilityOf(e.continue1)).click();
        wait.until(ExpectedConditions.visibilityOf(e.continue2)).click();
        wait.until(ExpectedConditions.visibilityOf(e.continue3)).click();
        wait.until(ExpectedConditions.visibilityOf(e.continue4)).click();
        wait.until(ExpectedConditions.visibilityOf(e.continue5)).click();
        wait.until(ExpectedConditions.visibilityOf(e.confirm)).click();

        wait.until(ExpectedConditions.urlContains("checkout/completed/"));

        Assert.assertEquals(e.lastAssert.getText(),"Your order has been successfully processed!");















    }
}
