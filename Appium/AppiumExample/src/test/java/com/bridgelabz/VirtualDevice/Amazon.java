package com.bridgelabz.VirtualDevice;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;

public class Amazon {

    public AndroidDriver driver;

    @BeforeMethod
    public void setUrl() throws MalformedURLException, InterruptedException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        cap.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
        cap.setCapability("chromedriverExecutable", "C:\\Users\\Adarsh\\Downloads\\chromedriver_win32\\chromedriver.exe");
        cap.setCapability("chomeOptions", Collections.singletonMap("w3c",false));
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        Thread.sleep(20000);
    }

    @Test
    public void amazonApp() throws InterruptedException {
        driver.get("https://www.amazone.com");
        Thread.sleep(6000);
        WebElement element = driver.findElement(By.name("k"));
        element.sendKeys("Iphone");
        element.click();
    }
}