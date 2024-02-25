package org.Bridgelabz.example.Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class ChildBrowserPopupExample2 {
    WebDriver driver;

    @Test
    public  void findSize() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.naukri.com/");
        //using getWindowHandles(), get a set of window handle IDs

        driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div[2]/nav/ul/li[1]/a/div")).click();

        Thread.sleep(2000);
        Set<String> allWindowHandles = driver.getWindowHandles();
        //using size(), get the count of total number of browser windows
        int count = allWindowHandles.size();
        System.out.println("Number of browser windows opened on the system is : " + count);
        for (String windowHandle : allWindowHandles) {
        //switch to each browser window
            driver.switchTo().window(windowHandle);
            String title = driver.getTitle();
        //print the window handle id of each browser window
            System.out.println("Window handle id of page -->" + title + " -->  is : " + windowHandle);
        //close all the browsers one by one
            driver.close();
        }
    }
}
