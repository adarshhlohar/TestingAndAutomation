package org.Bridgelabz.example.Popup;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptPopups {
    WebDriver driver;

    @Test
    public void alertPopup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();

        Thread.sleep(2000);
        WebElement alertButton = driver.findElement(By.id("alertButton"));
        alertButton.click();

        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
    }

    @Test
    public  void alertSomeTime() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();

        Thread.sleep(2000);
        WebElement alertButton = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
        alertButton.click();

        Thread.sleep(6000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    @Test
    public  void confirmBox() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();

        Thread.sleep(1000);
        WebElement alertButton = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/div[2]/button"));
        alertButton.click();
        Thread.sleep(1000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    @Test
    public void promptBox() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();

        Thread.sleep(1000);
        WebElement alertButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[4]/div[2]/button[1]"));
        alertButton.click();

        Thread.sleep(1000);
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Hello");
        Thread.sleep(2000);
        alert.accept();
    }
}
