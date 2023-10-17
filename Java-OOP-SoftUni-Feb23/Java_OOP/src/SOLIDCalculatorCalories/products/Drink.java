package SOLIDCalculatorCalories.products;

public abstract class Drink implements Product {
    private double milliliters;

    protected Drink(double milliliters) {
        this.milliliters = milliliters;
    }

    public double getVolumeMillilitres() {
        return milliliters;
    }

    @Override
    public double getWeightGrams() {
        return this.getVolumeMillilitres() * getDensity();
    }

    protected abstract double getDensity();
}
