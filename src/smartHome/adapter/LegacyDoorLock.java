package smartHome.adapter;


public class LegacyDoorLock {
    public void activateLock() {
        System.out.println("Legacy lock activated.");
    }

    public void deactivateLock() {
        System.out.println("Legacy lock deactivated.");
    }

    public String lockStatus() {
        return "Locked";
    }
}
