package org.team1277.robot.commands;

import org.team1277.robot.Robot;
import org.team1277.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DropBox extends Command {

	public boolean dropping = false;
    public DropBox() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.lift);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (RobotMap.limitSwitchBottom.get()) {
    		Robot.lift.moveDown();
    		dropping = false;
    	}
    	else {
    		Robot.lift.moveStop();
    		dropping = true;
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return dropping;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
