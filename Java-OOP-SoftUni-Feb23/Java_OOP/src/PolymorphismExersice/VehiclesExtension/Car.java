package PolymorphismExersice.VehiclesExtension;

public class Car extends Vehicle{
    public final static double AC_ADDITIONAL_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumption, int capacity) {
        super(fuelQuantity, fuelConsumption, capacity);
        setFuelConsumption(getFuelConsumption() + AC_ADDITIONAL_CONSUMPTION);
    }
}
