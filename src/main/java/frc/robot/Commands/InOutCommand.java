// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Commands;



import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystems.IntakeOuttake;

public class InOutCommand extends Command {
  boolean goIn;
  boolean goMid;
  boolean goOut;
  boolean goMidrev;
  private final IntakeOuttake intakeOuttake;

  /** Creates a new InOutCommand. */
  public InOutCommand(boolean goIn, boolean goMid, boolean goMidrev, boolean goOut, IntakeOuttake intakeOuttake) {
    
    this.intakeOuttake=intakeOuttake;

    this.goIn=goIn;
    this.goMid=goMid;
    this.goOut=goOut;

    addRequirements(intakeOuttake);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    intakeOuttake.setInSpd(goIn);
    intakeOuttake.setMidSpd(goMid, goMid);
    intakeOuttake.setShootSpd(goOut);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
