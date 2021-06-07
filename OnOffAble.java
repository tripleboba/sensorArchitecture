package itec3030.smarthome.standards;

/**
 * A special kind of a SmartThing that can be turned on or off
 * @author Coconutt
 *
 */
public abstract interface OnOffAble{
	/**
	 * Turn the Object off
	 */
	public abstract void turnOff();
	
	/**
	 * Turn the Object on
	 */
	public abstract void turnOn();
	
	/**
	 * Check if the Object is on or off
	 * @return True if Object is on, False if Object is off
	 */
	public abstract boolean isOn();
}