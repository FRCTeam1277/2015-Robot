package org.team1277.robot.subsystems;

import org.team1277.robot.RobotMap;
import org.team1277.robot.commands.BlingCommand;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class BlingSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public Relay bling = RobotMap.bling;

	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
		setDefaultCommand(new BlingCommand());
    }
    
    public void on() {
    	bling.set(Relay.Value.kOn);
    }
    
    public void off() {
    	bling.set(Relay.Value.kOff);
    }
}

