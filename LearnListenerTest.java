package listenerTestPackage;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class LearnListenerTest implements IInvokedMethodListener, ISuiteListener, ITestListener{

	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("" + method.getClass().getName());
		
	}

	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// IInvokedMethodListener
		
	}

	public void onStart(ISuite suite) {
		// ISuiteListener
		
	}

	public void onFinish(ISuite suite) {
		// ISuiteListener
		
	}

	public void onTestStart(ITestResult result) {
		// ITestListener
		
	}

	public void onTestSuccess(ITestResult result) {
		// ITestListener
		
	}

	public void onTestFailure(ITestResult result) {
		// ITestListener, good place to write code for screenshot if test case failed.
		
	}

	public void onTestSkipped(ITestResult result) {
		// ITestListener
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// ITestListener
		
	}

	public void onStart(ITestContext context) {
		// ITestListener
		
	}

	public void onFinish(ITestContext context) {
		// ITestListener
		
	}
}
