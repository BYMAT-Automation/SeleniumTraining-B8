package mehodOverriding;

public class HDFC_BANK extends RBI_Bank{
	
	public double getRateOfInterest() {
		System.out.println("I am in HDFC Bank");
		return 9.5;
	}

}
