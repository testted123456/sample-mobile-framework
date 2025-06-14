package base;

import com.aventstack.extentreports.ExtentTest;
import listerner.TestListener;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import utils.DriverUtils;
import utils.ReportUtils;

@Listeners(TestListener.class)
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
