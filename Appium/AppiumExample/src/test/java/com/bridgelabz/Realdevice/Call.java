package com.bridgelabz.Realdevice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Call {
    public AndroidDriver driver;

    @BeforeMethod
    public void setup() throws MalformedURLException {
        DesiredCapabilities dc= new DesiredCapabilities();
        dc.setCapability("platformName","Android");
        dc.setCapability("udid","1496de41");
        dc.setCapability("deviceName","Redmi Note 7S");
        dc.setCapability("platformVersion","10");
        dc.setCapability("appPackage","com.android.contacts");
        dc.setCapability("appActivity","com.android.contacts.activities.PeopleActivity");
        driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);
        System.out.println("It is Starting");
    }

    @Test
    public void runCall(){

    }

    @Test
    public void callFirst() throws InterruptedException{
        WebElement call = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Recents\"]"));
        call.click();
        

        WebElement callFirst = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/androidx.viewpager.widget.OriginalViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]"));
        callFirst.click();
    }

    @Test
    public void callMahesh(){
        WebElement call = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Recents\"]"));
        call.click();

        WebElement search = driver.findElement(By.id("android:id/input"));
        search.click();

        WebElement input = driver.findElement(By.id("android:id/input"));
        input.sendKeys("Abhish");

        WebElement Contact  = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]"));
        Contact.click();
        

        WebElement Calling = driver.findElement(By.id("com.android.contacts:id/first_action_button"));
        Calling.click();

    }


    // @AfterMethod
    // public void endSetUp(){
    //     driver.quit();
    // }
}
