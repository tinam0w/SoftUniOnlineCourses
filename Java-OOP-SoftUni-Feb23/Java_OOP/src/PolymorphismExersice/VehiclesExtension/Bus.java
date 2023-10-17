package PolymorphismExersice.VehiclesExtension;

public class Bus extends Vehicle {
    public static final double AC_CONSUMPTION = 1.4;

    public Bus(double fuelQuantity, double fuelConsumption, int capacity) {
        super(fuelQuantity, fuelConsumption, capacity);
    }

    @Override
    public String drive(double distance) {
        setFuelConsumption(getFuelConsumption() + AC_CONSUMPTION);
        String driveResult = super.drive(distance);
        setFuelConsumption(getFuelConsumption() - AC_CONSUMPTION);
        return driveResult;
    }

    public String driveEmpty(double distance) {
        return super.drive(distance);
    }
}
