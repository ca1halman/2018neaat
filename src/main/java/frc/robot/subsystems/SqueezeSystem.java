package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class SqueezeSystem extends Subsystem {

    Spark squeezeSpark = new Spark(RobotMap.squeezeMotorPort);

    public void initDefaultCommand() {
        //No default command since on requiring commands are triggered by buttons!
    }
    
    public void squeeze(boolean in) {
        if (in)
            squeezeSpark.set(-.3);
        else
            squeezeSpark.set(.3);
    }

    public void stop() {
        squeezeSpark.set(0);
    }

}