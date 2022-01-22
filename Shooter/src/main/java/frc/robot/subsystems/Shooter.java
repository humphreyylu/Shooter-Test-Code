package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {
    private CANSparkMax shooterSpark1;
    private CANSparkMax shooterSpark2;
    private VictorSP shooterSpark3;
    private MotorControllerGroup shooterMotors;

    public Shooter() {
        shooterSpark1 = new CANSparkMax(1,MotorType.kBrushless);
        shooterSpark2 = new CANSparkMax(2,MotorType.kBrushless);
        shooterSpark3 = new VictorSP(0);
        shooterMotors = new MotorControllerGroup(shooterSpark1, shooterSpark2, shooterSpark3);
    }

    
    public MotorControllerGroup getShooterMotors() {
        return shooterMotors;
    }
    
}
