package itec3030.smarthome.standards;

/**
 * Special kind of a SmartThing that offers true/false readings (e.g. a sensor).
 * @author Coconutt
 */
public abstract interface BooleanMeasurmentInstrument extends SmartThing
{
	/**
	 * @return	The true or false status of the instrument
	 */
	public abstract boolean getStatus();
}