package org.Bridgelabz.example.iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IframeDemo {
    WebDriver driver;
    @Test
    public void iframe() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("//D://TestingAndAutomation//Selenium Practice//project2//src//test//java//org//Bridgelabz//example//HTMLPages//Page2.html");

        //Using a index of the frame
        driver.switchTo().frame(0);
        driver.findElement(By.id("t1")).sendKeys("hello");
        driver.switchTo().defaultContent();
        driver.findElement(By.id("t2")).sendKeys("page2" );
        Thread.sleep(2000);
        driver.close();

        Thread.sleep(3000);

    }}