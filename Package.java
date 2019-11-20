/**
 * Package class that will be called in the main.
 * @author henryvy
 *
 */
public class Package {
	private State orderedState;
	private State inTransitState;
	private State deliveredState;
	private String name;
	private State state;
	
	/**
	 * Package Constructor
	 * @param content
	 */
	public Package(String content) {
		this.name = content;
		this.orderedState = new OrderedState(this);
		this.inTransitState = new InTransitState(this);
		this.deliveredState = new DeliveredState(this);
	}
	
	/**
	 * order method that will set the state to OrderedState and display messages
	 */
	public void order() {
		setState(orderedState);
		state.displayStatus();
		state.displayETA();
	}
	
	/**
	 * mail method that will set the state to InTransitState and display messages
	 */
	public void mail() {
		setState(inTransitState);
		state.displayStatus();
		state.displayETA();
	}
	
	/**
	 * received method that will set the state to DeliveredState and display messages
	 */
	public void received() {
		setState(deliveredState);
		state.displayStatus();
	}
	
	/**
	 * Sets the current state to a passed in state
	 * @param state
	 */
	public void setState(State state) {
		this.state = state;
	}
	
	/**
	 * Gets the current name of the package
	 * @return
	 */
	public String getName() {
		return this.name;
	}

}
