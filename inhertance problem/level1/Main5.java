class Device {
    String deviceId;
    String status;
    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
    void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status);
    }
}

class Thermostat extends Device {
    int temperatureSetting;
    Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }
    @Override
    void displayStatus() {
        System.out.println("Thermostat -> ID: " + deviceId + ", Status: " + status + ", Temp: " + temperatureSetting);
    }
}

public class Main5 {
    public static void main(String[] args) {
        Thermostat t = new Thermostat("T101", "ON", 24);
        t.displayStatus();
    }
}
