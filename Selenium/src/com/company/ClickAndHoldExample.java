package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kaduba\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
        WebElement element=driver.findElement(By.xpath("//li[text()='B']"));
        WebElement Element=driver.findElement(By.xpath("//li[text()='J']"));
        Actions actions=new Actions(driver);
        actions.clickAndHold(element).perform();
        actions.moveToElement(Element).perform();
        Thread.sleep(4000);
    }
}
