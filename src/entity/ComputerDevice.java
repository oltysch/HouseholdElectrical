package entity;

/**
 * Created by Admin on 26.05.2015.
 */
public class ComputerDevice extends ElectricDevice {
    private double processingPowerHZ;

    public ComputerDevice(String name, int power) {
        super(name, power);
    }

    public ComputerDevice(String name, int power, double processingPowerHZ) {
        super(name, power);
        this.processingPowerHZ = processingPowerHZ;
    }

    public double getProcessingPower() {
        return processingPowerHZ;
    }

    public void setProcessingPower(double processingPower) {
        this.processingPowerHZ = processingPower;
    }

    @Override
    public String toString() {
        String result = getName() + ", Power: " + getPower();
        if (processingPowerHZ!=0.0D) {
            result+=", CPU: " + processingPowerHZ + " GHz";
        }
        if (isPluggedIn()) {result+=", on";}else {result+=", off";}
        return result;
    }
}
