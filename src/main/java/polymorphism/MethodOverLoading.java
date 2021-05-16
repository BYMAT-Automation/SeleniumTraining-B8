package polymorphism;

public class MethodOverLoading {

	public static void main(String[] args) { // Static Binding, Static polymorphism
		
		addition(4, 5);
		addition(4, 5, "numbers");
		addition(4, "string", "numbers");
		addition(233243.23123, 8, "numbers");
	}
	
	public static void addition(int a, int b) {		
		System.out.println("Addition of two numbers: " +(a+b));	
	}

	public static void addition(int a, int b, String c) {	
		System.out.println("Addition of "+c+" numbers: " +(a+b));	
	}
	
	public static void addition(int a, String b, String c) {	
		
		System.out.println("Addition of "+c+" numbers: " +a + b);	
	}
	
	public static void addition(double a, int b,String c) {	
		System.out.println("Addition of "+c+" numbers: " +(a+b));	
	}
	
	public static void addition(int a, float b,String c) {	
		System.out.println("Addition of "+c+" numbers: " +(a+b));	
	}
	
	public static void addition(int a, float b,String c, String d) {	
		System.out.println("Addition of "+c+" numbers: " +(a+b));	
	}
	
}
