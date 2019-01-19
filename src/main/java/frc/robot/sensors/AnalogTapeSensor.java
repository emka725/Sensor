//  OPB732WZ Reflective Optical Sensor

package frc.robot.sensors;

import edu.wpi.first.wpilibj.AnalogInput;

public class AnalogTapeSensor extends AnalogInput {
    //  Minimum average raw value required for the sensor to have "detected" the tape
    public final static int RAW_DETECTION_THRESHOLD = 4035;

    public AnalogTapeSensor(int channel) {
        super(channel);
    }

    public boolean isTapeDetected() {
        return this.getAverageValue() >= RAW_DETECTION_THRESHOLD;
    }
}
