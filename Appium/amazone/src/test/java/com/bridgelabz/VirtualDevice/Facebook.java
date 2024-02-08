package com.bridgelabz.VirtualDevice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Facebook {
    AndroidDriver driver;

    @BeforeMethod
    public void setUrl() throws MalformedURLException, InterruptedException {
        // driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        DesiredCapabilities capabilities = new DesiredCapabilities();

        // Set the device capabilities
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        capabilities.setCapability(MobileCapabilityType.APP,
                "C:\\Users\\Adarsh\\Downloads\\facebook-447-0-0-24-113.apk");
        capabilities.setCapability("appPackage", "com.facebook.katana");
        capabilities.setCapability("appActivity", "com.facebook.katana.LoginActivity");

        // Initialize the driver
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
    }

    @Test
    public  void OpenFacebook(){
        
    }

    /**
     * 
     */
    @Test
    public void loginFacebook() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement User = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        User.sendKeys("9356986567");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement Pass = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Password\"]"));
        Pass.sendKeys("413606");

        WebElement login = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Log in\"]"));
        login.click();
    }
}