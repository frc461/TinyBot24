package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;



public class DriveTrain extends SubsystemBase {
    public TalonFX rightMotor = new TalonFX(5);
    public TalonFX leftMotor = new TalonFX(6);


    // public void driveAuto(double target) {
    //     rightMotor.set(ControlMode.Velocity, 0);
    //     leftMotor.set(ControlMode.Velocity, 0);
    //     while(rightMotor.getRotorPosition()<target && leftMotor.getRotorPosition()<target) {
    //         rightMotor.set(0.1);
    //         leftMotor.set(0.1);
    //     }
    // }

    public void driveTeleopTank(double powerRight, double powerLeft) {
        rightMotor.set(powerRight);
        leftMotor.set(powerLeft);

    }
}
