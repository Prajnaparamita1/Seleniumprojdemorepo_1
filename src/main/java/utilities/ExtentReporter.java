package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporter {
	
 static ExtentReports extentReport;//static method can access static staff so we have made this static as well
 
	//we have made this method static so that we can access the method using class name
	public static ExtentReports getExtentReport() {
	String extentReportPath = System.getProperty("user.dir")+"\\reports\\extentreport.html";
	ExtentSparkReporter reporter = new ExtentSparkReporter(extentReportPath);
	reporter.config().setReportName("TutorialsNinja Automation Results");
	reporter.config().setDocumentTitle("Test Results");
	
	extentReport = new ExtentReports();
	extentReport.attachReporter(reporter);
	extentReport.setSystemInfo("Operating System","Windows 10");
	extentReport.setSystemInfo("Tested By","Prajna_Paramita");
	
	return extentReport;

}
}