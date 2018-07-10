package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.BasicDriveCommand;

//Contains PID and distance calculation
public class BasicDriveSystem extends Subsystem {

    Spark driveLeft = new Spark(RobotMap.leftDriveMotorPort);
    Spark driveRight = new Spark(RobotMap.rightDriveMotorPort);

    Encoder encoderLeft = new Encoder(0, 1);
    Encoder encoderRight = new Encoder(2, 3);

    DifferentialDrive drive = new DifferentialDrive(driveLeft, driveRight);

    public void initDefaultCommand() {
       setDefaultCommand(new BasicDriveCommand()); 
    }

    public void arcadeDrive(double rotValue, double moveValue) {
        drive.arcadeDrive(moveValue, rotValue);
    } 

    public void tankDrive(double leftValue, double rightValue) {
        drive.tankDrive(leftValue, rightValue);
    }

    public void stop() {
        drive.tankDrive(0, 0);
    }

    public double calculateDistanceTravelled() {
        return (Math.abs(encoderLeft.getDistance()) + Math.abs(encoderRight.getDistance())) / 2;
    }

    public void resetEncoders() {
        encoderLeft.reset();
        encoderRight.reset();
    }

}