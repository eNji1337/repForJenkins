package logger;

import io.qameta.allure.Attachment;
import lombok.extern.slf4j.Slf4j;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

@Slf4j
public class DefaultListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        log.debug("Test started " + getTestMethodName(result));
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        saveTextLog(getTestMethodName(result) + " test passed success");
    }
    @Attachment(value = "Page screenshot", type = "image/png")
    @Override
    public void onTestFailure(ITestResult result) {
        saveTextLog(getTestMethodName(result) + " failed");
        ScreenShotMaker.makeScreenshot();
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }

    @Attachment(value = "{0}", type = "text/plain")
    public static String saveTextLog(String message) {
        return message;
    }

    private static String getTestMethodName(ITestResult iTestResult) {
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }
}
