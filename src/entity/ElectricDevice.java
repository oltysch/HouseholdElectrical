package entity;

public abstract class ElectricDevice {
    private  String name;
    private int power;
    private Boolean pluggedIn;

    public ElectricDevice(String type, int power) {
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
        return power;
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
}
