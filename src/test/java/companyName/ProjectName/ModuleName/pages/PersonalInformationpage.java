package companyName.ProjectName.ModuleName.pages;

import java.util.Hashtable;

import companyName.ProjectName.ModuleName.testBase.TestBase;
import companyName.ProjectName.ModuleName.utilities.CommonMethods;

public class PersonalInformationpage extends TestBase {

	public static void enterInformationOnPIP(Hashtable<String, String> testDate) {

		CommonMethods.selectRadioButtonOrCheckBox("Gender", "Mr.");

		CommonMethods.enterValueIntoTextBox("FirstName", testDate.get("First_Name"), "First Name");

		CommonMethods.enterValueIntoTextBox("LastName", testDate.get("Last_Name"), "Last Name");

		CommonMethods.enterValueIntoTextBox("password", testDate.get("Password"), "Password");

	}

}
