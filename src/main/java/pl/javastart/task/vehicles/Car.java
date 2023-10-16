package pl.javastart.task.vehicles;

public class Car extends Vehicle {
    private boolean airConditioningOn;
    private static final double AC_FUEL_CONSUMPTION = 0.8;

    public Car(String name, double tankCapacity, double avgFuelConsumption, boolean airConditioningOn) {
        super(name, tankCapacity, avgFuelConsumption);
        this.airConditioningOn = airConditioningOn;
    }

    @Override
    public double getRange() {
        double totalFuelConsumption = getAvgFuelConsumption();

        if (airConditioningOn) {
            totalFuelConsumption += AC_FUEL_CONSUMPTION;
        }

        return getTankCapacity() / totalFuelConsumption * 100;
    }

    @Override
    public String getTotalInfo() {
        return String.format("%s%s%n\tZasięg pojazdu: %.2f km", getBasicInfo(), getAcInfo(), getRange());
    }

    @Override
    public void turnAcOn() {
        if (!airConditioningOn) {
            airConditioningOn = true;
        }
    }

    String getAcInfo() {
        return airConditioningOn ? "\n\tKlimatyzacja jest włączona. Współczynnik spalania " +
                "przy włączonej klimatyzacji to " + AC_FUEL_CONSUMPTION + "l dodatkowo do średniego spalania pojazdu."
                : "\n\tKlimatyzacja jest wyłączona.";
    }

    boolean isAirConditioningOn() {
        return airConditioningOn;
    }
}
