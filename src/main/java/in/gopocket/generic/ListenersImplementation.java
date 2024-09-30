package in.gopocket.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenersImplementation extends BaseClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log(result.getName() + " Successfully Execution Started", true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub

		Reporter.log(result.getName() + "Is Passed", true);
	}

	@Override
	public void onTestFailure(ITestResult result) {

		TakeScreenShot(result.getName());
		Reporter.log(result.getName() + "Is Failed", true);

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log(result.getName() + "Is Skipped", true);
	}

}
