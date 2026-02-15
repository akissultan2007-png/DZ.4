public class MotorcycleFactory extends VehicleFactory {
    private final String motoType;
    private final int engineVolumeCc;

    public MotorcycleFactory(String motoType, int engineVolumeCc) {
        this.motoType = motoType;
        this.engineVolumeCc = engineVolumeCc;
    }

    @Override
    public IVehicle createVehicle() {
        return new Motorcycle(motoType, engineVolumeCc);
    }
}
