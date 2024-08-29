// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import edu.wpi.first.math.controller.ProfiledPIDController;
import edu.wpi.first.math.trajectory.TrapezoidProfile;
import edu.wpi.first.wpilibj2.command.ProfiledPIDSubsystem;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;
import edu.wpi.first.wpilibj.DutyCycleEncoder;

import frc.robot.Constants;

public class Pivit extends ProfiledPIDSubsystem {
  private final CANSparkMax arm1=new CANSparkMax(Constants.PviotConst.PiviotMotorID1, MotorType.kBrushless);
  private final CANSparkMax arm2=new CANSparkMax(Constants.PviotConst.PiviotMotorID1, MotorType.kBrushless);
  private final DutyCycleEncoder thbEncoder = new DutyCycleEncoder(Constants.PviotConst.dutyCycleEncoder);

  /** Creates a new Pivit. */
  public Pivit() {
    super(
        // The ProfiledPIDController used by the subsystem
        new ProfiledPIDController(
            0,
            0,
            0,
            // The motion profile constraints
            new TrapezoidProfile.Constraints(0, 0)));
    thbEncoder.setDistancePerRotation(4);
  }

  @Override
  public void useOutput(double output, TrapezoidProfile.State setpoint) {
    // Use the output (and optionally the setpoint) here
    double feedforward=0;
    arm1.setVoltage(output+feedforward);
    arm1.setVoltage(output+feedforward);
  }

  @Override
  public double getMeasurement() {
    // Return the process variable measurement here
    return thbEncoder.getDistance();
  }


  public void setSpd(double spd){
    arm1.set(spd);
    arm2.set(spd);
  }
}
