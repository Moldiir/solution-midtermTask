package smartHome.devices;


public class SmartThermostat implements SmartDevice {
    private int currentTemp = 20;
    private boolean isPowered = false;

    @Override
    public void powerOn() {
        isPowered = true;
        System.out.println("Thermostat is ON.");
    }

    @Override
    public void powerOff() {
        isPowered = false;
        System.out.println("Thermostat is OFF.");
    }

    public void setTemperature(int temp) {
        this.currentTemp = temp;
        System.out.println("Temperature set to " + temp + "°C.");
    }

    @Override
    public String checkStatus() {
        return "Thermostat: " + (isPowered ? "ON" : "OFF") + ", Temperature: " + currentTemp + "°C";
    }
}