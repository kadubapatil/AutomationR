package seleniumtestng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
    @Test(dataProvider = "gmail account details provider")

    public void method1(String email,String password)
    {
        System.out.println(email+"   "+password);
    }
    @DataProvider(name = "gmail account details provider")
    public Object[][] getdata()
    {
        Object[][] data={{"kaduba.patil@gmail.com","abc"},{"xyz@gmail.com","ksp"}};
        return data;
    }
}
