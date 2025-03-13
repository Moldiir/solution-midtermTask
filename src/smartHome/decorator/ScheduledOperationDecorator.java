package smartHome.decorator;


import smartHome.devices.SmartDevice;

public class ScheduledOperationDecorator implements SmartDevice {
    private SmartDevice device;

    public ScheduledOperationDecorator(SmartDevice device) {
        this.device = device;
    }

    @Override
    public void powerOn() {
        System.out.println("[SCHEDULED] Device will turn on at 6:00 AM.");
        device.powerOn();
    }

    @Override
    public void powerOff() {
        System.out.println("[SCHEDULED] Device will turn off at 11:00 PM.");
        device.powerOff();
    }

    @Override
    public String checkStatus() {
        return device.checkStatus();
    }
}