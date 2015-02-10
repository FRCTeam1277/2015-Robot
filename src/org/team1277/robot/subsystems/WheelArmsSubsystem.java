package org.team1277.robot.subsystems;

import org.team1277.robot.RobotMap;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class WheelArmsSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	Relay openCloseMotor = RobotMap.wheelArmMove;
	Relay spinLeftWheel = RobotMap.wheelArmLeft;
	Relay spinRightWheel = RobotMap.wheelArmRight;
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void open() {
    	openCloseMotor.set(Relay.Value.kForward);
    }
    public void close() {
    	openCloseMotor.set(Relay.Value.kReverse);
    }
    public void stopOpenClose() {
    	openCloseMotor.set(Relay.Value.kOff);
    }
    public void pullIn() {
    	spinLeftWheel.set(Relay.Value.kReverse);
    	spinRightWheel.set(Relay.Value.kForward);
    }
    public void pushOut() {
    	spinLeftWheel.set(Relay.Value.kForward);
    	spinRightWheel.set(Relay.Value.kReverse);
    }
    public void spinContainer() {
    	spinLeftWheel.set(Relay.Value.kForward);
    	spinRightWheel.set(Relay.Value.kForward);
    }
    public void stopWheels() {
    	spinLeftWheel.set(Relay.Value.kOff);
    	spinRightWheel.set(Relay.Value.kOff);
    }
}

