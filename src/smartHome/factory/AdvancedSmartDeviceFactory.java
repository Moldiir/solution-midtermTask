package smartHome.factory;

public class AdvancedSmartDeviceFactory implements SmartDeviceFactory {
    @Override
    public SmartLight createLight() {
        return new SmartLight(); // optionally wrap in decorator
    }

    @Override
    public SmartThermostat createThermostat() {
        return new SmartThermostat(); // optionally wrap in decorator
    }

    @Override
    public SmartCamera createCamera() {
        return new SmartCamera();
    }
}
