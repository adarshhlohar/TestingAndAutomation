package org.Bridgelabz.example.Actions;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MoveToElement {
    public WebDriver driver;
    @Test
    public void moveElement(){
        driver = new ChromeDriver();
        
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement A = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"sortable\"]/li[2]")));

        // WebElement A = driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[2]"));

        WebElement C = driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[4]"));

        Actions actions = new Actions(driver);

        actions.moveToElement(A);
        actions.clickAndHold();

        actions.moveToElement(C);
        actions.release().perform(); 

    }
}
