package SOLIDCalculatorCalories.products;

public class Coke extends Drink implements Product {

    public static final double CALORIES_PER_100_GRAMS = 44.0;
    public static final double DENSITY = 0.6;

    private double milliliters;

    public Coke(double milliliters) {
        super(milliliters);
    }

    @Override
    protected double getDensity() {
        return DENSITY;
    }

    @Override
    public double getCaloriesPer1000Grams() {
        return CALORIES_PER_100_GRAMS;
    }
}
