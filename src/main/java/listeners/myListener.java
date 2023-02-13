package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import generic.baseclass;

public class myListener implements ITestListener {
   
		public void onTestFailure(ITestResult result) {
			String scriptname = result.getMethod().getMethodName();
			baseclass.util.captureScreenShot(scriptname);
		}
	
		
		
	
}
