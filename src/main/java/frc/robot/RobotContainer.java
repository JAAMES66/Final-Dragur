// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.Subsystems.IntakeOuttake;
import edu.wpi.first.wpilibj.XboxController;

//commands and subsystems
import frc.robot.Subsystems.*;
import frc.robot.Commands.*;
import frc.robot.AutonCommands.*;

//PathPlanner Imports
import com.pathplanner.lib.auto.AutoBuilder;
import com.pathplanner.lib.auto.NamedCommands;
import com.pathplanner.lib.commands.PathPlannerAuto;
import com.pathplanner.lib.commands.FollowPathCommand;


public class RobotContainer {
  XboxController input=new XboxController(0);

  //subsystems
  IntakeOuttake intakeOuttake = new IntakeOuttake();
  Pivit pivit = new Pivit();


  public RobotContainer() {
  
    //commands
    intakeOuttake.setDefaultCommand(
      new InOutCommand(
        input.getYButton(), 
        input.getAButton(),
        input.getBButton(),
        input.getXButton(), 
        intakeOuttake));

    pivit.setDefaultCommand(
      new PivoitCommand(
      pivit, 
      ()->input.getRightTriggerAxis()-input.getLeftTriggerAxis()));


    //auton commands
    
    //Pathplanner

  }


  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
