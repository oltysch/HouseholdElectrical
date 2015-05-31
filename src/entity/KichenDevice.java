package entity;

/**
 * Created by Admin on 26.05.2015.
 */
public class KichenDevice extends ElectricDevice {
    private String appointment;

    public KichenDevice(String name, int power, String appointment) {
        super(name, power);
        this.appointment = appointment;
    }

    public KichenDevice(String name, int power) {
        super(name, power);
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    @Override
    public String toString() {
        String result = getName() + ", Power: " + getPower();
        if (appointment!=null) {
            result+=", Appointment: " + appointment;
        }
        if (isPluggedIn()) {result+=", on";}else {result+=", off";}
        return result;
    }
}
