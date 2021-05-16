package interface_concept;

public interface WedDriver_B8 {
	// Interface is always having the signature of the method.
	
	public void get_B8(String URL); 		//  Navigate to the URL
	public void getTile_B8();	// To get the title of the page
	public void close_B8(); 	// close the current active window
	public void quit_B8(); 		// Kill the driver or quite all open sessions
	
	public void takeScreenShot(); // Newly implemented method in interface
	
}
