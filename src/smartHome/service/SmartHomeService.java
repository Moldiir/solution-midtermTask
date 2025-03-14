package smartHome.service;

import smartHome.devices.*;
import smartHome.factory.*;
import smartHome.adapter.*;
import smartHome.composite.*;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeService {
    private List<SmartRoom> rooms = new ArrayList<>();

    public void addRoom(SmartRoom room) {
        rooms.add(room);
        System.out.println("Room added to the system.");
    }

    public void powerOnAllDevices() {
        for (SmartRoom room : rooms) {
            room.powerOn();
        }
    }

    public void powerOffAllDevices() {
        for (SmartRoom room : rooms) {
            room.powerOff();
        }
    }

    public void setTemperatureInAllRooms(int temperature) {
        for (SmartRoom room : rooms) {
            for (SmartDevice device : room.getDevices()) {
                if (device instanceof SmartThermostat) {
                    ((SmartThermostat) device).setTemperature(temperature);
                }
            }
        }
    }

    public String getHouseStatusReport() {
        StringBuilder report = new StringBuilder("House status report:\n");
        for (SmartRoom room : rooms) {
            report.append(room.checkStatus()).append("\n");
        }
        return report.toString();
    }

    public static void main(String[] args) {
        SmartDeviceFactory factory = new AdvancedSmartDeviceFactory();

        SmartDevice light = factory.createLight();
        SmartDevice thermostat = factory.createThermostat();
        SmartDevice camera = factory.createCamera();

        SmartRoom livingRoom = new SmartRoom();
        livingRoom.addDevice(light);
        livingRoom.addDevice(thermostat);
        livingRoom.addDevice(camera);

        SmartDevice doorLock = new DoorLockAdapter();
        livingRoom.addDevice(doorLock);

        SmartHomeService smartHomeService = new SmartHomeService();
        smartHomeService.addRoom(livingRoom);

        smartHomeService.powerOnAllDevices();
        smartHomeService.setTemperatureInAllRooms(22);
        System.out.println(smartHomeService.getHouseStatusReport());
        smartHomeService.powerOffAllDevices();
    }
}
