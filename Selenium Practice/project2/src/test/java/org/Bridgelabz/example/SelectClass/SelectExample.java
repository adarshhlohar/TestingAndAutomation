package org.Bridgelabz.example.SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SelectExample {
    WebDriver driver;
    @Test
    public void displayAll(){
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath("//form/div[5]/a")).click();
    }


}
