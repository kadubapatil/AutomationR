package seleniumtestng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerExample2 implements ITestListener {

    public void onStart(ITestContext context) {
        System.out.println("test start" );
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("test failed");
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("test skipped");
    }


}
