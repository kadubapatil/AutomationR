
package seleniumtestng;

        import org.testng.Assert;
        import org.testng.annotations.Test;

public class HardAssertExample {
    @Test
    public void method1(){
        System.out.println("Open browser");

        Assert.assertEquals(true,true);

        System.out.println("enter username");

        Assert.assertEquals(true,false);

        System.out.println("verify login");

    }
}