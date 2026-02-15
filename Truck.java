public class Truck implements IVehicle {
    private final double payloadTons;  
    private final int axles;           

    public Truck(double payloadTons, int axles) {
        this.payloadTons = payloadTons;
        this.axles = axles;
    }

    @Override
    public void drive() {
        System.out.println("Truck (" + payloadTons + " tons, " + axles + " axles) is moving.");
    }

    @Override
    public void refuel() {
        System.out.println("Refueling Truck (diesel).");
    }

    @Override
    public String toString() {
        return "Truck{payloadTons=" + payloadTons + ", axles=" + axles + "}";
    }
}
