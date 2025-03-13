package smartHome.factory;

public interface SmartDeviceFactory {
    SmartLight createLight();
    SmartThermostat createThermostat();
    SmartCamera createCamera();
}
