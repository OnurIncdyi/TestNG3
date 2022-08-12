package Gun06;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _03_DataProvider_Iterator {

    @Test(dataProvider ="getData")
    void UsarnameTest(String username)
    {
        System.out.println("Username="+username);
    }

    @DataProvider
    public Iterator<Object>  getData()
    {
        List<Object> data=new ArrayList<>();
        data.add("Ahmet");
        data.add("Gokturk");
        data.add("Ugur");
        data.add("Mete");

        return data.iterator();
    }
    /**************************************/

    @Test(dataProvider ="getData2")
    void UsarnameTest2(String username,String password)
    {
        System.out.println("Username="+username+",password="+password);
    }

    @DataProvider
    public Iterator<Object[]>  getData2()
    {
        List<Object[]> data=new ArrayList<>();
        data.add(new Object[]{"Nurhayat","975545"});
        data.add(new Object[]{"Gokturk","398455"});
        data.add(new Object[]{"Mete","892545"});
        data.add(new Object[]{"Ugur","735545"});

        return data.iterator();
    }








}
