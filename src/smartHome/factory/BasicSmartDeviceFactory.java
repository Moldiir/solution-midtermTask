package smartHome.factory;

public class BasicSmartDeviceFactory implements SmartDeviceFactory {
    @Override
    public SmartLight createLight() {
        return new SmartLight();
    }

    @Override
    public SmartThermostat createThermostat() {
        return new SmartThermostat();
    }

    @Override
    public SmartCamera createCamera() {
        return new SmartCamera();
    }
}
