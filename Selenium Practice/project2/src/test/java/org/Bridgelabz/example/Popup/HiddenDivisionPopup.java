package org.Bridgelabz.example.Popup;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HiddenDivisionPopup {
    WebDriver driver;
    @Test
    public void findDate() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement calender = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[3]/div[1]/app-main-page[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-jp-input[1]/div[1]/form[1]/div[2]/div[2]/div[1]/p-calendar[1]/span[1]/input[1]"));
        calender.click();

        WebElement date = driver.findElement(By.xpath("(//a[text()='21'])[1]"));
        date.click();
    }
}
