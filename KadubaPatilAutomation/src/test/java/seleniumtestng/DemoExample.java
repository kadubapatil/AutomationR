package seleniumtestng;

import org.testng.annotations.Test;

public class DemoExample {

    @Test(alwaysRun = true)
    public void methodD(){
        System.out.println("methodD");
    }
    {try {
        System.out.println(10/0);
    }catch (Exception e){
    e.printStackTrace();
    }
        System.out.println("Kaduba");
    }
    @Test
    public void methodC(){
        System.out.println("methodC");

    }
    @Test
    public void methodB(){
        System.out.println("methodB");
    }
    @Test
    public void methodA(){
        System.out.println("methodA");
    }
}
