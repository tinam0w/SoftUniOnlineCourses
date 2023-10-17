package SOLIDCalculatorCalories.products;

public class Chocolate extends Food implements Product {

    public static final double CALORIES_PER_100_GRAMS = 575.0;

    private double grams;

    public Chocolate(double grams) {
        super(grams);
    }

    @Override
    public double getWeightGrams() {
        return grams;
    }

    @Override
    public double getCaloriesPer1000Grams() {
        return CALORIES_PER_100_GRAMS;
    }
}
