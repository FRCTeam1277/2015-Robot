package org.team1277.robot.subsystems;

import org.team1277.robot.RobotMap;
import org.team1277.robot.commands.TankDriveCommand;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LiftSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public Relay winch = RobotMap.lift;

	public DigitalInput limitSwitchTop = RobotMap.limitSwitchTop;
	public DigitalInput limitSwitchBottom = RobotMap.limitSwitchBottom;
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void moveUp() {
    	winch.set(Relay.Value.kForward);
    }
    public void moveDown() {
    	winch.set(Relay.Value.kReverse);
    }
    public void moveStop() {
    	winch.set(Relay.Value.kOff);
    }
}

