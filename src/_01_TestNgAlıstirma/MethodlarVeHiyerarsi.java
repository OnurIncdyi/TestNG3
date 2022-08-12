package _01_TestNgAlıstirma;
import org.testng.annotations.*;

public class MethodlarVeHiyerarsi {

    @BeforeTest
    public void BeforeTest(){
        System.out.println("BEFORE TEST ----- \nSuite den sonra gelir.Testin başında çalışır");
    }
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("BEFORE SUİTE----- \nSuite ile başlar ilk çalışan methoddur");
    }
    @BeforeClass
    public void BeforeClass(){
        System.out.println("Before Class----- \nBefore methoddan önce Before Test ten sonra çalışan method");
    }

    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("Before Method---- \nHer Test methodundan önce , BEFORA CLASS tan sonra çalışır");
    }
    @Test
    public void Test1(){
        System.out.println("------Test1------");
    }
    @Test
    public void Test2(){

        System.out.println("-------Test2------");
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("AFTER METHOD------------------------\n+" +
                "Her test methodundan sonra çalışır.");
    }


    @AfterClass
    public void AfterClass(){

        System.out.println("AFTER CLASS -------------------------------------------------- \nClass sonunda çalışır.");
    }

    @AfterSuite
    public void AfterSuite(){

        System.out.println("AFTER SUİTE ----------------- \n Suite tamamlandıktan sonra, yani en son çalışır.");

    }

    @AfterTest
    public void AfterTest(){

        System.out.println("AFTER TEST ----------------- \n Test bittikten sonra çalışır");
    }
}
