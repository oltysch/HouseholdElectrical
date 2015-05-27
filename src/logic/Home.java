package logic;

import entity.ElectricDevice;
import java.util.ArrayList;

public class Home {
    private ArrayList<ElectricDevice> devices = new ArrayList<ElectricDevice>();

//    calculate power consumption only for plugged devices
    public static int calculatePowerConsumption(ArrayList<ElectricDevice> devices) {
        int power=0;
        for(ElectricDevice device: devices) {
            if (device.isPluggedIn()) {
                power += device.getPower();
            }
        }
        return power;
    }

    public ArrayList<ElectricDevice> getDevices() {
        return devices;
    }

    public void setDevices(ArrayList<ElectricDevice> devices) {
        this.devices = devices;
    }
}
