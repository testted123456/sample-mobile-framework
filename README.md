# Project Structure
``` 
├── src
│   ├── main
│   │   └── java
│   │       └── utilities/         # Utility classes (logging, config, screenshots)
│   │       ├── tests/             # TestNG test classes
│   │       ├── pages/             # Page Object Model classes
│   │       └── base/              # Base test setup/teardown
│   │       └── biz/               # abstracts and define the business logic by encapsulating it in individual methods.
│   │       └── listener/          # take screenshort when tests failed
│   │       └── utils/  
│   │           └── DriverUtils.java   
│   │           └── ExcelUtils.java 
│   │           └── ReportUtils.java      # generate report using Extent
│   │           └── ScreenshotUtils.java 
│   ├── resources
│   │   └── createWallet.xlsx     # store test data
│   ├── test
│   │   └── java
├── reports/                       # Test reports (Extent, Allure)
├── testng.xml                     # TestNG suite configuration
├── pom.xml                        # Maven configuration
└── README.md                      # Project documentation
``` 



# Tech Stack
Java

Selenium WebDriver

TestNG

Maven

Log4j2 for logging

ExtentReports or Allure for reporting

Apache POI 

#  Test Reports
/reports/ExtentReport.html

 # Screenshot on Failure
 /screenshots/
