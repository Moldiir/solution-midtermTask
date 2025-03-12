package smartHome.devices;


public interface SmartDevice {
    void powerOn();
    void powerOff();
    String checkStatus();
}