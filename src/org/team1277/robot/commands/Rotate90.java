package org.team1277.robot.commands;

import org.team1277.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Rotate90 extends Command {

	public int count;
	
    public Rotate90() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	count = 0;
    	requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.driveTrain.tankDriveRaw(.45, -.45);
    	count++;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        if (count < (50 * 1.25)) {
        	return false;
        }
        else {
        	return true;
        }
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
