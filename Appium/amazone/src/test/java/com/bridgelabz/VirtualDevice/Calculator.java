package com.bridgelabz.VirtualDevice;


import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Calculator {

    public AndroidDriver driver;

    @BeforeMethod
    public void setup() throws MalformedURLException {
        DesiredCapabilities dc= new DesiredCapabilities();
        dc.setCapability("platformName","Android");
        dc.setCapability("deviceName","emulator-5554");
        dc.setCapability("platformVersion","9.0");
        dc.setCapability("appPackage","com.android.calculator2");
        dc.setCapability("appActivity","com.android.calculator2.Calculator");
        driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);
        System.out.println("It is Starting");
    }

    @Test
    public void addition(){
        WebElement one=driver.findElement(By.id("com.android.calculator2:id/digit_3"));
        one.click();

        WebElement add = driver.findElement(By.id("com.android.calculator2:id/op_add"));
        add.click();

        WebElement two = driver.findElement(By.id("com.android.calculator2:id/digit_6"));
        two.click();

        WebElement equal = driver.findElement(By.id("com.android.calculator2:id/eq"));

        equal.click();
    }

    @Test
    public void substraction() {
        WebElement one = driver.findElement(By.id("com.android.calculator2:id/digit_3"));
        one.click();

        WebElement sub = driver.findElement(By.id("com.android.calculator2:id/op_sub"));
        sub.click();

        WebElement two = driver.findElement(By.id("com.android.calculator2:id/digit_6"));
        two.click();

        WebElement equal = driver.findElement(By.id("com.android.calculator2:id/eq"));

        equal.click();
    }

    @Test
    public void divide(){
        WebElement one = driver.findElement(By.id("com.android.calculator2:id/digit_6"));
        one.click();

        WebElement divide = driver.findElement(By.id("com.android.calculator2:id/op_div"));
        divide.click();

        WebElement two = driver.findElement(By.id("com.android.calculator2:id/digit_3"));
        two.click();

        WebElement equal = driver.findElement(By.id("com.android.calculator2:id/eq"));
        equal.click();
    }

    @Test
    public void multiply(){
        WebElement one = driver.findElement(By.id("com.android.calculator2:id/digit_6"));
        one.click();

        WebElement multiply = driver.findElement(By.id("com.android.calculator2:id/op_mul"));
        multiply.click();

        WebElement two = driver.findElement(By.id("com.android.calculator2:id/digit_3"));
        two.click();

        WebElement equal = driver.findElement(By.id("com.android.calculator2:id/eq"));
        equal.click();
    }

} 