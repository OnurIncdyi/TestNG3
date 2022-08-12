package Gun05;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

/*
  Senaryo ;
          1- Siteyi açınız.
          2- mac kelimeini göndererek aratınız.
          3- Çıkan sonuçlarda mac kelimesinin geçtiğini doğrulayınız.
          4- aynı işlemi samsung için de yapınız
          */
public class _03_SearchFunctionality extends GenelWebDriver {

    @Parameters("arananKelime")
    @Test
    void SearchFunctionality(String txtSearch){

        WebElement search=driver.findElement(By.cssSelector("[class='form-control input-lg']"));
        search.sendKeys(txtSearch);

        WebElement searchButton = driver.findElement(By.cssSelector("[class='btn btn-default btn-lg']"));
        searchButton.click();

        //h4>a kısa yolu
        List<WebElement> captions = driver.findElements(By.cssSelector("h4>a"));

        for (WebElement e : captions) {
            Assert.assertTrue(e.getText().toLowerCase().contains("mac"));
        }


    }
}
