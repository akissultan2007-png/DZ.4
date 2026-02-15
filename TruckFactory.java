public class TruckFactory extends VehicleFactory {
    private final double payloadTons;
    private final int axles;

    public TruckFactory(double payloadTons, int axles) {
        this.payloadTons = payloadTons;
        this.axles = axles;
    }

    @Override
    public IVehicle createVehicle() {
        return new Truck(payloadTons, axles);
    }
}
