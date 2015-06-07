package logic;

import entity.ElectricDevice;

import java.util.*;

public class Home {
    private List<ElectricDevice> devices = new ArrayList<ElectricDevice>();

    public void plugInDevice(Integer... deviceNumber) {
        if (deviceNumber.length > 0) {
            for (int i : deviceNumber) {
                if (i <= devices.size()) {
                    devices.get(i - 1).setPluggedIn(true);
                }
            }
        }
    }

    public void plugOutDevice(int... deviceNumber) {
        if (deviceNumber.length > 0) {
            for (int i : deviceNumber) {
                if (i < devices.size()) {
                    devices.get(i - 1).setPluggedIn(false);
                }
            }
        }
    }

    public void randomPlugInDevice() {
        Random rnd = new Random();
        for (ElectricDevice device : devices) {
            device.setPluggedIn(rnd.nextBoolean());
        }
    }

    public void randomPlugInDevice(int count) {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < count; i++) {
            numbers.add(random.nextInt(devices.size()) + 1);
        }
        plugInDevice(numbers.toArray(new Integer[numbers.size()]));
    }

    //    calculate power consumption only for plugged devices
    public int calculatePowerConsumption() {
        int power = 0;
        for (ElectricDevice device : devices) {
            if (device.isPluggedIn()) {
                power += device.getPower();
            }
        }
        return power;
    }

    //    finding devices by power
    public ArrayList findDeviceByPowerRange(int minRange, int maxRange) {
        ArrayList<ElectricDevice> resDevices = new ArrayList<ElectricDevice>();
        for (ElectricDevice device : devices) {
            if ((device.getPower() >= minRange) && (device.getPower() <= maxRange)) {
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
