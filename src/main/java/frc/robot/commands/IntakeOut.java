package frc.robot.commands;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class IntakeOut extends Command {
  public IntakeOut() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.intake);
  }

  // Called just before this Command runs the first time
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  protected void execute() {

    double speed = Robot.oi.mainStick.getTriggerAxis(Hand.kLeft);

    Robot.intake.intakeOut(speed);

  }

  // Make this return true when this Command no longer needs to run execute()
  protected boolean isFinished() {
      return false;
  }

  // Called once after isFinished returns true
  protected void end() {
    Robot.intake.stop();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  protected void interrupted() {
    Robot.intake.stop();
  }
}
