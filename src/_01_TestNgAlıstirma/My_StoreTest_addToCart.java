package _01_TestNgAlıstirma;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import javax.swing.*;

public class My_StoreTest_addToCart {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\onuri\\IdeaProjects\\TestNG3\\drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.tutorialsninja.com/demo/index.php?route=common/home");

        WebElement textArea=driver.findElement(By.cssSelector("input[name='search']"));
        textArea.sendKeys("iphone");
        textArea.sendKeys(Keys.ENTER);

        WebElement list=driver.findElement(By.cssSelector("#list-view"));
        list.click();

        WebElement addToCartButton=driver.findElement(By.cssSelector("button[onclick*='cart']"));
        addToCartButton.click();

        Thread.sleep(1000);

        WebElement alert=driver.findElement(By.cssSelector(".alert-success"));
        System.out.println(alert.getText());
        System.out.println("Test 1 geçmiştir");

        String myAlert="Success: You have added iPhone to your shopping cart!\n" +
                "×";

      //1.yol
        Assert.assertEquals(myAlert,alert.getText());

        Assert.assertTrue(alert.getText().contains("Success: You have added"));
        System.out.println("Test 2 geçmiştir");

        WebElement cartButton=driver.findElement(By.cssSelector("#cart-total"));
        cartButton.click();

        WebElement totalPrice=driver.findElement(By.cssSelector(".table.table-bordered >tbody>:last-of-type>:last-of-type"));
        System.out.println(totalPrice.getText());

        String myTotal="$123.20";

        Assert.assertEquals(myTotal,totalPrice.getText());

        System.out.println("fiyat karta yansımıştır..");


        Thread.sleep(3000);

        WebElement removeButton=driver.findElement(By.xpath("//Button[@title='Remove']"));
        removeButton.click();

        Thread.sleep(2000);
        WebElement cartButton2=driver.findElement(By.cssSelector("div#cart>button"));
        cartButton2.click();

        WebElement removeMessage=driver.findElement(By.cssSelector("p.text-center"));
        System.out.println(removeMessage.getText());

        Assert.assertTrue(removeMessage.getText().contains("empty"));
        System.out.println("kartınız boş");

        Thread.sleep(3000);
        System.out.println("Tüm Testler Başarılı Tebrikler");
        driver.quit();











    }




}
