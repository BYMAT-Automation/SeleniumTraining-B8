package companyName.ProjectName.ModuleName.testCases;

import java.util.Hashtable;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import companyName.ProjectName.ModuleName.pages.HomePage;
import companyName.ProjectName.ModuleName.pages.PersonalInformationpage;
import companyName.ProjectName.ModuleName.testBase.TestBase;

public class CreateAnNewAccount3 extends TestBase {
	
	@BeforeClass
	public void getClassName() {
		testCaseName = this.getClass().getSimpleName();
		System.out.println("Test case name is :-" +testCaseName);
		}

	@Test(dataProvider = "data_Collection") // Build 2
	public void createAnNewAccount3(Hashtable<String, String> testDate) {

		HomePage.createAnNewAccount(testDate);
		PersonalInformationpage.enterInformationOnPIP(testDate);
		
		// Framework Optimization with Re-usability of components 
		// Real time Test case in a any framework in any IT company
	}
}
