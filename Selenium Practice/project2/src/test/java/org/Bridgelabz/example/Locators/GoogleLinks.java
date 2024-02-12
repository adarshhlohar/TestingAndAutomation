package org.Bridgelabz.example.Locators;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLinks {
    public WebDriver driver;

    @Test
    public void displayLink(){
        driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();

        List<WebElement> list = driver.findElements(By.tagName("a"));
        System.out.println(list.size());

        for(WebElement ele : list){
            System.out.println(ele.getText());
        }
    }
}
