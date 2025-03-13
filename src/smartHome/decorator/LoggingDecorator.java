package smartHome.decorator;


import smartHome.devices.SmartDevice;

public class LoggingDecorator implements SmartDevice {
    private SmartDevice device;

    public LoggingDecorator(SmartDevice device) {
        this.device = device;
    }

    @Override
    public void powerOn() {
        System.out.println("[LOG] Powering on device.");
        device.powerOn();
    }

    @Override
    public void powerOff() {
        System.out.println("[LOG] Powering off device.");
        device.powerOff();
    }

    @Override
    public String checkStatus() {
        String status = device.checkStatus();
        System.out.println("[LOG] Checking status: " + status);
        return status;
    }
}
