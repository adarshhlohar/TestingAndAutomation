package org.Bridgelabz.example.Locators;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrangeHrm {
    public WebDriver driver;

    @Test
    public void Login() {
        driver =  new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement usernameInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name='username']")));

        // Now you can interact with the username input field
        usernameInput.sendKeys("Admin");

        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");

        WebElement login = driver.findElement(By.cssSelector("button[type=submit]"));
        login.click();

        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "OrangeHRM";

        Assert.assertEquals(ExpectedTitle, ActualTitle);

        String SourceCode = driver.getPageSource();
        System.out.println(SourceCode);


        String url = driver.getCurrentUrl();
        System.out.println(url);
    }
}
