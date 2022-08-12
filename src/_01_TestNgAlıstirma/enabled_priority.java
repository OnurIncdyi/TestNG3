package _01_TestNgAlıstirma;

import org.testng.annotations.Test;

public class enabled_priority {

    /*TODO priority sayesinde testlerimi istediğim sıraya koyabilirim
         ENABLED : Hangi test methodunun yanına eklersem o method görmezden gelinir. konsoldo çıktı olarak bize gösterilmez
     */

    @Test(priority = 1002)
    public void a(){
        System.out.println("a");
    }
    @Test(priority = 5,enabled = false)
    public void b(){
        System.out.println("b");
    }
    @Test(priority = 1000)
    public void c(){
        System.out.println("c");
    }
}
