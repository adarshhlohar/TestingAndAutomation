package com.bridgelabz.VirtualDevice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class AmazoneVirtualApk {
     AndroidDriver driver;

    @BeforeMethod
    public void setUrl() throws MalformedURLException, InterruptedException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformName","Android");
        cap.setCapability("deviceName","emulator-5554");
        cap.setCapability("platformVersion", "9.0");
        cap.setCapability("app", "C:\\Users\\Adarsh\\Downloads\\amazon.apk");
        // cap.setCapability("appActivity", "com.amazon.mShop.android.shopping");
        // cap.setCapability("appPackage", "com.amazon.mShop.home.HomeActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        Thread.sleep(20000);
    }

    @Test
    public void runAmazonApk(){

    }

}
