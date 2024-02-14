package com.bridgelabz.Realdevice;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class ClockTest {

    public AndroidDriver driver;

    @BeforeMethod
    public void setup() throws MalformedURLException {
        DesiredCapabilities dc= new DesiredCapabilities();
        dc.setCapability("platformName","Android");
        dc.setCapability("udid","1496de41");
        dc.setCapability("deviceName","Redmi Note 7S");
        dc.setCapability("platformVersion","10");
        dc.setCapability("appPackage","com.android.deskclock");
        dc.setCapability("appActivity","com.android.deskclock.DeskClockTabActivity");
        driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);
        System.out.println("It is Starting");
    }

    @Test
    public void  serAlarm(){
        WebElement first = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.OriginalViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.CheckBox"));
        first.click();
    }

    @Test
    public void startStopwatch(){
        WebElement first = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Timer\"]"));
        first.click();
    }

}
