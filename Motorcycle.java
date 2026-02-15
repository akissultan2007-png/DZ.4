public class Motorcycle implements IVehicle {
    private final String motoType;      
    private final int engineVolumeCc; 

    public Motorcycle(String motoType, int engineVolumeCc) {
        this.motoType = motoType;
        this.engineVolumeCc = engineVolumeCc;
    }

    @Override
    public void drive() {
        System.out.println("Motorcycle (" + motoType + ", " + engineVolumeCc + "cc) is riding.");
    }

    @Override
    public void refuel() {
        System.out.println("Refueling Motorcycle (gasoline).");
    }

    @Override
    public String toString() {
        return "Motorcycle{type='" + motoType + "', engineVolumeCc=" + engineVolumeCc + "}";
    }
}
