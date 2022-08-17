package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {
    public static void main(String[] args)throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kaduba\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        driver.manage().window().maximize();
        JavascriptExecutor js=(JavascriptExecutor)driver;
        Thread.sleep(3000);
        js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.id("mousehover")));
        Thread.sleep(3000);
        driver.quit();

    }
}
