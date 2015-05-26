import entity.*;

import java.util.ArrayList;

public class Runner {
    private static ArrayList<ElectricDevice> devices = new ArrayList<ElectricDevice>();
    public static void main(String[] args) {
        devices.add(ElectricDevice.create(ElectricDevice.KICHEN_DEVICE, "Teapot", 800));
        devices.add(ElectricDevice.create(ElectricDevice.KICHEN_DEVICE, "Microwave", 1500));
        devices.add(ElectricDevice.create(ElectricDevice.ENTERTAINMENT_DEVICE, "TV", 150));
        devices.add(ElectricDevice.create(ElectricDevice.KICHEN_DEVICE, "Refrigerator", 300));
        System.out.println(devices.get(1).getName());
    }
}
