package rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

public class TryCatchBlock {
	
	@Test
	public void tryCatchBlock() {
		
		//FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\files\\config.properties");
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found at specified location:-" +e.getMessage());
		//e.printStackTrace();
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("File not found at specified loaction:-" +e.getMessage());
			//e.printStackTrace();
		} 
		finally {
			System.out.println("I am in finally block" );
		}
		
//		Properties config = new Properties();
//		try {
//			config.load(fis);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			System.out.println("handled the null poinyter exception:-" );
//			//e.printStackTrace();
//		}
		System.out.println("Config file has been loaded");
		
	}
	
	

}
