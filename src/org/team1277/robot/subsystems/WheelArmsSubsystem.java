package org.team1277.robot.subsystems;

import org.team1277.robot.RobotMap;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class WheelArmsSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	SpeedController openCloseMotor = RobotMap.wheelArmMove;
	Relay spinLeftWheel = RobotMap.wheelArmLeft;
	Relay spinRightWheel = RobotMap.wheelArmRight;
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void open() {
    	openCloseMotor.set(.5);
    }
    public void close() {
    	openCloseMotor.set(-.5);
    }
    public void stopOpenClose() {
    	openCloseMotor.set(0);
    }
    public void pullIn() {
    	spinLeftWheel.set(Relay.Value.kReverse);
    	spinRightWheel.set(Relay.Value.kForward);
    }
    public void pushOut() {
    	spinLeftWheel.set(Relay.Value.kForward);
    	spinRightWheel.set(Relay.Value.kReverse);
    }
    public void spinContainerLeft() {
    	spinLeftWheel.set(Relay.Value.kForward);
    	spinRightWheel.set(Relay.Value.kForward);
    }
    public void spinContainerRight() {
    	spinLeftWheel.set(Relay.Value.kReverse);
    	spinRightWheel.set(Relay.Value.kReverse);
    }
    public void stopWheels() {
    	spinLeftWheel.set(Relay.Value.kOff);
    	spinRightWheel.set(Relay.Value.kOff);
    }
}

