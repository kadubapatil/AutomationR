package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kaduba\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");

        WebElement element=driver.findElement(By.className("ui-state-default"));
        WebElement element1=driver.findElement(By.className("search-expand-text"));
        Actions actions=new Actions(driver);

        actions.dragAndDrop(element,element1).perform();
        Thread.sleep(7000);


    }
}
