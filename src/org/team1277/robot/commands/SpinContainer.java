package org.team1277.robot.commands;

import org.team1277.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SpinContainer extends Command {

    public SpinContainer() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.arms);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (Robot.oi.leftJoystick.getRawAxis(3) == 1) {
    		Robot.arms.spinContainerLeft();
    	}
    	else if (Robot.oi.leftJoystick.getRawAxis(3) == -1) {
    		Robot.arms.spinContainerRight();
    	}
    	if (Robot.oi.leftJoystick.getRawButton(5)) {
    		Robot.arms.open();
    	}
    	else if(Robot.oi.leftJoystick.getRawButton(7)) {
    		Robot.arms.close();
    	}
    	else {
    		Robot.arms.stopOpenClose();
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
