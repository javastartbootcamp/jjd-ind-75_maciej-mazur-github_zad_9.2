package pl.javastart.task.operations;

import pl.javastart.task.vehicles.Car;
import pl.javastart.task.vehicles.Truck;
import pl.javastart.task.vehicles.Vehicle;

public class VehicleUtils {
    private final Vehicle[] vehicles = new Vehicle[5];

    public VehicleUtils() {
        vehicles[0] = new Car("Lamborghini Urus", 75, 12.7, false);
        vehicles[1] = new Car("Volkswagen Passat B8", 66, 4.9, false);
        vehicles[2] = new Car("Audi A3 Limousine", 50, 5.9, false);
        vehicles[3] = new Truck("MAN TGX", 1160, 23.41, false, 3000);
        vehicles[4] = new Truck("Volvo FMX", 630, 12, false, 4500);
    }

    public String getVehiclesInfo() {
        String result = "";

        for (Vehicle vehicle : vehicles) {
            result += vehicle.getTotalInfo() + "\n";
        }

        return result;
    }

    public void turnAcOnInVehicles() {
        for (Vehicle vehicle : vehicles) {
            vehicle.turnAcOn();
        }
    }
}
