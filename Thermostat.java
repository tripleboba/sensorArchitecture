package itec3030.smarthome.standards;

/**
 * A Sensor that measure temperature, as an integer
 * @author Coconutt
 *
 */
public abstract interface Thermostat extends SmartThing, Controllable, NumericMeasurementInstrument
{
	/**
	 * Function is called by the hardware to register a new temperature setting
	 * @param temperature	new integer temperature from the sensor 
	 */
	public abstract void newTemperature(int temperature);
}