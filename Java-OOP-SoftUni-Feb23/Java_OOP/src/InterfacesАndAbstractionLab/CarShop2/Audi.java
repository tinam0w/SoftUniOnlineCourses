package InterfacesАndAbstractionLab.CarShop2;

public class Audi extends CarImpl implements Rentable{
    private int minRentDay;
    private double pridePerDay;

    public Audi(String model, String color, int horsePower, String countryProduced, int minRentDay, double pridePerDay) {
        super(model, color, horsePower, countryProduced);
        this.minRentDay = minRentDay;
        this.pridePerDay = pridePerDay;
    }

    @Override
    public int getMinRentDay() {
        return this.minRentDay;
    }

    @Override
    public double getPricePerDay() {
        return this.pridePerDay;
    }

    @Override
    public String toString() {
        return String.format("%s%nMinimum rental period of %d days. Price per day %f",
                super.toString(), getMinRentDay(), getPricePerDay());
    }
}
