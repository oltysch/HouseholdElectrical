package entity;

/*
 * Basic class for all Electric Devices
 */

public abstract class ElectricDevice implements Comparable {
    private String name;
    private int power;
    private Boolean pluggedIn=false;
    public static final int KICHEN_DEVICE =0;
    public static final int COMPUTER_DEVICE =1;
    public static final int ENTERTAINMENT_DEVICE =2;

    public static ElectricDevice create(int type, String name, int power) {
        switch (type) {
            case KICHEN_DEVICE: return new KichenDevice(name, power);
            case ENTERTAINMENT_DEVICE: return new EntertainmentDevice(name, power);
            case COMPUTER_DEVICE: return new ComputerDevice(name, power);
            default: return null;
        }
    }

    public ElectricDevice(String name, int power) {
        this.name =  name;
        this.power = power;
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

    public static void plugInDevice(ElectricDevice device) {
        device.pluggedIn=true;
    }

    public static void plugInDevice(ElectricDevice... devices) {
        if (devices.length>0) {
            for (int i=0; i<devices.length; i++) {
                devices[i].pluggedIn=true;
            }
        }
    }

    public static void plugOutDevice(ElectricDevice device) {
        device.pluggedIn=false;
    }
    public static void plugOutDevice(ElectricDevice... devices) {
        if (devices.length>0) {
            for (int i=0; i<devices.length; i++) {
                devices[i].pluggedIn=false;
            }
        }
    }

    @Override
    public int compareTo(Object obj) {
        ElectricDevice tmp = (ElectricDevice)obj;
        if (this.power < tmp.power) {
            return -1;
        } else if (this.power > tmp.power) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        String result = name + ", Power: " + power;
        if (this.pluggedIn) {result+=", on";}else {result+=", off";}
        return result;
    }
}