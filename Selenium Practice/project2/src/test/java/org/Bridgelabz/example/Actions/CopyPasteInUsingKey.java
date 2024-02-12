package org.Bridgelabz.example.Actions;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPasteInUsingKey {
    public WebDriver driver;

    @Test
    public void copyPaste(){
        driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/single_text_input.html");

        driver.manage().window().maximize();

        WebElement textField = driver.findElement(By.id("textInput"));

        Actions actions = new Actions(driver);

        actions.sendKeys(textField,"SeleniumAda").keyDown(Keys.ARROW_LEFT).keyDown(Keys.SHIFT).sendKeys(Keys.ARROW_UP).keyUp(Keys.SHIFT).keyDown(Keys.CONTROL).sendKeys("xv").keyUp(Keys.CONTROL).perform();
    }
}
