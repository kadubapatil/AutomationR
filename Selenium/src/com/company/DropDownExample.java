package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kaduba\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
        WebElement drpdown=driver.findElement(By.name("Month"));

        Select select=new Select(drpdown);

        select.selectByIndex(5);
        select.selectByIndex(3);

        Thread.sleep(2000);

        select.selectByValue("Jan");
        select.selectByValue("Feb");

        Thread.sleep(3000);

        select.selectByVisibleText("July");
        select.selectByVisibleText("November");


        Thread.sleep(3000);
        driver.close();


    }
}
