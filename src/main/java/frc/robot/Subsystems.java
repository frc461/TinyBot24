package frc.robot;

public class Subsystems {
    private static DriveTrain drivetrain = new DriveTrain();
    private static Arm arm;
    
    public static DriveTrain getDriveTrain() {
        return drivetrain;
    }

    public static Arm getArm() {
        return arm;
    }
}
