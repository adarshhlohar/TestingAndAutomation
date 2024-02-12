package org.Bridgelabz.example.Popup;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadPopup {
    WebDriver driver;

    @Test
    public void fileDownload() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://sample-videos.com/download-sample-png-image.php");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0, document.body.scrollHeight * 0.5)");

        Thread.sleep(5000);
        driver.findElement(By.xpath("//tbody/tr[1]/td[3]/a[1]")).click();

    }
}
