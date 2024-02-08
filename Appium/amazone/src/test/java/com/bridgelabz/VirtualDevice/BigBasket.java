package com.bridgelabz.VirtualDevice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BigBasket {
    AndroidDriver driver;
    @BeforeMethod
    public void setUrl() throws MalformedURLException, InterruptedException {
       //        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        DesiredCapabilities capabilities = new DesiredCapabilities();

        // Set the device capabilities
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\Adarsh\\Downloads\\bigbasket-7-11-6.apk");


        // Initialize the driver
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Test
    public  void OpenBigbasket(){

    }
}
