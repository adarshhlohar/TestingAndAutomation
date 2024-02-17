package org.Bridgelabz.example.Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookLogin {
    public WebDriver driver;
    @Test(dataProvider="testData")
    public  void login(String userName,String Password) throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys(userName);
        driver.findElement(By.id("pass")).sendKeys(Password);
        driver.findElement(By.name("login")).click();

        Thread.sleep(5000);

        driver.quit();
    }

    @DataProvider(name = "testData")
    public Object[][] tData(){
        return new Object[][]{
                {"9356986567","413606"},
                {"4383478933","413606"},
                {"9356986567","433432"},
                {"234324","414324323606"},
                {"424324","422432432"}
        };
    }
}
