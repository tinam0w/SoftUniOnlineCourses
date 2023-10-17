package PolymorphismExersice.VehiclesExtension;

import java.text.DecimalFormat;

public class Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;
    private int tankCapacity;

    public Vehicle(double fuelQuantity, double fuelConsumption, int capacity) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = capacity;
    }

    public String drive(double distance) {
        double fuelNeeded = distance * getFuelConsumption();

        if (fuelNeeded > getFuelQuantity()) {
            return String.format("%s needs refueling", this.getClass().getSimpleName());
        }

        setFuelQuantity(getFuelQuantity() - fuelNeeded);

        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        String formatted = decimalFormat.format(distance);
        return String.format("%s travelled %s km",this.getClass().getSimpleName() ,formatted);
    }

    public void refuel(double liters) {
        if (liters <= 0){
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        if (fuelQuantity + liters > tankCapacity){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }

        this.fuelQuantity += liters;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.getFuelQuantity());
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }
}
