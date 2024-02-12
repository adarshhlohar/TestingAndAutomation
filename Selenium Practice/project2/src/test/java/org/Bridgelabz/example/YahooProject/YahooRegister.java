package org.Bridgelabz.example.YahooProject;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class YahooRegister {
    WebDriver driver;

    @Test
    public void register() throws InterruptedException {
        driver = new ChromeDriver();

        driver.get("https://login.yahoo.com/account/create?.intl=us&specId=yidregsimplified&done=https%3A%2F%2Fwww.yahoo.com");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"usernamereg-firstName\"]")).sendKeys("Mahesh");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"usernamereg-lastName\"]")).sendKeys("Nehre");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"usernamereg-userId\"]")).sendKeys("maheshnehere93");
        Thread.sleep(1000);
        //Confusing for original name
        driver.findElement(By.xpath("//*[@id=\"usernamereg-password\"]")).sendKeys("Rambo@2024");
        Thread.sleep(1000);
        driver.findElement(By.id("usernamereg-month")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//select[@id='usernamereg-month']/option[text()='July']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"usernamereg-day\"]")).sendKeys("27");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"usernamereg-year\"]")).sendKeys("1994");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"reg-submit-button\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"usernamereg-phone\"]")).sendKeys("9876874576");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"reg-submit-button\"]")).click();
        Thread.sleep(2000);
    }


}
