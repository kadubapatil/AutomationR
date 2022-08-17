package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickExample {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kaduba\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.get("https://selenium08.blogspot.com/2019/11/double-click.html");
        Actions actions=new Actions(driver);

        actions.doubleClick(driver.findElement(By.xpath("//button[text()='Double-Click me to see Alert message']"))).perform();
        Thread.sleep(4000);
    }
}
