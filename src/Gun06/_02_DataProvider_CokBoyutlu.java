package Gun06;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _02_DataProvider_CokBoyutlu {

    @Test (dataProvider ="getData")
    void UsarnameTest(String username,String password)
    {
        System.out.println("Username="+username+password);
    }
    @DataProvider
    public Object [] [] getData()
    {
        Object [] [] data= {
                {"Ahmet", "1236954"},
                {"Göktürk", "546564"},
                {"Sungur", "564546546"},
                {"Mete", "546456"}
        };
         return data;
    }


}
