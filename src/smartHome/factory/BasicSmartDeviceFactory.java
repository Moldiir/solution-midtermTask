package smartHome.factory;


import smartHome.devices.*;

public class BasicSmartDeviceFactory implements SmartDeviceFactory {

    @Override
    public SmartDevice createLight() {
        return new SmartLight();
    }

    @Override
    public SmartDevice createThermostat() {
        return new SmartThermostat();
    }

    @Override
    public SmartDevice createCamera() {
        return new SmartCamera();
    }
}
