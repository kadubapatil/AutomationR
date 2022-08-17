package selenium;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class ScreenshotExample {
    public static void main(String[] args) throws InterruptedException, IOException {
        ChromeOptions options=new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kaduba\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver =new ChromeDriver(options);
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(scr, new  File("C:/Users/Kaduba/Downloads/chromedriver_win32 (1)/kaduba"));
        Thread.sleep(3000);
        driver.close();
    }
}
