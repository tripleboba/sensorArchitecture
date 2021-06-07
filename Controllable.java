package itec3030.smarthome.standards;

/**
 * An object is controllable if we can add something
 * that implements a ControllerInterface to it.
 * @author Coconutt
 *
 */
public abstract interface Controllable
{
	/**
	 * Get the unique ID of the Object
	 */
	public abstract String getID();
	
	/**
	 * Set the ID of the Object
	 * @param ID	The unique ID of the Object
	 */
	public abstract void setID(String ID);
	
	/**
	 * Get a reference to the Controller that this Controllable controls
	 * @return	The ControllerInterface-compliant object that controls the objects
	 */
	public abstract ControllerInterface getController();
	
	/**
	 * Set a reference to the Controller that this Controllable controls
	 * @param paramControllerInterface	The ControllerInterface-compliant object that controls the object
	 */
	public abstract void setController(ControllerInterface paramControllerInterface);
	
	/**
	 * Enables functing of the Object
	 */
	public abstract void enable();
	
	/**
	 * Disables functioning of the Object
	 */
	public abstract void disable();
	
	/**
	 * Gets the Enabled/Disabled status of the Object
	 * @return	Enable or Disabled status of the Object
	 */
	public abstract boolean enabled();
}