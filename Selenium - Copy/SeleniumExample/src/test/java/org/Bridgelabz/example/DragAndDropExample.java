package org.Bridgelabz.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {
    public WebDriver driver;
    @Test
    public void dragNDrop(){
        driver = new ChromeDriver();

        driver.get("https://demo.guru99.com/test/drag_drop.html");

        driver.manage().window().maximize();

        
        WebElement from1 = driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[5]/a"));

        WebElement to1 = driver.findElement(By.xpath("//*[@id=\"bank\"]"));

        Actions act = new Actions(driver);

        act.dragAndDrop(from1, to1).build().perform();

        WebElement from2 = driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));

        WebElement to2 = driver.findElement(By.xpath("//*[@id=\"loan\"]"));

        act.dragAndDrop(from2, to2).build().perform();

        WebElement from3 = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));

        WebElement to3 = driver.findElement(By.xpath("//*[@id=\"amt7\"]"));

        act.dragAndDrop(from3, to3).build().perform();

        WebElement from4 = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));

        WebElement to4 = driver.findElement(By.xpath("//*[@id=\"amt8\"]"));

        act.dragAndDrop(from4, to4).build().perform();
    }
}
