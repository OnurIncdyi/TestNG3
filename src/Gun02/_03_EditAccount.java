package Gun02;

/*
      1- Siteyi açınız.
      2- Edit Account a tıklatınız.
      3- Yeni isim ve soyisim göndererek Continue yapınız.
      4- İşlem sonucunu kontrol ediniz.
      5- Bu işlemi 2 kez çalıştırarak eski haline getiriniz.
     */

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.print.DocFlavor;

public class _03_EditAccount extends GenelWebDriver {

    By editAccount=By.linkText("Edit Account");
    By firstName=By.id("input-firstname");
    By lastName=By.id("input-lastname");
    By continueButton=By.cssSelector("[type='submit']");

    @Test
    void editAccount (){

        EditAccount("onur","ıncedayi");
        Tools.Bekle(2);
        //Bekle
        EditAccount("Onur","Incedayi");
    }
    void EditAccount(String ad, String soyad){
        WebElement editAccountClick = driver.findElement(editAccount);
        editAccountClick.click();

        WebElement firstNameEdit=driver.findElement(firstName);
        firstNameEdit.clear();
        firstNameEdit.sendKeys(ad);

        WebElement lastNameEdit=driver.findElement(lastName);
        lastNameEdit.clear();
        lastNameEdit.sendKeys(soyad);

        WebElement continueClick=driver.findElement(continueButton);
        continueClick.click();

        Tools.successMessageValidation();  // DOĞRULAMA yeri
    }
}
