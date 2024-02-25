package org.Bridgelabz.example.DataDriven.Test;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class DatadrivenUsingXcel {
    WebDriver driver;
    @Test(dataProvider = "xcel")
    public void loginFb(String uName,String pass){
        driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.name("email"));
        WebElement password = driver.findElement(By.name("pass"));

        username.sendKeys(uName);
        password.sendKeys(pass);
    }

    @DataProvider(name = "xcel")
    public Object[][] xcelData() throws IOException {
        FileInputStream file = new FileInputStream("D:\\TestingAndAutomation\\Selenium Practice\\project2\\src\\test\\java\\org\\Bridgelabz\\example\\DataDriven\\Resource\\Book1.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);

        XSSFSheet sheet = workbook.getSheetAt(0);
        int numberOfRows = sheet.getPhysicalNumberOfRows();
        Object[][] testData = new Object[numberOfRows][2];

        for (int i =0 ; i<numberOfRows;i++){
        XSSFRow row = sheet.getRow(i);
            XSSFCell username = row.getCell(0);
            XSSFCell pass = row.getCell(1);

            testData[i][0] = username.getStringCellValue();
            testData[i][1] = pass.getStringCellValue();
        }
        return testData;
    }
}
