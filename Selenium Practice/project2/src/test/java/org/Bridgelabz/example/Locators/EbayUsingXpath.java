package org.Bridgelabz.example.Locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EbayUsingXpath {
    
    public WebDriver driver;
    @Test
    public void search(){
        driver = new ChromeDriver();

        driver.get("https://www.ebay.com/");;

        driver.manage().window().maximize();

        driver.findElement(By.xpath("/html/body/div[3]/div/header/table/tbody/tr/td[3]/form/table/tbody/tr/td[1]/div[1]/div/input[1]")).sendKeys("T-Shirts");

        driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();;
    }
}
