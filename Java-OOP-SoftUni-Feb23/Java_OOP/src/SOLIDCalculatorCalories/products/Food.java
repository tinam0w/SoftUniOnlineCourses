package SOLIDCalculatorCalories.products;

public abstract class Food implements Product{
    double weightInGrams;

    protected Food(double weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    public double getWeightInGrams() {
        return weightInGrams;
    }
}
