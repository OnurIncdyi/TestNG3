package Gun03;

import org.testng.Assert;
import org.testng.annotations.Test;

/*todo
   interviewlarda sorulan bir konu : testlere öncelikleri nasıl verirsin ?
   priority, dependecy;   Nasıl kullanırsın ?
   1- priority =1 gibi sıralı rakamlar vererek bununla çalışma sırasını belirtirim.
   2- dependOnMethods : bununla kendinden önce hangi metod çalışması gerekiyor ise onu belirtirim.
     bir metodu direkt çalıştırdığınızda kendinden önce bağımlı 1  metod var ise ototmaitk onları
      önce çağırıp sonra kendisi çalışır. Fakat 2 veya daha fazla tane var ise bağımlı olduğu metod ozaman çalışamaz.

 */
public class _01_Dependency {
    @Test
    void startCar()
    {
        System.out.println("Car Started" );
    }
    @Test(dependsOnMethods = {"startCar"}) //todo bu testin çalışması startcarın hatasız çalışmasına bağımlı
    void driveCar()
    {
        System.out.println("car drive");
        Assert.fail(); // todo buraya skip durumunu görmek için
    }
    @Test(dependsOnMethods = {"startCar","driveCar"})//todo bu testin çalışması için ilk iki testin hatasız bitmesi lazım
    void parkCar()
    {
        System.out.println("car parked");
    }
    @Test(dependsOnMethods = {"parkCar"},alwaysRun = true)// todo alwaysRun =true bağımlılıkları var ama hata çıkarsa da yine çalışır
    void stopCar()
    {
        System.out.println("car stop");
    }

}