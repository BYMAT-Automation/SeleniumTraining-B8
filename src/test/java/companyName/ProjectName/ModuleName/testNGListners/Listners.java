package companyName.ProjectName.ModuleName.testNGListners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.LogStatus;

import companyName.ProjectName.ModuleName.testBase.TestBase;

public class Listners extends TestBase implements ITestListener{

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult result) {
		
		launchingBrowser();
	}

	public void onTestSuccess(ITestResult result) {
		try {
			closingBrowser();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		endExtendTest();
	}
	
	public void onTestFailure(ITestResult result) {
		try {
			closingBrowser();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		endExtendTest();	
	}
	
	public void onTestSkipped(ITestResult result) {
		
		test.log(LogStatus.INFO, "Test case "+testCaseName+" execution has been Skipped");
	}

}
