package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args)throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kaduba\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");

        System.out.println(driver.findElement(By.id("disabled-button")).isEnabled());
        System.out.println(driver.findElement(By.id("enabled-button")).isEnabled());

        WebElement element=driver.findElement(By.id("show-textbox"));
        WebElement element1=driver.findElement(By.id("hide-textbox"));

        WebElement element2=driver.findElement(By.id("displayed-text"));
        System.out.println(driver.findElement(By.id("show-textbox")).isDisplayed());
        Thread.sleep(4000);
        driver.close();
    }
}
