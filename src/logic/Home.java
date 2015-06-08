package logic;

import entity.ElectricDevice;

import java.util.*;

public class Home {
    private List<ElectricDevice> devices = new ArrayList<ElectricDevice>();

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

    //    finding devices by price
    public ArrayList findDeviceByPriceRange(int minRange, int maxRange) {
        ArrayList<ElectricDevice> resDevices = new ArrayList<ElectricDevice>();
        for (ElectricDevice device : devices) {
            if ((device.getPrice() >= minRange) && (device.getPrice() <= maxRange)) {
                resDevices.add(device);
            }
        }
        return resDevices;
    }

    //    sorting devices list by name
    public void sortByName() {
        Collections.sort(devices, ElectricDevice.COMPARE_BY_NAME);
    }

    public void sortByPrice() {
        Collections.sort(devices, ElectricDevice.COMPARE_BY_PRICE);
    }

    public void sortByPower() {
        Collections.sort(devices, ElectricDevice.COMPARE_BY_POWER);
    }

    public void plugInDevice(Integer... deviceNumber) {
        if (deviceNumber.length > 0) {
            for (int i : deviceNumber) {
                if (i <= devices.size()) {
                    devices.get(i - 1).setPluggedIn(true);
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

    public void plugOutDevice(int... deviceNumber) {
        if (deviceNumber.length > 0) {
            for (int i : deviceNumber) {
                if (i < devices.size()) {
                    devices.get(i - 1).setPluggedIn(false);
                }
            }
        }
    }

    public List<ElectricDevice> getDevices() {
        return new ArrayList(devices);
    }

    public void setDevices(List<ElectricDevice> devices) {
        this.devices = devices;
    }
}
