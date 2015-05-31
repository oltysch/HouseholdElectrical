package logic;

import entity.ElectricDevice;
import java.util.ArrayList;
import java.util.List;

public class Home {
    private List<ElectricDevice> devices = new ArrayList<ElectricDevice>();

//    calculate power consumption only for plugged devices
    public static int calculatePowerConsumption(List<ElectricDevice> devices) {
        int power=0;
        for(ElectricDevice device: devices) {
            if (device.isPluggedIn()) {
                power += device.getPower();
            }
        }
        return power;
    }

    public static List findDeviceByPowerRange(List<ElectricDevice> devices, int minRange, int maxRange) {
        List<ElectricDevice> resDevices = new ArrayList<ElectricDevice>();
        for (ElectricDevice device: devices) {
            if ((device.getPower()>=minRange)&&(device.getPower()<=maxRange)) {
                resDevices.add(device);
            }
        }
        return resDevices;
    }

    public List<ElectricDevice> getDevices() {
        return devices;
    }

    public void setDevices(List<ElectricDevice> devices) {
        this.devices = devices;
    }
}
