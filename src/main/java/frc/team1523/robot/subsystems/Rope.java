package frc.team1523.robot.subsystems;

import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team1523.robot.RobotMap;

/**
 *
 */
public class Rope extends Subsystem {

    private CANTalon motor;

    public Rope() {
        motor = new CANTalon(RobotMap.ROPE_TALON);
    }

    /**
     * @param speed PWM Value fron -1.0 to 1.0
     */
    public void run(double speed) {
        motor.set(speed);
    }

    /**
     * Stop motor
     */
    public void stop() {
        motor.set(0);
    }

    public void initDefaultCommand() {

    }
}

