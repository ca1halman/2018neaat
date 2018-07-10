package frc.robot.commands;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class MoveArmCommand extends Command {
  public MoveArmCommand() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.arm);
  }

  // Called just before this Command runs the first time
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  protected void execute() {
    Robot.arm.moveArmAtSpeed(Robot.oi.mainStick.getY(Hand.kLeft));
  }

  // Make this return true when this Command no longer needs to run execute()
  protected boolean isFinished() {
      return false;
  }

  // Called once after isFinished returns true
  protected void end() {
    Robot.arm.stop();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  protected void interrupted() {
    Robot.arm.stop();
  }
}
