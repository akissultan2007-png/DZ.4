import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        List<IVehicle> garage = new ArrayList<>();

        while (true) {
            System.out.println("\n=== Vehicle System (Factory Method) ===");
            System.out.println("1) Create Car");
            System.out.println("2) Create Motorcycle");
            System.out.println("3) Create Truck");
            System.out.println("4) Create Bus (new type)");
            System.out.println("5) Show garage");
            System.out.println("6) Drive all");
            System.out.println("7) Refuel all");
            System.out.println("0) Exit");
            System.out.print("Choose: ");

            int choice = readInt(sc);

            if (choice == 0) {
                System.out.println("Bye!");
                break;
            }

            switch (choice) {
                case 1 -> {
                    System.out.print("Brand: ");
                    String brand = readLine(sc);
                    System.out.print("Model: ");
                    String model = readLine(sc);
                    System.out.print("Fuel type (gasoline/diesel/electric): ");
                    String fuel = readLine(sc);

                    VehicleFactory factory = new CarFactory(brand, model, fuel);
                    IVehicle car = factory.createVehicle();
                    garage.add(car);
                    System.out.println("Created: " + car);
                }
                case 2 -> {
                    System.out.print("Motorcycle type (sport/touring/etc): ");
                    String type = readLine(sc);
                    System.out.print("Engine volume (cc): ");
                    int cc = readInt(sc);

                    VehicleFactory factory = new MotorcycleFactory(type, cc);
                    IVehicle moto = factory.createVehicle();
                    garage.add(moto);
                    System.out.println("Created: " + moto);
                }
                case 3 -> {
                    System.out.print("Payload (tons): ");
                    double tons = readDouble(sc);
                    System.out.print("Axles: ");
                    int axles = readInt(sc);

                    VehicleFactory factory = new TruckFactory(tons, axles);
                    IVehicle truck = factory.createVehicle();
                    garage.add(truck);
                    System.out.println("Created: " + truck);
                }
                case 4 -> {
                    System.out.print("Seats: ");
                    int seats = readInt(sc);
                    System.out.print("Route name: ");
                    String route = readLine(sc);
                    System.out.print("Has WiFi? (true/false): ");
                    boolean wifi = readBoolean(sc);

                    VehicleFactory factory = new BusFactory(seats, route, wifi);
                    IVehicle bus = factory.createVehicle();
                    garage.add(bus);
                    System.out.println("Created: " + bus);
                }
                case 5 -> {
                    if (garage.isEmpty()) {
                        System.out.println("Garage is empty.");
                    } else {
                        System.out.println("Garage vehicles:");
                        for (int i = 0; i < garage.size(); i++) {
                            System.out.println((i + 1) + ") " + garage.get(i));
                        }
                    }
                }
                case 6 -> {
                    if (garage.isEmpty()) System.out.println("Garage is empty.");
                    for (IVehicle v : garage) v.drive();
                }
                case 7 -> {
                    if (garage.isEmpty()) System.out.println("Garage is empty.");
                    for (IVehicle v : garage) v.refuel();
                }
                default -> System.out.println("Unknown option.");
            }
        }

        sc.close();
    }



    private static String readLine(Scanner sc) {
        String s = sc.nextLine();
        while (s.isBlank()) s = sc.nextLine();
        return s.trim();
    }

    private static int readInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("Enter an integer: ");
            sc.next(); 
        }
        int x = sc.nextInt();
        sc.nextLine(); 
        return x;
    }

    private static double readDouble(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.print("Enter a number: ");
            sc.next();
        }
        double x = sc.nextDouble();
        sc.nextLine();
        return x;
    }

    private static boolean readBoolean(Scanner sc) {
        while (!sc.hasNextBoolean()) {
            System.out.print("Enter true/false: ");
            sc.next();
        }
        boolean x = sc.nextBoolean();
        sc.nextLine();
        return x;
    }
}
