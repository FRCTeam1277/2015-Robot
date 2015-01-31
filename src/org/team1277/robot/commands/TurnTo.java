package org.team1277.robot.commands;

import org.team1277.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class TurnTo extends Command
{
	private final double targetAngle; // the target angle in degrees

	public TurnTo(double targetAngle)
	{
		this.targetAngle = targetAngle;
		
		requires(Robot.driveTrain);
	}
	
	@Override
	protected void initialize()
	{
		
	}

	@Override
	protected void execute()
	{
		double currentAngle = Robot.driveTrain.getAngle();
		if(currentAngle < targetAngle) // left of target angle
		{
			// turn right
			Robot.driveTrain.tankDrive(0.5, -0.5);
		}
		else
		{
			// turn left
			Robot.driveTrain.tankDrive(-0.5, 0.5);
		}
	}

	@Override
	protected boolean isFinished()
	{
		return Math.abs(Robot.driveTrain.getAngle() - targetAngle) < 1.0; // stop when w/in 1 degree
	}

	@Override
	protected void end()
	{
		
	}

	@Override
	protected void interrupted()
	{
		
	}
}
