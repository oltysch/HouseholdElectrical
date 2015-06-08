import entity.*;
import logic.DeviceFactory;
import logic.Home;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        demonstrate();
    }

    public static void demonstrate() {
        Home home = new Home();
        Scanner scanner = new Scanner(System.in);
        home.setDevices(DeviceFactory.randomizedCreating(9));
        home.sortByPrice();
        home.sortByName();
        home.randomPlugInDevice(4);
        System.out.println("Devices:");
        for (ElectricDevice device : home.getDevices()) {
            System.out.println(device);
        }
        System.out.println("\npower consumption: " + home.calculatePowerConsumption());
        System.out.print("Selecting devices:\nEnter a minimal device power: ");
        int minPower = scanner.nextInt();
        System.out.print("Enter a maximal device power: ");
        int maxPower = scanner.nextInt();
        List<ElectricDevice> request = home.findDeviceByPowerRange(minPower, maxPower);
        System.out.println("\nDevices with energy consumption " + minPower + "-" + maxPower + ":");
        for (ElectricDevice device : request) {
            System.out.println(device);
        }
    }
}
