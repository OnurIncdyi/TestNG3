package Gun05;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/*
  1- ContactUs a tıklayınız
  2- Mesaj kutusuna en az 10 karakterlik bir mesaj yazınız.
  3- Submit ettikten sonra Contact US yazısını doğrulayınız.
 */
public class _02_ContactUs extends GenelWebDriver {

    @Test
    @Parameters ("mesaj") // XML deki adı
    void ContactUs(String gelenMesaj){
        WebElement contactUsButton= driver.findElement(By.linkText("Contact Us"));
        contactUsButton.click();

        WebElement enquiryArea=driver.findElement(By.id("input-enquiry"));
        enquiryArea.sendKeys("Merhaba Selenium");


        WebElement submitButton=driver.findElement(By.cssSelector("[value='submit']"));
        submitButton.click();

        WebElement contactUsLabel=driver.findElement(By.cssSelector("[class='col-sm-12']>h1"));
        System.out.println(contactUsLabel.getText());

        Assert.assertEquals("Contact us",contactUsLabel.getText(),"Karşılaştırma Sonucu :");
    }


}
