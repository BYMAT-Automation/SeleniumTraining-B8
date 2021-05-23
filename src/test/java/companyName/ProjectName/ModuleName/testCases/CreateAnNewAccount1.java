package companyName.ProjectName.ModuleName.testCases;

import java.util.Hashtable;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import companyName.ProjectName.ModuleName.pages.HomePage;
import companyName.ProjectName.ModuleName.pages.PersonalInformationpage;
import companyName.ProjectName.ModuleName.testBase.TestBase;

public class CreateAnNewAccount1 extends TestBase {
	
	@BeforeClass
	public void getClassName() {
		testCaseName = this.getClass().getSimpleName();
		System.out.println("Test case name is :-" +testCaseName);
		
		}

	@Test(dataProvider = "data_Collection")
	public void createAnNewAccount1(Hashtable<String, String> testDate) {
		
		HomePage.createAnNewAccount(testDate);
		
		// I am moving to next page -- Personal Information page
		
		PersonalInformationpage.enterInformationOnPIP(testDate);
		
		// Framework Optimization with Re-usability of components 
	}
}
