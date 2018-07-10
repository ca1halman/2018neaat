package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

//Contains PID and distance calculation
public class IntakeSystem extends Subsystem {

    Spark intakeSpark = new Spark(RobotMap.intakeDriveMotorPort);

    public void initDefaultCommand() {
        //No default command since we only have button activated ones!!
    }

    public void intakeIn(double speed) {
        intakeSpark.set(-speed);
    }
    public void intakeOut(double speed) {
        intakeSpark.set(speed);
    }
    
    public void stop() {
        intakeSpark.set(0);
    }

}