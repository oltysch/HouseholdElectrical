/**
 * Created by Admin on 31.05.2015.
 */

package logic;

import entity.ComputerDevice;
import entity.ElectricDevice;
import entity.EntertainmentDevice;
import entity.KichenDevice;

import java.util.ArrayList;
import java.util.Random;

public class DeviceFactory {
    public static ArrayList<ElectricDevice> randomizedCreating(int countComputerDevices,
                                                               int countEntertainmentDevices, int countKichenDevices) {
        Random random = new Random();
        ArrayList<ElectricDevice> devices = new ArrayList<ElectricDevice>();
        for (int i = 0; i < countComputerDevices; i++) {
            devices.add(new ComputerDevice("ComputerDevice"+i,random.nextInt(350)+250, random.nextDouble()));
        }
        for (int i = 0; i < countEntertainmentDevices; i++) {
            devices.add(new EntertainmentDevice("EntertainmentDevice"+i,random.nextInt(100)+100, "1920x1080"));
        }
        for (int i = 0; i < countKichenDevices; i++) {
            devices.add(new KichenDevice("KichenDevice"+i,random.nextInt(700)+300, "heats the food"));
        }
        return devices;
    }
}
