import entity.*;
import logic.DeviceFactory;
import logic.Home;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {
    private static Home home = new Home();
    public static void main(String[] args) {
        home.setDevices(DeviceFactory.randomizedCreating(3,3,3));
        List<ElectricDevice> devices = home.getDevices();
        Collections.sort(devices);
        ElectricDevice.plugInDevice(devices.get(0), devices.get(2), devices.get(3));
        System.out.println("Devices:");
        for (ElectricDevice device: devices) {
            System.out.println(device);
        }
        System.out.println("\npower consumption: "+Home.calculatePowerConsumption(devices));
        List<ElectricDevice> request = Home.findDeviceByPowerRange(devices,400,1000);
        System.out.println("\nустройства с энергопотреблением 400-1000:");
        for (ElectricDevice device: request) {
            System.out.println(device);
        }
    }
}
