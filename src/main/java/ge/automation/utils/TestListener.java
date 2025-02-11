package ge.automation.utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result){
        String testName = result.getMethod().getMethodName();
        ExtentReportManager.createTest(testName);

        System.out.println("Test Started: " + result.getName());
    }
    @Override
    public void onTestSuccess(ITestResult result){
        ExtentReportManager.getTest().pass("Test Passed");
        System.out.println("Test Success: " + result.getName());
    }
    @Override
    public void onTestFailure(ITestResult result){
        System.out.println("Test Failure: " + result.getName());
        ExtentReportManager.getTest().fail("Test Failed " + result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result){
        System.out.println("Test Skipped: " + result.getName());
    }

    @Override
    public void onStart(ITestContext context){
        System.out.println("Test Suite Started: " + context.getName());
    }

    @Override
    public void onFinish(ITestContext context){
        System.out.println("Test Suite Finished: " + context.getName());
        ExtentReportManager.flushReports();
    }

}