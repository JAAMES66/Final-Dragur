// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Commands;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystems.Pivit;

public class PivoitCommand extends Command {

  Pivit pivit;
  Supplier<Double> spd;

  /** Creates a new PivoitCommand. */
  public PivoitCommand(Pivit pivit, Supplier<Double> spd) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.spd=spd;
    this.pivit=pivit;
    addRequirements(pivit);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    pivit.setSpd(spd.get());
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
