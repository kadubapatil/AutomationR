package com.company;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class TakeScreenshotDemo {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kaduba\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
        driver.manage().window().maximize();
        TakesScreenshot screenshot=(TakesScreenshot)driver;
      File src=  screenshot.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(src,new File("C:\\Users\\Kaduba\\OneDrive\\Camera Roll.png"));


    }
}
