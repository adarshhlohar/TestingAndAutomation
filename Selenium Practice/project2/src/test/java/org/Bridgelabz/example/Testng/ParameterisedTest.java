package org.Bridgelabz.example.Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterisedTest {

    WebDriver driver;
    @Test
    @Parameters({"url","emailId"})
    public void yahooLogin(String url,String emailId){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys(emailId);

        driver.findElement(By.xpath("//input[@id='login-signin']")).click();
    }
}
