package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickExample {
    public static void main(String[] args)throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kaduba\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.flipkart.com/");

        WebElement element=driver.findElement(By.className("_1_3w1N"));
        Actions actions=new Actions(driver);

        actions.moveToElement(element).click().perform();
        driver.close();
        Thread.sleep(5000);
    }
}
