package Gun01;

import org.testng.annotations.*;

public class _02_Annotations {

    /*
         @BeforeClass --> // Her class çalışıyorken önce burası çalışır
           @BeforeMetod --> // Her metoddan(test metod) önce çalışır
              @Test     -->  testlerin çalıştığı metodlar
              @Test     -->  testlerin çalıştığı metodlar
           @AfterMetod --> // Her metoddan(test metod) sonra çalışır
         @AfterClass --> // Her class çalışıyorken sonra burası çalışır
     */

    @BeforeClass
    void beforeClass (){
        System.out.println("Her class dan önce çalışacak : Before Class");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("Her test method dan ÖNCE çalışacak : Before Method");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("Her test method dan sonra çalışacak : After Method");
    }
    @AfterClass
    void afterClass() {
        System.out.println("Her class dan önce çalışacak : After Class");
    }

    @Test
    void test1(){
        System.out.println("Test 1 çalıştı");
    }
    @Test
    void test2(){
        System.out.println("Test 2 çalıştı");
    }









}
