import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int n = scanner.nextInt();
        SmartHub hub = new SmartHub();

        for (int i = 0; i < n; i++) {
            String type = scanner.next();
            String id = scanner.next();
            String name = scanner.next();

            switch (type) {
                case "L" -> hub.addDevice(new Light(id, name));
                case "AC" -> hub.addDevice(new AC(id, name));
                case "S" -> hub.addDevice(new SmartSpeaker(id, name));
                case "C" -> hub.addDevice(new WindowCurtain(id, name));
            }
        }

        System.out.println("Turn Off All Devices:");
        hub.turnOffAll();

        System.out.println("\nSetup Wifi:");
        hub.setupWifi();

        scanner.close();
    }
}