package Gun07;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _01_SoftAssertVsHardAssert {


    @Test
    void hardAssert(){
        String s1="Merhaba";

        System.out.println("Hard ssert öncesi");
        Assert.assertEquals("Merhaba 123 ",s1,"HardAssert Sonucu");
        System.out.println("Hard assert sonrası "); // hard assert hata verdiğinnde sonrası çalışmaz

    }

    @Test
    void softAssert(){
        String strHomePage="www.facebook.com/homepage";
        String strCartPage="www.facebook.com/homepage";
        String strEditAccount="www.facebook.com/homepage";

        SoftAssert _softAssert=new SoftAssert();
        _softAssert.assertEquals("www.facebook.com/homepage",strHomePage);// true
        System.out.println("assert 1 ");

        _softAssert.assertEquals("www.facebook.com/homepage",strCartPage);// fail
        System.out.println("assert 2 ");

        _softAssert.assertEquals("www.facebook.com/homepage",strEditAccount);// fail
        System.out.println("assert 3 ");

        _softAssert.assertAll(); // butun assert sonuclarını işleme koyuyor
        System.out.println("Aktifliik sonrası"); // bu bolum assertAll dan sonra oldugu ve oncesınde hata oluştugu için
        // yazılamadı



    }







}
