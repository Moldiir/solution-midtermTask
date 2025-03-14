package smartHome.factory;


import smartHome.devices.SmartDevice;

public interface SmartDeviceFactory {
    SmartDevice createLight();

    SmartDevice createThermostat();

    SmartDevice createCamera();
}
