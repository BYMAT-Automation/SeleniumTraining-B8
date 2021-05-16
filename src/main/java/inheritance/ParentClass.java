package inheritance;

import org.openqa.selenium.WebDriver;

public class ParentClass {
	
	public static WebDriver driver;
	public static String name = "Training";
	public static int a = 10;

	public static void testMethod() {
		System.out.println("I am in Test Method");
	}
	
}
