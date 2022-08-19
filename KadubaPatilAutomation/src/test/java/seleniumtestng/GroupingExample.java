package seleniumtestng;

import org.testng.annotations.Test;

public class GroupingExample {

    @Test
    public void testcase1(){
        System.out.println("this is test1");
    }
    @Test(groups = {"smoke"})
    public void testcase2(){
        System.out.println("this is test2");
    }
    @Test(groups = {"sanity","smoke"})
    public void testcase3(){
        System.out.println("this is test3");
    }
    @Test(groups = {"smoke"})
    public void testcase4(){
        System.out.println("this is test4");
    }
    @Test
    public void testcase5(){
        System.out.println("this is test5");
    }
}
