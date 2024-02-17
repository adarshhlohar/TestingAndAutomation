package org.Bridgelabz.example.PageObjectModels.Test;

import org.Bridgelabz.example.PageObjectModels.Pages.GoogleSearchPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleSearchPageTest {

    private WebDriver driver;
    @Test
    public void searchGoogle() throws InterruptedException {
        driver = new ChromeDriver();

        GoogleSearchPageObject searchPageObject = new GoogleSearchPageObject(driver);

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        searchPageObject.setTextInSearchBox("facebook");
        Thread.sleep(2000);
        searchPageObject.clickSearch();

    }
}
