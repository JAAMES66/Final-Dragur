// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;


import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

public class IntakeOuttake extends SubsystemBase {
  private CANSparkMax shooter1 = new CANSparkMax(1, MotorType.kBrushless);
  private CANSparkMax shooter2 = new CANSparkMax(1, MotorType.kBrushless);
  private CANSparkMax intake1 = new CANSparkMax(1, MotorType.kBrushless);

  /** Creates a new IntakeOuttake. */
  public IntakeOuttake() {
    
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    
  }

  public void setShootSpd (boolean go) {
    if(go)
      shooter2.set(1);
  }

  public void setMidSpd (Boolean goMid, boolean goMidrev){
    if (goMidrev) {
      shooter1.set(-.5);
    }else if(goMid){
      shooter1.set(.5);
    }
    
    
  }

  public void setInSpd (Boolean go) {
    if(go)
      intake1.set(.5);
  }
}
