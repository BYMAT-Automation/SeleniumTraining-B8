package mehodOverriding;

public class TestMethodOverriding {

	public static void main(String[] args) {//Dynamic binding // Run time polymorphism
		
//		RBI_Bank rbi = new RBI_Bank();	
//		rbi.rateOfInterest();
		
		RBI_Bank icici = new ICICI_Bank(); // inheritance relation 
		System.out.println(icici.getRateOfInterest());
		
		RBI_Bank hdfc = new HDFC_BANK();
		System.out.println(hdfc.getRateOfInterest());
		
		RBI_Bank sbi = new SBI_Bank();
		System.out.println(sbi.getRateOfInterest());
		
//		ICICI_Bank icici1 = new ICICI_Bank();
//		System.out.println(icici1.getRateOfInterest());
		
		// Key points:-
		// 1. Parent & Child class should have inheritance relation. 
		// 2. Child class should have same method as that of Parent class with same data type.
		// 3. create a object of child class and assign it to parent class reference variable.
	}

}
