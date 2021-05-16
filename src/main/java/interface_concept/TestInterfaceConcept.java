package interface_concept;

public class TestInterfaceConcept {

	static WedDriver_B8 driver, driver1, driver2;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver_B8();
		
		driver.get_B8("URL over here");
		
		driver.getTile_B8();
		
		driver.close_B8();
		
		driver.quit_B8();
		
		driver.takeScreenShot();
		
		System.out.println("***************************************");	
		driver1 = new FireFoxDriver_B8();
		
		driver1.get_B8("URL over here");
		
		driver1.getTile_B8();
		
		driver1.close_B8();
		
		driver1.quit_B8();
		
		driver1.takeScreenShot();
		
		System.out.println("***************************************");	
		driver2 = new InternetExplorerDriver_B8();
		
		driver2.get_B8("URL over here");
		
		driver2.getTile_B8();
		
		driver2.close_B8();
		
		driver2.quit_B8();
		
		driver2.takeScreenShot();
	}

}
