package Test;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Base.Base1;
import Utils.Heper;


public class run1 {
	
	
	public static ExtentReports report;
	public static ExtentTest logger;
	
	
	@BeforeSuite
	public void setup() throws Exception
	{
		ExtentHtmlReporter htmlReporter =new ExtentHtmlReporter(new File(System.getProperty("user.dir") + "/Reports/TestReport_"+Heper.getCurrentDateTime()+".html"));
		 report = new ExtentReports();
		 report.attachReporter(htmlReporter);
		// test = report.createTest("MyFirstTest", "Sample description");
	}
		
	@Test(priority=1)
	public void test1()
	{
		Base1.getMethod("http://moolya.com");
		logger=report.createTest("Test case 1");
		logger.info("Moolya home page launched successfully");
		logger.pass("passed");
	}
	
	@Test(priority=2)
	public void test2()
	{
		Base1.getMethod1();
		logger=report.createTest("Test case 2");
		logger.info("Test case 2 excecuted successfully");
		logger.pass("passed");
		
	}
	@Test(priority=3)
	public void test3()
	{
		Base1.postMethod();
		logger=report.createTest("Test case 3");
		logger.info("Test case 3 excecuted successfully");
		logger.pass("passed");
	}
	
	@AfterSuite
	public void setdown()
	{
		report.flush();
	}
	
}




