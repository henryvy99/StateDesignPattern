/**
 * OrderedState that will implement State interface
 * @author henryvy
 *
 */
public class OrderedState implements State{

	private Package pkg;
	
	/**
	 * OrderedState constructor that will assign the package
	 * @param pkg
	 */
	public OrderedState(Package pkg){
		this.pkg = pkg;
	}
	
	/**
	 * display's the status message
	 */
	public void displayStatus() {
		System.out.println(pkg.getName() + " was ordered");
		
	}

	/**
	 * display's the ETA message
	 */
	public void displayETA() {
		System.out.println(pkg.getName() + " should arrive in 5 to 7 business days");
	}

}
