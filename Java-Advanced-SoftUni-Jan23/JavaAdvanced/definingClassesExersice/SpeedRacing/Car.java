package JavaAdvanced.definingClassesExersice.SpeedRacing;

public class Car {
    //полета:
    private String model;
    private double fuelAmount;
    private double priceFuelKm;
    private int distance;

    //метод конструктор:
    public Car(String model, double fuelAmount, double priceFuelKm){
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.priceFuelKm = priceFuelKm;
        distance = 0;
    }

    //други методи:
    public boolean drive(int kmToDrive){
        double needFuel = kmToDrive * this.priceFuelKm;
        if (needFuel <= this.fuelAmount){
            this.fuelAmount -= needFuel;
            this.distance += kmToDrive;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d",model, fuelAmount, distance);
    }
}
