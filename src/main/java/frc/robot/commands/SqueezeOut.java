package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class SqueezeOut extends Command {
  public SqueezeOut() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
  }

  // Called just before this Command runs the first time
  protected void initialize() {
    requires(Robot.squeeze);
  }

  // Called repeatedly when this Command is scheduled to run
  protected void execute() {
    Robot.squeeze.squeeze(false);
  }

  // Make this return true when this Command no longer needs to run execute()
  protected boolean isFinished() {
      return false;
  }

  // Called once after isFinished returns true
  protected void end() {

    Robot.squeeze.stop();

  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  protected void interrupted() {

    Robot.squeeze.stop();

  }
}
