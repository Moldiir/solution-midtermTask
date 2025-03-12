package smartHome.devices;


public class SmartCamera implements SmartDevice {
    private boolean isPowered = false;

    @Override
    public void powerOn() {
        isPowered = true;
        System.out.println("Camera is ON.");
    }

    @Override
    public void powerOff() {
        isPowered = false;
        System.out.println("Camera is OFF.");
    }

    @Override
    public String checkStatus() {
        return "Camera: " + (isPowered ? "ON" : "OFF");
    }

    public void startRecording() {
        System.out.println("Video recording started.");
    }
}