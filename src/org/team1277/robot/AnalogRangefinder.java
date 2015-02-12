package org.team1277.robot;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.livewindow.LiveWindowSendable;
import edu.wpi.first.wpilibj.tables.ITable;

/**
 * An analog rangefinder such as the <a href="http://www.maxbotix.com/articles/016.htm">LV-MaxSonar-EZ</a>.
 * 
 * @author ben
 * @see <a href="http://www.maxbotix.com/articles/032.htm">Finding Distance Using Analog Voltage</a>
 *
 */
public class AnalogRangefinder implements LiveWindowSendable
{	
	private final AnalogInput channel;
	private final double voltsPerInch;
	
	private ITable table;
	
	/**
	 * Create a new rangefinder
	 * @param channel the analog channel connected to the rangefinder
	 * @param voltsPerInch the voltage scaling. For LV-MaxSonar sensors, this is {@code supplied voltage / 512} 
	 */
	public AnalogRangefinder(AnalogInput channel, double voltsPerInch)
	{
		this.channel = channel;
		this.voltsPerInch = voltsPerInch;
	}
	
	/**
	 * Create a new LV-MaxSonar rangefinder with a supplied voltage of 5V.
	 * @param channel
	 */
	public AnalogRangefinder(AnalogInput channel)
	{
		this(channel, 5.0 / 512);
	}
	
	/**
	 * Returns the distance in inches measured by the rangefinder
	 */
	public double getDistance()
	{
		return toInches(channel.getVoltage());
	}
	
	private double toInches(double volts)
	{
		return volts / voltsPerInch;
	}
	
	@Override
	public void initTable(ITable subtable)
	{
		this.table = subtable;
		updateTable();
	}

	@Override
	public ITable getTable()
	{
		return this.table;
	}

	@Override
	public String getSmartDashboardType()
	{
		return "Rangefinder";
	}

	@Override
	public void updateTable()
	{
		if(table != null)
		{
			table.putNumber("Distance", getDistance());
		}
	}

	@Override
	public void startLiveWindowMode() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stopLiveWindowMode() {
		// TODO Auto-generated method stub
		
	}

}
