package org.Bridgelabz.example.TestngListener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@Listeners(MyTestListener.class)
public class SmapleProject {
    @Test
    public void openBrowser(){
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MICROSECONDS);

        driver.manage().window().maximize();

        driver.get("https://www.amazone.in");

        driver.close();
    }

    @Test
    public void validateMathOperation(){
        Assert.assertEquals(false,true);
    }
}
