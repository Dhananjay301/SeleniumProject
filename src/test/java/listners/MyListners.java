package listners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListners implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("Test Started  ================  ");
		
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Success===============    ");
		
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed  ====================  ");
		
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped  =================  ");
		
	}
}
