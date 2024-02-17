package org.Bridgelabz.example.TestngListener;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestListener implements ITestListener {


    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("This is successfully executed " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("My test case failed name of my test case " + result.getName());
    }
}

