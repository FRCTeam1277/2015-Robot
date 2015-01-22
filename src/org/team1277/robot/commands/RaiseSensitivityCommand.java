package org.team1277.robot.commands;

import org.team1277.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RaiseSensitivityCommand extends Command {

	boolean c = false;
	
    public RaiseSensitivityCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.driveTrain.raiseSensitivity();
    	c = true;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return c;
    }

    // Called once after isFinished returns true
    protected void end() {
    	c = false;
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
