package org.team1277.robot.subsystems;

import org.team1277.robot.RobotMap;
import org.team1277.robot.commands.TankDrive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public final class DriveTrain extends Subsystem
{
    private SpeedController leftMotor;
    private SpeedController rightMotor;
    
    private RobotDrive drive;
    
    public DriveTrain()
    {
    	leftMotor = new Talon(RobotMap.LEFT_DRIVE_MOTOR);
    	rightMotor = new Talon(RobotMap.RIGHT_DRIVE_MOTOR);
    	drive = new RobotDrive(leftMotor, rightMotor);
    }
    
    public void tankDrive(double left, double right)
    {
    	drive.tankDrive(left, right);
    }

    public void initDefaultCommand()
    {
        setDefaultCommand(new TankDrive());
    }
}

