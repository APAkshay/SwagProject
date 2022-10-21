package test;

import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utility.ExtentReport;
import utility.SwagLabPageElements;

public class SwagLabLoginPageTest extends SwagLabPageElements {
	ExtentReports reports;
	ExtentTest test;
	@BeforeTest
	public void createReports() {
		reports=ExtentReport.getReports();
	}

}
