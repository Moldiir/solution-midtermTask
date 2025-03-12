package smartHome.devices;

public class SmartLight implements SmartDevice {
    private boolean isPowered = false;

    @Override
    public void powerOn() {
        isPowered = true;
        System.out.println("Light is ON.");
    }

    @Override
    public void powerOff() {
        isPowered = false;
        System.out.println("Light is OFF.");
    }

    @Override
    public String checkStatus() {
        return "Light: " + (isPowered ? "ON" : "OFF");
    }

    public void setBrightness(int level) {
        System.out.println("Light brightness set to " + level + "%.");
    }
}