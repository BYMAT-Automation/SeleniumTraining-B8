package companyName.ProjectName.ModuleName.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import companyName.ProjectName.ModuleName.testBase.TestBase;

public class CommonMethods extends TestBase {

	public static void enterValueIntoTextBox(String XpathORFile, String valueDataSheet, String textBoxName) {
		try {
			driver.findElement(By.xpath(or.getProperty(XpathORFile))).sendKeys(valueDataSheet);
			test.log(LogStatus.PASS, "User entered " + valueDataSheet + " in " + textBoxName + " field.");
			takeScreenShot();
		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					"User not able to enter " + valueDataSheet + " in " + textBoxName + " field. " + e.getMessage());
			takeScreenShotFailed();
			Assert.fail("User not able to enter " + valueDataSheet + " in " + textBoxName + " field.");
		}
	}

	public static void clickOnButton(String Xpath, String buttonName) {
		try {
			driver.findElement(By.xpath(or.getProperty(Xpath))).click();
			test.log(LogStatus.PASS, "User clicked on " + buttonName + " button.");
			takeScreenShot();
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "User not able to click on " + buttonName + " button."+e.getMessage());
			//test.log(LogStatus.FAIL, e.getMessage());
			takeScreenShotFailed();
			Assert.fail("User not able to click on " + buttonName + " button.");
		}
	}

	public static void selectRadioButtonOrCheckBox(String Xpath, String name) {
		try {
			driver.findElement(By.xpath(or.getProperty(Xpath))).click();
			test.log(LogStatus.PASS, "User selected oe checked " + name + " button or CheckBox.");
			takeScreenShot();
		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					"User not able to select or check " + name + " button or CheckBox." + e.getMessage());
			takeScreenShotFailed();
			Assert.fail("User not able to select or check " + name + " button or CheckBox.");
		}
	}

	public static String getPageTitle() {
		return driver.getTitle();

	}

	public static void verifyPageTitle(String expectedTitle) {
		try {
			String actual_Title = getPageTitle();
			Assert.assertEquals(actual_Title, expectedTitle);
			test.log(LogStatus.PASS, "User Navigated to " + actual_Title + " page.");
			takeScreenShot();
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "User Navigation is failed." + e.getMessage());
			takeScreenShotFailed();
			Assert.fail("User Navigation is failed.");
		}

	}

	public static void isDisplayed(String XpathORFile, String valueDataSheet) {
		try {
			String actualText = getTextfromField(XpathORFile);
			Assert.assertEquals(actualText, valueDataSheet);
			test.log(LogStatus.PASS, valueDataSheet + " text is displayed");
			takeScreenShot();
		} catch (Exception e) {
			test.log(LogStatus.FAIL, valueDataSheet + " text is not displayed" + e.getMessage());
			takeScreenShotFailed();
			Assert.fail(valueDataSheet + " text is not displayed");
		}
	}

	
	public static void selectByValue(String XpathORFile, String valueDataSheet) {
		try {
			
		}catch(Exception e) {
			
		}
	}
	
	public static String getTextfromField(String XpathORFile) {
		return driver.findElement(By.xpath(or.getProperty(XpathORFile))).getText();
	}
	
	public static void takeScreenShot() {
		String timestamp = new SimpleDateFormat("YYYY_MM_dd_HH_mm_SS").format(new Date());
		String screenShotPath = System.getProperty("user.dir")+"\\src\\test\\resources\\screenShots\\Passed_screenshots\\loginToFbWithValidCred_"
				+ timestamp + ".png";
		
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(screenShotPath);
		try {
			FileHandler.copy(scrFile, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		test.log(LogStatus.PASS, test.addScreenCapture(screenShotPath));
	}
	
	public static void takeScreenShotFailed() {
		String timestamp = new SimpleDateFormat("YYYY_MM_dd_HH_mm_SS").format(new Date());
		String screenShotPath = System.getProperty("user.dir")+"\\src\\test\\resources\\screenShots\\Failed_screenshots\\loginToFbWithValidCred_"
				+ timestamp + ".png";
		
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(screenShotPath);
		try {
			FileHandler.copy(scrFile, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		test.log(LogStatus.FAIL, test.addScreenCapture(screenShotPath));
	}
	

}
