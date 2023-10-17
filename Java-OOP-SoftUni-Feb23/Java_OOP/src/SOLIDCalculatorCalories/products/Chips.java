package SOLIDCalculatorCalories.products;

public class Chips extends Food implements Product{
    public static final double CALORIES_PER_1000_GRAMS = 529;

    private double grams;

    public Chips(double grams) {
       super(grams);
    }

    @Override
    public double getWeightGrams() {
        return grams;
    }

    @Override
    public double getCaloriesPer1000Grams() {
        return CALORIES_PER_1000_GRAMS;
    }
}
