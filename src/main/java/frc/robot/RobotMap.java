package frc.robot;

import frc.robot.sensors.*;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	
	public static final int PID_MODE = 0;  //0 for closed loop 1 for cascaded closed loop

	/**
	 * Declaring pins
     * TODO: Update pin mapping
	 */
	private static final int LEFT_VICTOR_1 = 1;
	private static final int LEFT_VICTOR_2 = 2;
	private static final int LEFT_VICTOR_3 = 3;
	private static final int RIGHT_VICTOR_1 = 12;
	private static final int RIGHT_VICTOR_2 = 11;//Victor SPX
	private static final int RIGHT_VICTOR_3 = 10;
    
    private static final int DISTANCE_SENSOR = 2708;
    private static final int TAPE_SENSOR = 2708;

	/**
	 * Creating motor controller objects
	 */
	public static VictorSPX left_drive_victor_1 = new VictorSPX(LEFT_VICTOR_1);
	public static VictorSPX left_drive_victor_2 = new VictorSPX(LEFT_VICTOR_2);
	public static VictorSPX left_drive_victor_3 = new VictorSPX(LEFT_VICTOR_3);
	public static VictorSPX right_drive_victor_1 = new VictorSPX(RIGHT_VICTOR_1);
	public static VictorSPX right_drive_victor_2 = new VictorSPX(RIGHT_VICTOR_2);
	public static VictorSPX right_drive_victor_3 = new VictorSPX(RIGHT_VICTOR_3);
	
	/**
	 * Creating Sensor objects
	 */	
	public static final DistanceSensor distance_sensor = new DistanceSensor(DISTANCE_SENSOR);
	public static final AnalogTapeSensor tape_sensor = new AnalogTapeSensor(TAPE_SENSOR);
	
	public static void init() {
		left_drive_victor_2.follow(left_drive_victor_1);
		left_drive_victor_3.follow(left_drive_victor_1);
		right_drive_victor_2.follow(right_drive_victor_1);
		right_drive_victor_3.follow(right_drive_victor_1);	
        /*
		left_drive_talon_1.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Absolute,PID_MODE,0);
        right_drive_talon_1.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Absolute,PID_MODE,0);
        */
	}
}