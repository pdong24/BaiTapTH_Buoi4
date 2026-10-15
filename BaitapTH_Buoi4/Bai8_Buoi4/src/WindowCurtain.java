public class WindowCurtain extends Device {

    public WindowCurtain(String id, String name) {
        super(id, name);
    }

    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println(name + " opened");
    }

    @Override
    public void turnOff() {
        this.isOn = false;
        System.out.println(name + " turned off");
    }
}