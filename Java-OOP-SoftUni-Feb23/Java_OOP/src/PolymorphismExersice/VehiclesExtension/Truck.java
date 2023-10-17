package PolymorphismExersice.VehiclesExtension;

public class Truck extends Vehicle {
    public final static double AC_ADDITIONAL_CONSUMPTION = 1.6;
    public final static double FUEL_AFTER_REDUCTION = 0.95;

    public Truck(double fuelQuantity, double fuelConsumption, int capacity) {
        super(fuelQuantity, fuelConsumption + AC_ADDITIONAL_CONSUMPTION, capacity);
    }

    @Override
    public void refuel(double liters) {
        super.refuel(liters * FUEL_AFTER_REDUCTION);
    }
}
