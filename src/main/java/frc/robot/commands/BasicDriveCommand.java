package frc.robot.commands;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class BasicDriveCommand extends Command {
  public BasicDriveCommand() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.drive);
  }

  // Called just before this Command runs the first time
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  protected void execute() {
    if (Robot.oi.mainStick.getRawButtonPressed(1))
      Robot.drive.arcadeDrive(Robot.oi.mainStick.getX(Hand.kRight), Robot.oi.mainStick.getY(Hand.kRight));
    else
      Robot.drive.arcadeDrive(Robot.oi.mainStick.getX(Hand.kRight) * .75, Robot.oi.mainStick.getY(Hand.kRight) * .75);
  }

  // Make this return true when this Command no longer needs to run execute()
  protected boolean isFinished() {
      return false;
  }

  // Called once after isFinished returns true
  protected void end() {
    Robot.drive.stop();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  protected void interrupted() {
    Robot.drive.stop();
  }
}
