// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.DriveTrain;
import frc.robot.Arm;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public final class Autos {
  /** Example static factory for an autonomous command. */
  public static Command moveArm(Arm arm) {
    return new InstantCommand(() ->arm.move(-0.019139));
  }

  //public static Command moveWheel(DriveTrain train) {
    //return new InstantCommand(() -> train.driveAuto(1000));
  //}

  private Autos() {
    throw new UnsupportedOperationException("This is a utility class!");
  }
}
