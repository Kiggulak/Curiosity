package frc.team1523.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team1523.robot.Robot;

/**
 *
 */
public class SetLowerGear extends Command {

    private boolean state;
    private boolean finished = false;

    public SetLowerGear(boolean state) {
        requires(Robot.gear);
        this.state = state;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        //Send to subsystem
        Robot.gear.setUpper(state);
        finished = true;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return finished;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
