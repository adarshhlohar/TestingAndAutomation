package org.Bridgelabz.example.Actions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class KeyDown {
    public WebDriver driver;
    @Test
    public void keyUp() {
        driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/single_text_input.html");

        driver.manage().window().maximize();

        Actions actions =  new Actions(driver);
        actions.keyDown(Keys.SHIFT).sendKeys("agd3").keyUp(Keys.SHIFT).sendKeys("b").perform();

        WebElement textField = driver.findElement(By.id("textInput"));
        org.junit.Assert.assertEquals("Ab", textField.getAttribute("value"));
    }
}
