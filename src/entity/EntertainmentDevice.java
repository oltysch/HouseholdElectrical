package entity;

/**
 * Created by Admin on 26.05.2015.
 */
public class EntertainmentDevice extends ElectricDevice {
    private String screenResolution;

    public EntertainmentDevice(String name, int power) {
        super(name, power);
    }

    public EntertainmentDevice(String name, int power, String resolution) {
        super(name, power);
        this.screenResolution = resolution;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    @Override
    public String toString() {
        String result = getName() + ", Power: " + getPower();
        if (screenResolution !=null) {
            result+=", Resolution: " + screenResolution;
        }
        if (this.isPluggedIn()) {result+=", on";}else {result+=", off";}
        return result;
    }
}
