public class Light extends Device implements Adjustable {

    public Light(String id, String name) {
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
    public void adjustLevel(int level) {
        System.out.println(name + " brightness set to " + level + "%");
    }
}