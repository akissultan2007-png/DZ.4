public class Bus implements IVehicle {
    private final int seats;
    private final String routeName;
    private final boolean hasWifi;

    public Bus(int seats, String routeName, boolean hasWifi) {
        this.seats = seats;
        this.routeName = routeName;
        this.hasWifi = hasWifi;
    }

    @Override
    public void drive() {
        System.out.println("Bus on route '" + routeName + "' is driving with " + seats + " seats.");
    }

    @Override
    public void refuel() {
        System.out.println("Refueling Bus (diesel/CNG depending on model). WiFi: " + (hasWifi ? "YES" : "NO"));
    }

    @Override
    public String toString() {
        return "Bus{seats=" + seats + ", routeName='" + routeName + "', hasWifi=" + hasWifi + "}";
    }
}
