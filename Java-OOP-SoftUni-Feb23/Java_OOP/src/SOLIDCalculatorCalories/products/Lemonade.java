package SOLIDCalculatorCalories.products;

public class Lemonade extends Drink implements Product {

    public static final double CALORIES_PER_100_GRAMS = 53.0;
    public static final double DENSITY = 0.7;

    private double milliliters;

    public Lemonade(double milliliters) {
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
