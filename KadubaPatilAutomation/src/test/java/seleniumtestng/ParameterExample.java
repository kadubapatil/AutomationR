package seleniumtestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {
    @Parameters({"Browser"})
    @Test(priority = 1)
    public void method(String Browser){
        if (Browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Kaduba\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
            WebDriver driver=new ChromeDriver();

        }else if (Browser.equals("edge")){
            WebDriver driver=new EdgeDriver();

            driver.get("https://www.facebook.com/");

        }
    }




}
