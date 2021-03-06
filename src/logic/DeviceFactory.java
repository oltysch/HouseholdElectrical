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
    public static final int KICHEN_DEVICE = 0;
    public static final int COMPUTER_DEVICE = 1;
    public static final int ENTERTAINMENT_DEVICE = 2;
    public static final int DEVICE_TYPES_COUNT = 3;

    public static ArrayList<ElectricDevice> randomizedCreating(int count) {
        Random random = new Random();
        ArrayList<ElectricDevice> devices = new ArrayList<ElectricDevice>();
        for (int i = 0; i < count; i++) {
            switch (random.nextInt(DEVICE_TYPES_COUNT)) {
                case KICHEN_DEVICE:
                    devices.add(new KichenDevice("KichenDevice" + i,
                            random.nextInt(700) + 300, random.nextInt(5000)+5000, "heats the food"));
                    break;
                case COMPUTER_DEVICE:
                    devices.add(new ComputerDevice("ComputerDevice" + i,
                            random.nextInt(100) + 100, random.nextInt(150000)+50000, 3.4));
                    break;
                case ENTERTAINMENT_DEVICE:
                    devices.add(new EntertainmentDevice("EntertainmentDevice" + i,
                            random.nextInt(400) + 200, random.nextInt(100000)+11000, "1920x1080"));
                    break;
                default:
                    break;
            }
        }
        return devices;
    }

    public static ElectricDevice create(int type, String name, int power, int price) {
        switch (type) {
            case KICHEN_DEVICE:
                return new KichenDevice(name, power, price);
            case ENTERTAINMENT_DEVICE:
                return new EntertainmentDevice(name, power, price);
            case COMPUTER_DEVICE:
                return new ComputerDevice(name, power, price);
            default:
                return null;
        }
    }
}
