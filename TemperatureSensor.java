package itec3030.smarthome.standards;

/**
 * A Sensor that measure temperature, as an integer
 * @author Coconutt
 *
 */
public abstract interface TemperatureSensor extends SmartThing, Controllable, NumericMeasurementInstrument{
	/**
	 * Function is called by the hardware to register a new
	 * temperature reading from sensor
	 * @param temperature	integer temperature from sensor
	 */
	public abstract void newTemperature(int temperature);
}