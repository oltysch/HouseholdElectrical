package entity;

/*
 * Basic class for all Electric Devices
 */

public abstract class ElectricDevice implements Comparable {
    private String name;
    private int power;
    private Boolean pluggedIn=false;

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

    public void setPluggedIn(Boolean pluggedIn) {
        this.pluggedIn=pluggedIn;
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