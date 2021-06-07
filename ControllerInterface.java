package itec3030.smarthome.standards;

/**
 * Objects that are able to control SmartThings
 * must be able to receive change messages from
 * the SmartThings they control.
 * @author Coconutt
 *
 */
public abstract interface ControllerInterface{
	/**
	 * Function to be called by SmartThings when their status changes.
	 * @param s	The SmartThing that reports the change.
	 */
	public abstract void changeDetected(SmartThing s);

}