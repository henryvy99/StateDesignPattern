/**
 * InTransitState that will implement State interface
 * @author henryvy
 *
 */
public class InTransitState implements State{

	private Package pkg;

	/**
	 * InTransitState constructor that will assign the package
	 * @param pkg
	 */
	public InTransitState(Package pkg){
		this.pkg = pkg;
	}
	
	/**
	 * display's the status message
	 */
	public void displayStatus() {
		System.out.println(pkg.getName() + " is out for delivery");
		
	}

	/**
	 * display's the ETA message
	 */
	public void displayETA() {
		System.out.println(pkg.getName() + " should arrive within 5 days");		
	}

}
