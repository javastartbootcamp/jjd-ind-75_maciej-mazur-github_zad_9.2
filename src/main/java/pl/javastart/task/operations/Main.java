package pl.javastart.task.operations;

public class Main {

    public static void main(String[] args) {
        VehicleUtils vehicleUtils = new VehicleUtils();
        System.out.println(vehicleUtils.getVehiclesInfo());
        vehicleUtils.turnAcOnInVehicles();
        System.out.println("***************************");
        System.out.println(vehicleUtils.getVehiclesInfo());
    }
}
