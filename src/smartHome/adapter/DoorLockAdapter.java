package smartHome.adapter;
import smartHome.devices.SmartDevice;

public class DoorLockAdapter implements SmartDevice {
    private LegacyDoorLock legacyLock = new LegacyDoorLock();

    @Override
    public void powerOn() {
        legacyLock.activateLock();
    }

    @Override
    public void powerOff() {
        legacyLock.deactivateLock();
    }

    @Override
    public String checkStatus() {
        return "Door Lock: " + legacyLock.lockStatus();
    }
}
