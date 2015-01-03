package org.team1277.robot.commands;

import org.team1277.robot.Robot;
import org.team1277.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

public class TankDrive extends Command
{	
	private DriveTrain driveTrain;
	private Joystick leftStick;
	private Joystick rightStick;
	
    public TankDrive()
    {
    	requires(Robot.DRIVE_TRAIN);
    }

    protected void initialize()
    {
    	driveTrain = Robot.DRIVE_TRAIN;
    	leftStick = Robot.OI.leftStick;
    	rightStick = Robot.OI.rightStick;
    }

    protected void execute()
    {
    	driveTrain.tankDrive(leftStick.getY(), rightStick.getY());
    }

    protected boolean isFinished()
    {
        return false;
    }

    protected void end()
    {
    	driveTrain.tankDrive(0, 0);
    }

    protected void interrupted()
    {
    	driveTrain.tankDrive(0, 0);
    }
}
