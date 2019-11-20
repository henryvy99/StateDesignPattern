/**
 * DeliveredState that will implement State interface
 * @author henryvy
 *
 */
public class DeliveredState implements State{

	private Package pkg;
	
	/**
	 * DeliveredState constructor that will assign the package
	 * @param pkg
	 */
	public DeliveredState(Package pkg){
		this.pkg = pkg;
	}
	
	/**
	 * display's the status message
	 */
	public void displayStatus() {
		System.out.println(pkg.getName() + " is here for you");		
	}
	
	/**
	 * display's the ETA message
	 */
	public void displayETA() {
		System.out.println(pkg.getName() + " is here");		
	}

}
