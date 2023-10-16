package pl.javastart.task.vehicles;

public abstract class Vehicle {
    private final String name;
    private final double tankCapacity;
    private final double avgFuelConsumption;

    public Vehicle(String name, double tankCapacity, double avgFuelConsumption) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.avgFuelConsumption = avgFuelConsumption;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public double getAvgFuelConsumption() {
        return avgFuelConsumption;
    }

    public abstract double getRange();

    public abstract String getTotalInfo();

    public abstract void turnAcOn();

    public String getBasicInfo() {
        return name + "\n\tPojemność silnika: " + tankCapacity + "\n\tŚrednie spalanie: " + avgFuelConsumption + " na 100 km";
    }
}
