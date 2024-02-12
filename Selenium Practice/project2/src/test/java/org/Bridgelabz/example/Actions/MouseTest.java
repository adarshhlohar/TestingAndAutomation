package org.Bridgelabz.example.Actions;

import java.time.Duration;
import java.util.Collections;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MouseTest {
    
    public WebDriver driver;
    @Test
    public void clickAndHold(){
        driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");

        driver.manage().window().maximize();

        WebElement clickable = driver.findElement(By.id("clickable"));

        Actions actions = new Actions(driver);

        actions.clickAndHold(clickable).perform();
    
    }

    //Context Click or right click
    @Test
    public void contextClick(){
        driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");

        driver.manage().window().maximize();

        WebElement clickable = driver.findElement(By.id("clickable"));

        Actions actions = new Actions(driver);

        actions.contextClick(clickable).perform();
    }

    @Test
    public void doubleClick(){
        driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");

        driver.manage().window().maximize();

        WebElement clickable = driver.findElement(By.id("clickable"));

        Actions actions = new Actions(driver);

        actions.doubleClick(clickable).perform();
    }

    @Test
    public void hover(){
        driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");

        driver.manage().window().maximize();

        WebElement hover = driver.findElement(By.id("hover"));

        Actions actions = new Actions(driver);

        actions.moveToElement(hover).perform();
    }

    @Test
    public void moveByOffsetFromElement(){
        driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");

        driver.manage().window().maximize();

        WebElement tracker = driver.findElement(By.id("mouse-tracker"));

        Actions actions = new Actions(driver);

        actions.moveToElement(tracker, 8, 0).perform();;

    }



    @Test
    public void moveByOffsetFromViewport() {
        driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");

        PointerInput mouse = new PointerInput(PointerInput.Kind.MOUSE, "default mouse");

        Sequence actions = new Sequence(mouse, 0)
                .addAction(mouse.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), 8, 12));

        ((RemoteWebDriver) driver).perform(Collections.singletonList(actions));

        String[] result = driver.findElement(By.id("absolute-location")).getText().split(", ");
        Assert.assertTrue(Math.abs(Integer.parseInt(result[0]) - 8) < 2);
        Assert.assertTrue(Math.abs(Integer.parseInt(result[1]) - 12) < 2);
    }

    @Test
    public void moveByOffsetFromCurrentPointer() {
        driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");

        PointerInput mouse = new PointerInput(PointerInput.Kind.MOUSE, "default mouse");

        Sequence actions = new Sequence(mouse, 0)
                .addAction(mouse.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), 8, 11));
        ((RemoteWebDriver) driver).perform(Collections.singletonList(actions));

        new Actions(driver)
                .moveByOffset(13, 15)
                .perform();

        String[] result = driver.findElement(By.id("absolute-location")).getText().split(", ");
        Assert.assertTrue(Math.abs(Integer.parseInt(result[0]) - 8 - 13) < 2);
        Assert.assertTrue(Math.abs(Integer.parseInt(result[1]) - 11 - 15) < 2);
    }

    @Test
    public void dragsToElement() {
        driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");

        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));
        new Actions(driver)
                .dragAndDrop(draggable, droppable)
                .perform();

                Assert.assertEquals("dropped", driver.findElement(By.id("drop-status")).getText());
    }

    @Test
    public void dragsByOffset() {
        driver = new ChromeDriver();
        
        driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");

        WebElement draggable = driver.findElement(By.id("draggable"));
        Rectangle start = draggable.getRect();
        Rectangle finish = driver.findElement(By.id("droppable")).getRect();
        new Actions(driver)
                .dragAndDropBy(draggable, finish.getX() - start.getX(), finish.getY() - start.getY())
                .perform();

                Assert.assertEquals("dropped", driver.findElement(By.id("drop-status")).getText());
    }

}
