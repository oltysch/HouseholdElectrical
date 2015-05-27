package logic;

import entity.ElectricDevice;
import java.util.ArrayList;

public class Home {
    public ArrayList<ElectricDevice> devices = new ArrayList<ElectricDevice>();

    public static int calculatePowerConsumption(ArrayList<ElectricDevice> devices) {
        int power=0;
        for(ElectricDevice device: devices) {
            if (device.isPluggedIn()) {
                power += device.getPower();
            }
        }
        return power;
    }
}