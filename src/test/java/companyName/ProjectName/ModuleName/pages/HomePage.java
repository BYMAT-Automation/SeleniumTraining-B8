package companyName.ProjectName.ModuleName.pages;

import java.util.Hashtable;

import companyName.ProjectName.ModuleName.testBase.TestBase;
import companyName.ProjectName.ModuleName.utilities.CommonMethods;

public class HomePage extends TestBase { // Page Object Model

	public static void createAnNewAccount(Hashtable<String, String> testDate) {

		CommonMethods.verifyPageTitle(testDate.get("Application_Name"));

		CommonMethods.clickOnButton("Sign_In_btn", "Sign_In_btn");

		CommonMethods.isDisplayed("CreatAnAcntTxt", testDate.get("Value1"));

		CommonMethods.isDisplayed("alreadyRegisteredTxt", testDate.get("Value2"));

		CommonMethods.enterValueIntoTextBox("Email_Add", testDate.get("Email_Address"), "Email Address");

		CommonMethods.clickOnButton("CreateAccntBtn", "Create An Account");

	}

	public static void loginWithRegisterdUser(Hashtable<String, String> testDate) {

		CommonMethods.verifyPageTitle(testDate.get("Application_Name"));

		CommonMethods.clickOnButton("Sign_In_btn", "Sign_In_btn");

		CommonMethods.isDisplayed("alreadyRegisteredTxt", testDate.get("Value2"));

		CommonMethods.enterValueIntoTextBox("EmailAdd_RU", testDate.get("Email_Address"), "Email Address");
		
		CommonMethods.enterValueIntoTextBox("password_RU", testDate.get("Email_Address"), "Password");

		CommonMethods.clickOnButton("SignIn_RU", "Sign In");

	}
	
}
