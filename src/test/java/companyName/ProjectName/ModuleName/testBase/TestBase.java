package companyName.ProjectName.ModuleName.testBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import co.in.bymat.seleniumTraining.DataCollection;
import co.in.bymat.seleniumTraining.ExcelReader;

public class TestBase { // Heart of the Framework

	public static WebDriver driver;
	public static ExcelReader excel;
	public static ExtentTest test;
	public static ExtentReports report;
	public static String testCaseName;

	public static Properties config;
	public static Properties or;

	public static Hashtable<String, String> HT_RunMode = new Hashtable<>();

	// @BeforeClass
	@BeforeSuite
	public void initialization() throws IOException {

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\files\\config.properties");
		config = new Properties();
		config.load(fis);
		System.out.println("Config file has been loaded");

		FileInputStream fis1 = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\files\\or.properties");
		or = new Properties();
		or.load(fis1);
		System.out.println("OR file has been loaded");

		excel = new ExcelReader(
				System.getProperty("user.dir") + "\\src\\test\\resources\\testData\\MasterSheet_B8.xlsx");
		
		String timestamp = new SimpleDateFormat("YYYY_MM_dd_HH_mm_SS").format(new Date());
		report = new ExtentReports(System.getProperty("user.dir")
				+ "\\src\\test\\resources\\executionReports\\ExtentReportResult_" + timestamp + ".html");
		
		loadHashTable(HT_RunMode);
		// test = report.startTest(testCaseName);
	}

	// @BeforeMethod // Pre-Condition
	public void launchingBrowser() {
		test = report.startTest(testCaseName);
		
		if (config.getProperty("Browser").equalsIgnoreCase("CHROME")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			// ChromeDriver driver1 = new ChromeDriver();
		} else if (config.getProperty("Browser").equalsIgnoreCase("FF")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

		driver.get(config.getProperty("Application_URL"));
		System.out.println("Application URL has been launched");
		test.log(LogStatus.INFO, "Application URL has been launched");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	// @AfterMethod // Post -Condition
	public void closingBrowser() throws InterruptedException {
		Thread.sleep(5000);
		if(!(driver==null)) {
		driver.quit();
		// System.out.println("Browser has been closed");
		test.log(LogStatus.INFO,
				"Test case " + testCaseName + " execution has been completed and Browser has been closed");
	}}

	@DataProvider
	public static Object[][] data_Collection() {

		DataCollection dc = new DataCollection(excel, "TestData", testCaseName);

		return dc.dataArray();
	}

	// @AfterClass
	public static void endExtendTest() {
		report.endTest(test);
		report.flush();
	}

	public void loadHashTable(Hashtable<String, String> hashtable) { 

		int rows = excel.getRowCount("Test_Cases");
		System.out.println("Number of rows:-" + rows);

		for (int i = 2; i <= rows; i++) {
			String key = excel.getCellData("Test_Cases", "TestCaseName", i);
			String value = excel.getCellData("Test_Cases", "Run_Mode", i);
			hashtable.put(key, value);
		}
		System.out.println(hashtable);
	}

}
