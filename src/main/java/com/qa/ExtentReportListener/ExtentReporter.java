/*
package com.qa.ExtentReportListener;

import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReporter implements IReporter

        private static ExtentReports extent;
        private static Platform platform;
        private static String reportFileName = "BijakAutomation"+getCurrentDateTime()+".html";
        private static String macPath = System.getProperty("user.dir")+ "/TestReport";
        private static String windowsPath = System.getProperty("user.dir")+ "\\TestReport";
        private static String macReportFileLoc = macPath + "/" + reportFileName;
        private static String winReportFileLoc = windowsPath + "\\" + reportFileName;

        public static ExtentReports getInstance() {
            if (extent == null)
                createInstance();
            return extent;
        }

        //Create an extent report instance
        public static ExtentReports createInstance() {
            platform = getCurrentPlatform();
            String fileName = getReportFileLocation(platform);
            ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
            htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
            htmlReporter.config().setChartVisibilityOnOpen(true);
            htmlReporter.config().setTheme(Theme.STANDARD);
            htmlReporter.config().setDocumentTitle(fileName);
            htmlReporter.config().setEncoding("utf-8");
            htmlReporter.config().setReportName(fileName);

            extent = new ExtentReports();
            extent.attachReporter(htmlReporter);

            return extent;
        }

        //Select the extent report file location based on platform
        private static String getReportFileLocation (Platform platform) {
            String reportFileLocation = null;
            switch (platform) {
                case MAC:
                    reportFileLocation = macReportFileLoc;
                    createReportPath(macPath);
                    System.out.println("ExtentReport Path for MAC: " + macPath + "\n");
                    break;
                case WINDOWS:
                    reportFileLocation = winReportFileLoc;
                    createReportPath(windowsPath);
                    System.out.println("ExtentReport Path for WINDOWS: " + windowsPath + "\n");
                    break;
                default:
                    System.out.println("ExtentReport path has not been set! There is a problem!\n");
                    break;
            }
            return reportFileLocation;
        }

        //Create the report path if it does not exist
        private static void createReportPath (String path) {
            File testDirectory = new File(path);
            if (!testDirectory.exists()) {
                if (testDirectory.mkdir()) {
                    System.out.println("Directory: " + path + " is created!" );
                } else {
                    System.out.println("Failed to create directory: " + path);
                }
            } else {
                System.out.println("Directory already exists: " + path);
            }
        }

        //Get current platform
        private static Platform getCurrentPlatform () {
            if (platform == null) {
                String operSys = System.getProperty("os.name").toLowerCase();
                if (operSys.contains("win")) {
                    platform = Platform.WINDOWS;
                } else if (operSys.contains("nix") || operSys.contains("nux")
                        || operSys.contains("aix")) {
                    platform = Platform.LINUX;
                } else if (operSys.contains("mac")) {
                    platform = Platform.MAC;
                }
            }
            return platform;
        }

        private static String getCurrentDateTime()
        {
            LocalDateTime currentDateTime = java.time.LocalDateTime.now();
            return currentDateTime.toString();
        }

*/
