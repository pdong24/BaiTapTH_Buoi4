public class SmartSpeaker extends Device implements WifiConnectable, Adjustable {

    public SmartSpeaker(String id, String name) {
        super(id, name);
    }

    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println(name + " turned on");
    }

    @Override
    public void turnOff() {
        this.isOn = false;
        System.out.println(name + " turned off");
    }

    @Override
    public void connectWifi() {
        System.out.println(name + " connected to wifi");
    }

    @Override
    public void adjustLevel(int level) {
        System.out.println(name + " volume set to " + level);
    }
}