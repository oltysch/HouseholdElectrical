import entity.*;
import logic.Home;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {
    private static Home home = new Home();
    public static void main(String[] args) {
        List devices = new ArrayList();

        devices.add(ElectricDevice.create(ElectricDevice.KICHEN_DEVICE, "Teapot", 800));
        devices.add(ElectricDevice.create(ElectricDevice.KICHEN_DEVICE, "Microwave", 1500));
        devices.add(ElectricDevice.create(ElectricDevice.ENTERTAINMENT_DEVICE, "TV", 150));
        devices.add(ElectricDevice.create(ElectricDevice.KICHEN_DEVICE, "Refrigerator", 300));
        devices.add(ElectricDevice.create(ElectricDevice.COMPUTER_DEVICE, "Pentium4", 300));
        devices.add(ElectricDevice.create(ElectricDevice.COMPUTER_DEVICE, "Core i5", 600));
        Collections.sort(devices);
        home.setDevices((ArrayList)devices);
        ElectricDevice.plugInDevice(home.getDevices().get(0), home.getDevices().get(2), home.getDevices().get(3));
        System.out.println("Устройства:");
        for (ElectricDevice device: home.getDevices()) {
            System.out.println(device);
        }
        System.out.println("\npower consumption: "+Home.calculatePowerConsumption(home.getDevices()));
    }
}
