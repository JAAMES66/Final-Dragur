
package frc.robot;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.math.trajectory.TrapezoidProfile;
import edu.wpi.first.math.util.Units;

public final class Constants {

 public static final double kMaxSpeedMetersPerSecond = 4;
 public static final double kMaxAccelerationMetersPerSecondSquared = 2;
 public static final double kMaxAngularSpeedRadiansPerSecond = MathMethods.Tau;
 public static final double kMaxAngularAccelerationRadiansPerSecondSquared = MathMethods.Tau;

 public static final class PviotConst {
    public static int PiviotMotorID1=1;
    public static int PiviotMotorID2=2;
    public static int dutyCycleEncoder=1;
 }

 public static final class ModuleConstants {
    public static final double kWheelDiameterMeters = Units.inchesToMeters(4);
    public static final double kMaxModuleAngularSpeedRadiansPerSecond = Math.PI;
    public static final double kMaxModuleAngularAccelerationRadiansPerSecondSquared = Math.PI;
    public static final double kSteerReduction = (15.0 / 32.0) * (10.0 / 60.0);
    public static final double kDriveReduction = (14.0 / 50.0) * (25.0 / 19.0) * (15.0 / 45.0);
    public static final int kEncoderCPR = 4096;
    public static final double kPTurning = 0.5;
    public static final double kDriveEncoderRot2Meter = kDriveReduction * Math.PI * kWheelDiameterMeters * (89.0/100.0);
    public static final double kTurningEncoderRot2Rad = kSteerReduction * MathMethods.Tau;
    public static final double kDriveEncoderRPM2MeterPerSec = kDriveEncoderRot2Meter / 60;
    public static final double kTurningEncoderRPM2RadPerSec = kTurningEncoderRot2Rad / 60;
    public static final double kDriveEncoderDistancePerPulse =
        // Assumes the encoders are directly mounted on the wheel shafts
        (kWheelDiameterMeters * Math.PI * kDriveReduction) / (double) kEncoderCPR;

    public static final double kTurningEncoderDistancePerPulse =
        // Assumes the encoders are on a 1:1 reduction with the module shaft.
        (2 * Math.PI * kSteerReduction) / (double) kEncoderCPR;

    public static final double kPModuleTurningController = 1;

    public static final double kPModuleDriveController = 1;
  }

  public static final class DriveConstants {
    public static final int kFrontLeftDriveMotorPort = 2;
    public static final int kRearLeftDriveMotorPort = 6;
    public static final int kFrontRightDriveMotorPort = 4;
    public static final int kRearRightDriveMotorPort = 8;

    public static final int kFrontLeftTurningMotorPort = 1;
    public static final int kRearLeftTurningMotorPort = 5;
    public static final int kFrontRightTurningMotorPort = 3;
    public static final int kRearRightTurningMotorPort = 7;



    public static final boolean kFrontLeftTurningMotorReversed = true;
    public static final boolean kRearLeftTurningMotorReversed = true;
    public static final boolean kFrontRightTurningMotorReversed = true;
    public static final boolean kRearRightTurningMotorReversed = true;


    public static final boolean kFrontLeftDriveMotorReversed = false;
    public static final boolean kRearLeftDriveMotorReversed = false;
    public static final boolean kFrontRightDriveMotorReversed = false;
    public static final boolean kRearRightDriveMotorReversed = false;

    public static final int kFrontLeftAbsEncoderPort = 19;
    public static final int kRearLeftAbsEncoderPort = 18;
    public static final int kFrontRightAbsEncoderPort = 16;
    public static final int kRearRightAbsEncoderPort = 17;
    
    public static final boolean kFrontLeftDriveAbsoluteEncoderReversed = false;
    public static final boolean kRearLeftDriveAbsoluteEncoderReversed = false;
    public static final boolean kFrontRightDriveAbsoluteEncoderReversed = false;
    public static final boolean kRearRightDriveAbsoluteEncoderReversed = false;

    //Fix Front and rear left offsets
    public static final double kFrontLeftDriveAbsoluteEncoderOffsetRad = Math.toRadians(34.0);
    public static final double kRearLeftDriveAbsoluteEncoderOffsetRad = Math.toRadians(-13.5);
    public static final double kFrontRightDriveAbsoluteEncoderOffsetRad = Math.toRadians(45.1);
    public static final double kRearRightDriveAbsoluteEncoderOffsetRad = Math.toRadians(153.2);


    public static final double kTrackWidth = 0.533;
    // Distance between centers of right and left wheels on robot
    public static final double kWheelBase = 0.533;
    // Distance between front and back wheels on robot
    public static final SwerveDriveKinematics kDriveKinematics =
        new SwerveDriveKinematics(
            new Translation2d(kWheelBase / 2, kTrackWidth / 2),
            new Translation2d(kWheelBase / 2, -kTrackWidth / 2),
            new Translation2d(-kWheelBase / 2, kTrackWidth / 2),
            new Translation2d(-kWheelBase / 2, -kTrackWidth / 2));

    public static final boolean kGyroReversed = false;

    // These are example values only - DO NOT USE THESE FOR YOUR OWN ROBOT!
    // These characterization values MUST be determined either experimentally or theoretically
    // for *your* robot's drive.
    // The SysId tool provides a convenient method for obtaining these values for your robot.
    public static final double ksVolts = 1;
    public static final double kvVoltSecondsPerMeter = 0.8;
    public static final double kaVoltSecondsSquaredPerMeter = 0.15;
    public static final double driveBaseRadius = 1;

  }


  public static final class OIConstants {
    public static final int kDriverControllerPort = 0;
    public static final int kSecondaryControllerPort = 1;

    public static final int kDriverYAxis = 1;
    public static final int kDriverXAxis = 0;
    public static final int kDriverRotAxis = 4;
    public static final int kDriverFieldOrientedButtonIdx = 1;
    public static final double kDeadband = 0.1;

    
  }

  public static final class AutoConstants {

    public static final double kPXController = 1;
    public static final double kPYController = 1;
    public static final double kPThetaController = 1;
    public static final double kAutoMaxSpeedMetersPerSecond = 3;
    public static final double kAutoMaxAccelerationMetersPerSecondSquared = 2;
    public static final double kAutoBalanceSpeedFactor = 0.407;
    public static final double kAutoBalanceMaxSpeedMetersPerSecond = 0.15;
    public static final double kFieldEndXCoordinate = 16.5;

    // Constraint for the motion profiled robot angle controller
    public static final TrapezoidProfile.Constraints kThetaControllerConstraints =
        new TrapezoidProfile.Constraints(
            kMaxAngularSpeedRadiansPerSecond, kMaxAngularAccelerationRadiansPerSecondSquared);
  }
 }

