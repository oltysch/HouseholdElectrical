import entity.*;

import java.util.ArrayList;

public class Runner {
    private static ArrayList<ElectricDevice> devices = new ArrayList<ElectricDevice>();
    public static void main(String[] args) {
        devices.add(new ElectricDevice("Teapot", 5));
        devices.add(new ElectricDevice("Iron", 4));
        devices.add(new ElectricDevice("TV", 4));
        devices.add(new ElectricDevice("Refrigerator", 3));
        System.out.println(devices.get(1).getName());
    }
}
