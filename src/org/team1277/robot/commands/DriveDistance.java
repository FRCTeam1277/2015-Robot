package org.team1277.robot.commands;

import org.team1277.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveDistance extends Command {
	
	public final double distance;
	public double countTo;
	
    public DriveDistance(double distance) {
        
    	this.distance = distance;
    	requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	countTo = (int) (6 * (Math.abs(distance) / (Math.PI / 2)));
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (distance > 0) {
    		Robot.driveTrain.tankDriveRaw(.5, .5);
    	}
    	else if (distance < 0) {
    		Robot.driveTrain.tankDriveRaw(-.5, -.5);
    	}
    	else if (distance == 0) {
    		Robot.driveTrain.tankDriveRaw(0, 0);
    	}
    }

    // Make this return true when th
    //is Command no longer needs to run execute()
    protected boolean isFinished() {
        return Robot.driveTrain.getRearDistance() >= countTo;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}