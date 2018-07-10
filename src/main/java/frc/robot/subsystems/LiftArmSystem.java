package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.interfaces.Potentiometer;
import frc.robot.RobotMap;
import frc.robot.commands.MoveArmCommand;

//Contains PID and distance calculation
public class LiftArmSystem extends Subsystem {

    Spark armSpark = new Spark(RobotMap.liftMotorPort);

    AnalogInput potPort = new AnalogInput(RobotMap.liftPotPort);
    Potentiometer tiltPot = new AnalogPotentiometer(potPort);

    public void initDefaultCommand() {
       setDefaultCommand(new MoveArmCommand()); 
    }

    public void moveArmAtSpeed(double speed) {
        if (Math.abs(speed) > .1)
            armSpark.set(speed);
        else
            armSpark.set(0);
    }
    
    public void stop() {
        armSpark.set(0);
    }

}