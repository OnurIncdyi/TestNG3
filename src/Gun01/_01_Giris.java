package Gun01;

import org.testng.annotations.Test;


public class _01_Giris {



    // Eğer test metodlarına sıralama verilmezse alfabetik sırasına göre çalışır

    @Test (priority= 1)  // verdiğimiz sıraya göre test yapılıyor (annotaion lar)
    void webSitesiniAc(){
        System.out.println("Driver tanımlandı ve web sitesi açıldı.");
    }
    @Test (priority= 2)// verdiğimiz sıraya göre test yapılıyor (annotaion lar)
    void loginTestIsleminiYap(){
        System.out.println("Login test işlemleri yapıldı");
    }
    @Test (priority= 3) // verdiğimiz sıraya göre test yapılıyor (annotaion lar)
    void driverKapat(){
        System.out.println("driver kapatıldı ve çıkıldı");
        // yeşil tik hatalı assertion yok demektir.
    }

}
