package com.bridgelabz.VirtualDevice;




import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class AmazoneNew {
    public AndroidDriver driver;
    @BeforeMethod
    public void setUrl() throws MalformedURLException, InterruptedException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("automationName", "UIAutomator2");
        cap.setCapability("app", "C:\\Users\\Adarsh\\Downloads\\Junit\\Appium\\src\\test\\java\\com\\bridgelabz\\resources\\com.amazon.mShop.android.shopping_v26.23.2.100-1241261210_Android-9.0.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        Thread.sleep(20000);
    }

    /*
    Adding An element in cart and see its added or not
     */
    @Test
    public void addToCart() throws InterruptedException {
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("com.amazon.mShop.android.shopping:id/skip_sign_in_button")).click();

        driver.findElement(By.id("com.amazon.mShop.android.shopping:id/chrome_search_hint_view")).click();

        driver.findElement(By.id("com.amazon.mShop.android.shopping:id/rs_search_src_text")).sendKeys("Iphone");

        driver.pressKey(new KeyEvent(AndroidKey.ENTER));

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View[4]/android.view.View[4]")).click();




//        String text = "Add to Cart";
//        String scrollCommand = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + text + "\"))";
//        driver.findElement(MobileBy.AndroidUIAutomator(scrollCommand));


        TouchAction touchAction = new TouchAction(driver);
        int screenWidth = driver.manage().window().getSize().getWidth();
        int screenHeight = driver.manage().window().getSize().getHeight();

        int startXPx = (int) (0.5 * screenWidth);
        int startYPx = (int) (0.8 * screenHeight);

        int endXPx = (int) (0.5 * screenWidth);
        int endYPx = (int) (0.2 * screenHeight);

        touchAction.press(PointOption.point(startXPx, startYPx))
                .moveTo(PointOption.point(endXPx, endYPx))
                .release()
                .perform();

        Thread.sleep(2000);
        touchAction.press(PointOption.point(startXPx, startYPx))
                .moveTo(PointOption.point(endXPx, endYPx))
                .release()
                .perform();
        Thread.sleep(2000);

        touchAction.press(PointOption.point(startXPx, startYPx))
                .moveTo(PointOption.point(endXPx, endYPx))
                .release()
                .perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.Button[@resource-id='add-to-cart-button']")).click();

        driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Cart 1 item Tab 3 of 4\"]/android.widget.ImageView")).click();
    }

    @Test
    public void addToFavorate() throws InterruptedException {
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("com.amazon.mShop.android.shopping:id/skip_sign_in_button")).click();

        driver.findElement(By.id("com.amazon.mShop.android.shopping:id/chrome_search_hint_view")).click();

        driver.findElement(By.id("com.amazon.mShop.android.shopping:id/rs_search_src_text")).sendKeys("Nothing Ear 2 wireless earbirds");

        driver.pressKey(new KeyEvent(AndroidKey.ENTER));

        driver.findElement(By.xpath("//android.view.View/android.view.View[6]/android.view.View[4]/android.view.View[4]/android.view.View")).click();



    }

    @Test
    public void changeLanguage() throws InterruptedException {
        Thread.sleep(2000);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.id("com.amazon.mShop.android.shopping:id/skip_sign_in_button")).click();

        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Browse menu Tab 4 of 4\"]")).click();

//        driver.

    }

    @Test
    public void searchingAndClickingProduct() throws InterruptedException {
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("com.amazon.mShop.android.shopping:id/skip_sign_in_button")).click();

        driver.findElement(By.id("com.amazon.mShop.android.shopping:id/chrome_search_hint_view")).click();

        driver.findElement(By.id("com.amazon.mShop.android.shopping:id/rs_search_src_text")).sendKeys("Nothing Ear 2 wireless earbirds");

        driver.pressKey(new KeyEvent(AndroidKey.ENTER));

        driver.findElement(By.xpath("//android.view.View/android.view.View[6]/android.view.View[4]/android.view.View[4]/android.view.View")).click();



//        String elementName = "Overall Pick";
////        AndroidElement elementToScroll = driver.findElement(MobileBy.AndroidUIAutomator(
////                "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
////                        ".scrollIntoView(new UiSelector().textContains(\"" + elementName + "\"))"));

    }

    @Test
    public void resisterAccount() throws InterruptedException {
        Thread.sleep(2000);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.id("com.amazon.mShop.android.shopping:id/skip_sign_in_button")).click();

        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Browse menu Tab 4 of 4\"]")).click();

        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"cab\"]/android.widget.TextView")).click();


    }
}
