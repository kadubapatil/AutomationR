package seleniumtestng;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(seleniumtestng.ListenerExample2.class)
public class ListenerExample1 {

    @Test
    public void test1(){
        System.out.println("this is test1");
        Assert.assertEquals("true","true");
    }
    @Test
    public void test2(){
        System.out.println("this is test2");
        Assert.assertEquals("true","false");
    }
    @Test
    public void tes3(){
        System.out.println("this is test3");
       throw new SkipException("this is skip test");
    }
}
