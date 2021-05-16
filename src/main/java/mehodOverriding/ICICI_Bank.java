package mehodOverriding;

public class ICICI_Bank extends RBI_Bank{
	
	public double getRateOfInterest() {
		System.out.println("I am in ICICI Bank");
		return 9.2;
	}

}
