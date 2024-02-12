package org.Bridgelabz.example.Popup;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class FileUploadPopup {
    WebDriver driver;

    @Test
    public  void fileUploadUsingAutoIt() throws IOException, InterruptedException {
        driver = new ChromeDriver();

        driver.get("https://smallpdf.com/pdf-converter");

        driver.findElement(By.xpath("//span[@class='sc-8s01yt-5 gGeCVP']")).click();

        Runtime.getRuntime().exec("C:\\Users\\Adarsh\\Documents\\FileUploadScript.exe");

        Thread.sleep(5000);
        driver.close();
    }

    @Test
    public void fileUploadUsingSendKeys() throws InterruptedException {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://cgi-lib.berkeley.edu/ex/perl5/fup.html");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='upfile']")).sendKeys("E:\\mahadev");

        Thread.sleep(5000);
        driver.close();

    }
}
