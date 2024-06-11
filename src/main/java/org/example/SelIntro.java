package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SelIntro {

    public static void main(String[] args)  {


        //Invoke Browser
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/src/main/java/driver/chromedriver.exe");
        //WebDriver driver = new ChromeDriver();

        System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "/src/main/java/driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://google.com");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.titleContains("Google"));
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.quit();
        driver.getPageSource();

    }

}
