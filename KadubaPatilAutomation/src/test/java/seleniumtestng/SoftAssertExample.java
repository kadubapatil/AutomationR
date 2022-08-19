package seleniumtestng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
    @Test
    public void method1(){
        SoftAssert softAssert=new SoftAssert();
        System.out.println("Open browser");

        Assert.assertEquals(true,true);

        System.out.println("enter username");


        System.out.println("Hello");
        System.out.println("How are you");

        softAssert.assertEquals(true,false);    //Soft Assert
        System.out.println("Good morning");

        System.out.println("Good Night");

        System.out.println("Facebook");
        System.out.println("Gmail Account");



    }
}
