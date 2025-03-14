package smartHome.composite;

import smartHome.devices.SmartDevice;

import java.util.ArrayList;
import java.util.List;

public class SmartRoom implements SmartDevice {
    private List<SmartDevice> devices = new ArrayList<>();

    public void addDevice(SmartDevice device) {
        devices.add(device);
        System.out.println("Device added to the room.");
    }

    public List<SmartDevice> getDevices() {
        return devices;
    }

    @Override
    public void powerOn() {
        for (SmartDevice device : devices) {
            device.powerOn();
        }
    }

    @Override
    public void powerOff() {
        for (SmartDevice device : devices) {
            device.powerOff();
        }
    }

    @Override
    public String checkStatus() {
        StringBuilder status = new StringBuilder("Devices in the room:\n");
        for (SmartDevice device : devices) {
            status.append("- ").append(device.checkStatus()).append("\n");
        }
        return status.toString();
    }
}
