package Gun03;
/*
   TODO    Senaryo;
       1- Siteyi açınız.
       2- Adress Ekleyiniz.
       3- En son eklenen adresi edit yaparak ad ve soyadı değiştirip kaydediniz.
       4- En son eklenen adresi siliniz.

 */


import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class _02_AddressFunctionality extends GenelWebDriver {



    By adressBookBtn=By.linkText("Address Book");
    By newAdressBtn=By.cssSelector("[class='btn btn-primary']");
    By firstName=By.cssSelector("[id='input-firstname']");
    By lastName=By.xpath("//*[@id='input-lastname']");
    By company=By.xpath("//*[@name='company'and @id='input-company']");
    By adressOne=By.xpath("//input[@id='form-control' or @placeholder='Address 1']");
    By adressTwo=By.xpath("//input[@name= 'address_2'or @placeholder='Address 2']");
    By city=By.cssSelector("[name='city'][id='input-city']");
    By postCode=By.cssSelector("[id='input-postcode']");
    By country=(By.cssSelector("[value='215']"));
    By region=By.cssSelector("[value='3513']");
    By defaultAddress=By.cssSelector("[type='radio'][name='default'][value='1']");

    By continueBtn=(By.cssSelector("[type='submit'][value='Continue']"));
    @Test
    void AdressTest()
    {

        WebElement adress=driver.findElement(adressBookBtn);
        adress.click();

        WebElement newAdress=driver.findElement(newAdressBtn);
        newAdress.click();

        WebElement firstnm=driver.findElement(firstName);
        firstnm.sendKeys("Onur");

        WebElement lstnme=driver.findElement(lastName);
        lstnme.sendKeys("ncdyi");

        WebElement cmpn=driver.findElement(company);
        cmpn.sendKeys("globalsatis");

        WebElement adrsOne=driver.findElement(adressOne);
        adrsOne.sendKeys("Turkey");

        WebElement adrsTwo=driver.findElement(adressTwo);
        adrsTwo.sendKeys("Kagıthane");

        WebElement cityOne=driver.findElement(city);
        cityOne.sendKeys("Istanbul");

        WebElement postcd=driver.findElement(postCode);
        postcd.sendKeys("34415");

//        WebElement cntry=driver.findElement(country);
//        cntry.click();
//
//        WebElement rgn=driver.findElement(region);
//        rgn.click();

        WebElement country=driver.findElement(By.id("input-country"));
        Select countryS=new Select(country);
        countryS.selectByVisibleText("Turkey");

        wait.until(ExpectedConditions.elementToBeClickable(country));
       // wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.cssSelector("select[id='input-zone']>option"))));
        //bu elemanın bayatlamış hali gidene kadar bekle

        WebElement State=driver.findElement(By.id("input-zone"));
        Select state=new Select(State);
        state.selectByVisibleText("Samsun");


        WebElement dflt=driver.findElement(defaultAddress);
        dflt.click();

        WebElement cntbtn=driver.findElement(continueBtn);
        cntbtn.click();

        Tools.successMessageValidation();



    }
    @Test (dependsOnMethods = {"addAddress"})
    void editAddress(){

        WebElement addressBook= driver.findElement(By.linkText("Address Book"));
        addressBook.click();

        List<WebElement> editAll=driver.findElements(By.linkText("Edit"));
        WebElement sonEdit=editAll.get(editAll.size()-1);// sonuncu edit
        System.out.println("editAll = " + editAll.size());
        sonEdit.click();

        WebElement firstName=driver.findElement(By.id("input-firstname"));
        firstName.clear();
        firstName.sendKeys("Onur");

        WebElement lastName=driver.findElement(By.id("input-lastname"));
        lastName.clear();
        lastName.sendKeys("ıncdyi");

        WebElement ctn=driver.findElement(By.cssSelector("input[type='submit']"));
        ctn.click();

        Tools.successMessageValidation();
    }
    @Test(dependsOnMethods = {"editAddress"})
    void deleteAddress(){
        WebElement addressBook= driver.findElement(By.linkText("Address Book"));
        addressBook.click();

        List<WebElement> deleteAll=driver.findElements(By.linkText("Delete"));
        WebElement sonDelete=deleteAll.get(deleteAll.size()-2);// sonuncu edit
  //      System.out.println("editAll = " + editAll.size()); yazmaya gerek yok çalışıyor
        sonDelete.click();

        Tools.successMessageValidation();

    }

}
        /*
  TODO
              WebElement country=driver.findElement(By.id("input-country"));
       Select countryS=new Select(country);
       countryS.selectByIndex(10);
       WebElement State=driver.findElement(By.id("input-zone"));
       Select state=new Select(State);
       System.out.println("state.getOptions().size() 1 = " + state.getOptions().size());
       wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.cssSelector("[id='input-zone']>option"),
                   state.getOptions().size()));
       // option ların sayısı ilk halinden küçük olana kadar bekle : yeni durum gelene kadar bekle
       System.out.println("state.getOptions().size() 2 = " + state.getOptions().size());
       State=driver.findElement(By.id("input-zone"));
       state=new Select(State);
       System.out.println("state.getOptions().size() = " + state.getOptions().size());
       for(WebElement e: state.getOptions())
           System.out.println(e.getText());
       state.selectByIndex(3);
       */

