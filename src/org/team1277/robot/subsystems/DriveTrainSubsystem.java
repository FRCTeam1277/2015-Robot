// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.team1277.robot.subsystems;

import org.team1277.robot.RobotMap;
import org.team1277.robot.commands.*;
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class DriveTrainSubsystem extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController frontLeftMotor = RobotMap.driveTrainfrontLeftMotor;
    SpeedController frontRightMotor = RobotMap.driveTrainfrontRightMotor;
    SpeedController backLeftMotor = RobotMap.driveTrainbackLeftMotor;
    SpeedController backRightMotor = RobotMap.driveTrainbackRightMotor;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new TankDriveCommand());
    }
    public void tankDrive(double left, double right) {
    	frontLeftMotor.set((0 - right) / 2);
    	frontRightMotor.set((0 - left) / 2);
    	backLeftMotor.set((0 - right) / 2);
    	backRightMotor.set((0 - left) / 2);
    }
}

