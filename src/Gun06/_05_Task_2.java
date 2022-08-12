package Gun06;

import Utils.ParametreliWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Bir önceki task da yapılan testi PARAMETREDRIVER ile yapınız
 * sonrasında farklı tarayıcılar ile çalıştırınız.
 * sonrasında paralel çalıştırınız.
 */

public class _05_Task_2 extends ParametreliWebDriver {


    @Test (dataProvider = "getData")
    void SearchFunctionality(String txtSearch){

        WebElement search=driver.findElement(By.cssSelector("[class='form-control input-lg']"));
        search.clear();
        search.sendKeys(txtSearch);

        WebElement searchButton = driver.findElement(By.cssSelector("[class='btn btn-default btn-lg']"));
        searchButton.click();

        //h4>a kısa yolu
        List<WebElement> captions = driver.findElements(By.cssSelector("h4>a"));

        for (WebElement e : captions) {
            Assert.assertTrue(e.getText().toLowerCase().contains(txtSearch));
        }
    }
    @DataProvider
    public Object[] getData(){
        Object [] data= {"mac","ipod","samsung"};
        return data;
    }


}