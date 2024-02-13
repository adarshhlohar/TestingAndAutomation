package org.Bridgelabz.example.PageObjectModels.Test;

import org.Bridgelabz.example.PageObjectModels.Pages.GoogleSearchPage;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
    private WebDriver driver;

    @Test
    public void googleSearch() throws InterruptedException {
        driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        driver.manage().window().maximize();

        GoogleSearchPage.textBoxSearch(driver).sendKeys("facebook");
        Thread.sleep(2000);

        GoogleSearchPage.buttonSearch(driver).sendKeys(Keys.RETURN);
    }

}
