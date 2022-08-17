package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.List;

public class SeleniumExample {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kaduba\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
       WebDriver driver =new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        //id
       WebElement element=driver.findElement(By.id("login1"));
       element.sendKeys("kaduba.patil@rediffmail.com");

       //name
        driver.findElement(By.name("passwd")).sendKeys("52945640Ka@");

        //classname
        driver.findElement(By.className("signinbtn")).click();

        Thread.sleep(2000);

        //LinkText
        driver.findElement(By.linkText("Logout")).click();
        Thread.sleep(3000);






    }
}
