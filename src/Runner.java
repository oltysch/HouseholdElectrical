import entity.*;
import logic.Home;

import java.util.ArrayList;
import java.util.Collections;

public class Runner {
    private static Home home = new Home();
    public static void main(String[] args) {
        home.devices.add(ElectricDevice.create(ElectricDevice.KICHEN_DEVICE, "Teapot", 800));
        home.devices.add(ElectricDevice.create(ElectricDevice.KICHEN_DEVICE, "Microwave", 1500));
        home.devices.add(ElectricDevice.create(ElectricDevice.ENTERTAINMENT_DEVICE, "TV", 150));
        home.devices.add(ElectricDevice.create(ElectricDevice.KICHEN_DEVICE, "Refrigerator", 300));
        home.devices.add(ElectricDevice.create(ElectricDevice.COMPUTER_DEVICE, "Pentium4", 300));
        home.devices.add(ElectricDevice.create(ElectricDevice.COMPUTER_DEVICE, "Core i5", 600));
        Collections.sort(home.devices);
        ElectricDevice.plugInDevice(home.devices.get(0), home.devices.get(2), home.devices.get(3));
        System.out.println("Устройства:");
        for (ElectricDevice device: home.devices) {
            System.out.println(device);
        }
        System.out.println("\npower consumption: "+Home.calculatePowerConsumption(home.devices));
    }
}
