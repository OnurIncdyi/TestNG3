package Gun06;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Daha önceki derslerde yaptğımı Search fonksiyonunu
 * Mac,ipod ve samsung için Dataprovider ile yapınız.
 */
public class _04_Task extends GenelWebDriver {


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
