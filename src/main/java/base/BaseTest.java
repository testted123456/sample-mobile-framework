package base;

import com.aventstack.extentreports.ExtentTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utils.DriverUtils;
import utils.ReportUtils;

public class BaseTest {

    public ExtentTest test;

    @BeforeSuite
    public void setUp() {
        DriverUtils.initializeDriver();
        test = ReportUtils.createTest("My Sample Test");
    }

    @AfterSuite
    public void tearDown() {
        ReportUtils.getInstance().flush(); // save the report

        DriverUtils.quitDriver();
    }
}
