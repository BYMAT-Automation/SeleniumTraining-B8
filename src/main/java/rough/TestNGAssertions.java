package rough;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertions {
	
	@Test
	public void testNGAssertions() {
		
		//Assert.assertEquals(true, false);
		
		//Assert.assertEquals("Rahul1232", "Rahul");
		
		Assert.assertEquals(10, 10, "Value of XYZ parameters from DB");
		
		//Assert.assertTrue(false, "user is able to login");  1 0 0 , 0 0 0, 1 1 1 
		
		Assert.assertFalse(false, "user is able to login");
		
		Assert.fail("failing test case");
		
		System.out.println("I am in testNG Assertion Testing class");
		
	}
	
}
