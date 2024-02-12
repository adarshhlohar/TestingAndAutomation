
package org.Bridgelabz.example.Popup;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Set;

public class ChildBrowserPopup {
    WebDriver driver;

    @Test
    public void Browser() throws InterruptedException, AWTException {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

//        String windowHandle = driver.getWindowHandle();
//        System.out.println(windowHandle);
        String parentId = driver.getWindowHandle();
        System.out.println(parentId);


        WebElement forgotPassword = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
        Actions actions = new Actions(driver);
        Robot act = new Robot();
        actions.contextClick(forgotPassword).perform();
        act.keyPress(KeyEvent.VK_RIGHT);
        act.keyRelease(KeyEvent.VK_RIGHT);
        act.keyPress(KeyEvent.VK_ENTER);
        act.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(2000);
        Set<String> allWindow = driver.getWindowHandles();
        int count = allWindow.size();
        System.out.println(count);
        for(String ele : allWindow){
            driver.switchTo().window(ele);
            if (ele.equals(parentId)) {
                driver.close();
            }
            if (!ele.equals(parentId)){
                driver.switchTo().window(ele);
            }
        }


    }
}