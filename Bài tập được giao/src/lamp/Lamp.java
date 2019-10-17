package lamp;

public class Lamp {
    private boolean status=false;
    private Battery battery;

    public Lamp(Battery battery){
        this.battery=battery;

    }
    public Lamp(){

    }
    public boolean isOn() {
        return status;
    }

    public void setOn(boolean on) {
        status = on;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }
    public void useLamp(){
       battery.useEnergy();
    }
}
