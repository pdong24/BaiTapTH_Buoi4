import java.util.ArrayList;
import java.util.List;

public class SmartHub {
    private List<Device> devices = new ArrayList<>();

    public void addDevice(Device device) {
        devices.add(device);
    }

    public void turnOffAll() {
        for (Device device : devices) {
            device.turnOff();
        }
    }

    public void setupWifi() {
        for (Device device : devices) {
            if (device instanceof WifiConnectable wifiDevice) {
                wifiDevice.connectWifi();
            }
        }
    }
}