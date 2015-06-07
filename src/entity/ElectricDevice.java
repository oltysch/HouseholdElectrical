package entity;

/*
 * Basic class for all Electric Devices
 */

import java.util.Comparator;

public abstract class ElectricDevice {
    private String name;
    private int power;
    private int price;

    public static final Comparator<ElectricDevice> COMPARE_BY_POWER = new Comparator<ElectricDevice>() {
        @Override
        public int compare(ElectricDevice device1, ElectricDevice device2) {
            if (device1.power < device2.power) return -1;
            else if (device1.power > device2.power) return 1;
            return 0;
        }
    };
    public static final Comparator<ElectricDevice> COMPARE_BY_PRICE = new Comparator<ElectricDevice>() {
        @Override
        public int compare(ElectricDevice device1, ElectricDevice device2) {
            if (device1.price < device2.price) return -1;
            else if (device1.price > device2.price) return 1;
            return 0;
        }
    };

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private Boolean pluggedIn = false;

    public ElectricDevice(String name, int power, int price) {
        this.name = name;
        this.power = power;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return this.power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Boolean isPluggedIn() {
        return pluggedIn;
    }

    public void setPluggedIn(Boolean pluggedIn) {
        this.pluggedIn = pluggedIn;
    }

    /*@Override
    public int compareTo(Object obj) {
        ElectricDevice tmp = (ElectricDevice) obj;
        if (this.power < tmp.power) {
            return -1;
        } else if (this.power > tmp.power) {
            return 1;
        }
        return 0;
    }*/

    @Override
    public String toString() {
        String result = name + ", Power: " + power;
        if (this.pluggedIn) {
            result += ", on";
        } else {
            result += ", off";
        }
        return result;
    }
}