public class BusFactory extends VehicleFactory {
    private final int seats;
    private final String routeName;
    private final boolean hasWifi;

    public BusFactory(int seats, String routeName, boolean hasWifi) {
        this.seats = seats;
        this.routeName = routeName;
        this.hasWifi = hasWifi;
    }

    @Override
    public IVehicle createVehicle() {
        return new Bus(seats, routeName, hasWifi);
    }
}
