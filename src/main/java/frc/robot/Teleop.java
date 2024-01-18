package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Teleop {
    private XboxController driverController = new XboxController(0);
    private DriveTrain driveTrain = Subsystems.getDriveTrain();
    private boolean tank = true;


    public void run() {

        

        driveTrain.driveTeleopTank( driverController.getLeftY(),driverController.getLeftX());
        
    //     if(tank == true) {

    //         double driveLeft = driverController.getLeftY();
    //         double driveRight = driverController.getRightY();

    //         if((driveLeft > 0.1) || (driveLeft < -0.1)) {
    //             driveTrain.driveTeleopTank(0, driveLeft);
    //         }

    //         if((driveRight > 0.1) || (driveRight < -0.1)) {
    //             driveTrain.driveTeleopTank(driveRight, 6);
    //         }
    //     }
    //     else {
    //         double drive = driverController.getLeftY();
    //         double turn = driverController.getRightY();

    //         if((drive > 0.1) || (drive < -0.1)) {
    //             driveTrain.driveTeleopTank(drive, drive);     
    //         }

    //         if(turn > 0.1) {
    //             driveTrain.driveTeleopTank(turn, turn*(-1));
    //         }
            
    //         if(turn < -0.1) {
    //             driveTrain.driveTeleopTank(turn*(-1), turn);
    //         }
    //     }

     }

}
