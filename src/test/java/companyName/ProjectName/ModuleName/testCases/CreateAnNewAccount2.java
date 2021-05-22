package companyName.ProjectName.ModuleName.testCases;

import java.util.Hashtable;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import companyName.ProjectName.ModuleName.testBase.TestBase;
import companyName.ProjectName.ModuleName.utilities.CommonMethods;

public class CreateAnNewAccount2 extends TestBase {
	
	@BeforeClass
	public void getClassName() {
		testCaseName = this.getClass().getSimpleName();
		System.out.println("Test case name is :-" +testCaseName);
		
	}

	@Test(dataProvider = "data_Collection") // Build 1
	public void createAnNewAccount2(Hashtable<String, String> testDate) {

		CommonMethods.verifyPageTitle(testDate.get("Application_Name"));
		
		CommonMethods.clickOnButton("Sign_In_btn", "Sign_In_btn");

		CommonMethods.isDisplayed("CreatAnAcntTxt", testDate.get("Value1"));
		
		CommonMethods.isDisplayed("alreadyRegisteredTxt", testDate.get("Value2"));
		
		CommonMethods.enterValueIntoTextBox("Email_Add", testDate.get("Email_Address"), "Email Address");
		
		CommonMethods.clickOnButton("CreateAccntBtn", "Create An Account");
		
		CommonMethods.selectRadioButtonOrCheckBox("Gender", "Mr.");
		
		CommonMethods.enterValueIntoTextBox("FirstName", testDate.get("First_Name"), "First Name");

		CommonMethods.enterValueIntoTextBox("LastName", testDate.get("Last_Name"), "Last Name");

		CommonMethods.enterValueIntoTextBox("password", testDate.get("Password"), "Password");
		
		// Framework Optimization with Re-usability of components 
	}

}
