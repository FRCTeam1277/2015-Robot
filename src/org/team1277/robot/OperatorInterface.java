package org.team1277.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 * 
 * @see <a href="http://wpilib.screenstepslive.com/s/4485/m/13809/l/241904-running-commands-on-joystick-input">Running commands on Joystick input</a>
 */
public class OperatorInterface
{
	public final Joystick leftStick = new Joystick(1);
	public final Joystick rightStick = new Joystick(2);
}

