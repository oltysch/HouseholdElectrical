package entity;

public abstract class ElectricDevice {
    private  String name;
    private int power;
    private Boolean pluggedIn;
    public static final int KICHEN_DEVICE =0;
    public static final int COMPUTER_DEVICE =1;
    public static final int CLEARING_DEVICE =2;
    public static final int ENTERTAINMENT_DEVICE =3;
    public static final int MICROCLIMATE_CONTROL_DEVICE =4;

    public static ElectricDevice create(int type, String name, int power) {
        switch (type) {
            case KICHEN_DEVICE: return new KichenDevice(name, power);
            case MICROCLIMATE_CONTROL_DEVICE: return new MicroclimateControlDevice(name, power);
            case ENTERTAINMENT_DEVICE: return new EntertainmentDevice(name, power);
            case COMPUTER_DEVICE: return new ComputerDevice(name, power);
            case CLEARING_DEVICE: return new ClearingDevice(name, power);
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
