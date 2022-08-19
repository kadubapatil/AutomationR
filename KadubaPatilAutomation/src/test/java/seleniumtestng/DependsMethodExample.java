package seleniumtestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsMethodExample {
    @Test(groups = "Digital")
    public void methodD(){
        System.out.println("methodD");
        Assert.assertFalse(true);
    }
    @Test(dependsOnGroups = "Digital")
    public void methodC(){
        System.out.println("methodC");
    }
    @Test(dependsOnMethods = "methodC")
    public void methodB(){
        System.out.println("methodB");
    }
    @Test
    public void methodA(){
        System.out.println("methodA");
    }
}
