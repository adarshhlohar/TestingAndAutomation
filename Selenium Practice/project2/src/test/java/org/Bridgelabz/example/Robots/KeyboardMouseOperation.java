package org.Bridgelabz.example.Robots;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;

public class KeyboardMouseOperation {
    WebDriver driver;
    @Test
    public void copyAndPaste() throws AWTException {

        driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/single_text_input.html");

        driver.manage().window().maximize();

        Robot robo = new Robot();

        robo.mouseMove(300, 500);




    }
}
