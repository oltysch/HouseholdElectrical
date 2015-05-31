package entity;

/**
 * Created by Admin on 26.05.2015.
 */
public class EntertainmentDevice extends ElectricDevice {
    private String resolution;

    public EntertainmentDevice(String name, int power, String resolution) {
        super(name, power);
        this.resolution = resolution;
    }

    public EntertainmentDevice(String name, int power) {
        super(name, power);
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        String result = getName() + ", Power: " + getPower();
        if (resolution!=null) {
            result+=", Resolution: " + resolution;
        }
        if (this.isPluggedIn()) {result+=", on";}else {result+=", off";}
        return result;
    }
}
