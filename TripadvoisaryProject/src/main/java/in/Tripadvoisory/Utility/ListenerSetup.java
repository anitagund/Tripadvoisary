package in.Tripadvoisory.Utility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import in.Tripadvoisory.TestBase.TestBase;

public class ListenerSetup extends TestBase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Execution started"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test success"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed"+result.getName());
		
		UtilityClass.takeScreenShot(result.getName()+System.currentTimeMillis());
		System.out.println("Screenshot captured");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case skipped"+result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test case started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Execution finished");
	}

}
