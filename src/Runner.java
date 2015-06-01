import entity.*;
import logic.DeviceFactory;
import logic.Home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {
    private static Home home = new Home();
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        home.setDevices(DeviceFactory.randomizedCreating(3,3,3));
        List<ElectricDevice> devices = home.getDevices();
        Collections.sort(devices);
        ElectricDevice.plugInDevice(devices.get(0), devices.get(2), devices.get(3), devices.get(5), devices.get(6));
        System.out.println("Devices:");
        for (ElectricDevice device: devices) {
            System.out.println(device);
        }
        System.out.println("\npower consumption: " + home.calculatePowerConsumption());
        System.out.print("Selecting devices:\nEnter a minimal device power: ");
        input=reader.readLine();
        int minPower = Integer.parseInt(input);
        System.out.print("Enter a maximal device power: ");
        input = reader.readLine();
        int maxPower = Integer.parseInt(input);
        List<ElectricDevice> request = home.findDeviceByPowerRange(minPower,maxPower);
        System.out.println("\nDevices with energy consumption " + minPower + "-" + maxPower + ":");
        for (ElectricDevice device: request) {
            System.out.println(device);
        }
    }
}
