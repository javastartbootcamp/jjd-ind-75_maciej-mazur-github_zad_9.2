package pl.javastart.task.vehicles;

public class Truck extends Car {
    private final double cargoWeight;
    private static final double AC_FUEL_CONSUMPTION = 1.6;
    private static final double WEIGHT_FUEL_CONSUMPTION = 0.5;

    public Truck(String name, double tankCapacity, double avgFuelConsumption, boolean airConditioningOn, double cargoWeight) {
        super(name, tankCapacity, avgFuelConsumption, airConditioningOn);
        this.cargoWeight = cargoWeight;
    }

    @Override
    public double getRange() {
        double totalFuelConsumption = avgFuelConsumption + cargoWeight / 100 * WEIGHT_FUEL_CONSUMPTION;

        if (isAirConditioningOn()) {
            totalFuelConsumption += AC_FUEL_CONSUMPTION;
        }

        return tankCapacity / totalFuelConsumption * 100;
    }

    @Override
    public String getTotalInfo() {
        return String.format("%s%s%s%n\tZasięg pojazdu: %.2f km",
                getBasicInfo(), getAcInfo(), getWeightInfo(), getRange());
    }

    private String getWeightInfo() {
        return "\n\tWaga załadunku wynosi " + cargoWeight + " kg. Współczynnik spalania zależnego od wagi to " +
                WEIGHT_FUEL_CONSUMPTION + "l na 100 kg ładunku.";
    }
}
