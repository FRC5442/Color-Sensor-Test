/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ExampleSubsystem extends SubsystemBase {
  /**
   * Creates a new ExampleSubsystem.
   */

  static Compressor compressor = new Compressor(0);
  DoubleSolenoid chopstick1Solenoid = new DoubleSolenoid(0, 1);
  

  public ExampleSubsystem() {
    compressor.start();
  }

  public void toggleChopstickSolenoid(Value position) {
    chopstick1Solenoid.set(position);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
