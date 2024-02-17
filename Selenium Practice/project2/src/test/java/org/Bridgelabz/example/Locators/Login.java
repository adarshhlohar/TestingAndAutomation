package org.Bridgelabz.example.Locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
    public WebDriver driver;
    @Test
    public  void login(){
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("9356986567");
        driver.findElement(By.id("pass")).sendKeys("413606");
        driver.findElement(By.name("login")).click();
    }


}
