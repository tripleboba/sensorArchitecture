package itec3030.smarthome.standards;

/**
 * A special kind of a SmartThing that offers integer reading (e.g. a sensor).
 * @author Coconutt
 *
 */
public abstract interface NumericMeasurementInstrument extends SmartThing
{
	/**
	 * Get the temperature reading from sensor
	 * @return integer temperature from sensor
	 */
	public abstract int getReading();
}