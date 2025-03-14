package smartHome.factory;


import smartHome.devices.*;
import smartHome.decorator.LoggingDecorator;
import smartHome.decorator.ScheduledOperationDecorator;

public class AdvancedSmartDeviceFactory implements SmartDeviceFactory {

    @Override
    public SmartDevice createLight() {
        return new LoggingDecorator(new SmartLight());
    }

    @Override
    public SmartDevice createThermostat() {
        return new ScheduledOperationDecorator(new SmartThermostat());
    }

    @Override
    public SmartDevice createCamera() {
        return new SmartCamera(); // можно тоже обернуть в декоратор, если нужно
    }
}
