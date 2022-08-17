package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassPractice {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/Kaduba/Downloads/chromedriver_win32.zip/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();
        WebElement input1= driver.findElement(By.xpath("//textarea[@id='inputText1']"));
        WebElement input2= driver.findElement(By.xpath("//textarea[@id='inputText2']"));

        input1.sendKeys("Welcome to selenium");

        Actions actions=new Actions(driver);

        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("a");
        actions.keyUp(Keys.CONTROL);
        actions.perform();

        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("c");
        actions.keyUp(Keys.CONTROL);
        actions.perform();

        actions.sendKeys("TAB");
        actions.perform();

        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("v");
        actions.keyUp(Keys.CONTROL);
        actions.perform();


    }
}
