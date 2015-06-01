package logic;

import entity.ElectricDevice;
import java.util.ArrayList;
import java.util.List;

public class Home {
    private List<ElectricDevice> devices = new ArrayList<ElectricDevice>();

//    calculate power consumption only for plugged devices
    public int calculatePowerConsumption() {
        int power=0;
        for(ElectricDevice device: devices) {
            if (device.isPluggedIn()) {
                power += device.getPower();
            }
        }
        return power;
    }

    public List findDeviceByPowerRange(int minRange, int maxRange) {
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
