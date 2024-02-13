package org.Bridgelabz.example.PageObjectModels.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObject {
    WebDriver driver = null;

    public  GoogleSearchPageObject(WebDriver driver){
        this.driver = driver;
    }

    By textboxSearch = By.id("APjFqb");

    By searchButton = By.name("btnK");
    public void setTextInSearchBox(String text){
        driver.findElement(textboxSearch).sendKeys(text);
    }

    public void clickSearch(){
        driver.findElement(searchButton).sendKeys(Keys.RETURN);
    }
}
