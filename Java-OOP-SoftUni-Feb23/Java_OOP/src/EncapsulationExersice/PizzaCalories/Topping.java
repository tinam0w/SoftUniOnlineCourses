package EncapsulationExersice.PizzaCalories;

public class Topping {
    enum ToppingType {
        MEAT(1.2),
        VEGGIES(0.8),
        CHEESE(1.1),
        SAUCE(0.9);

        public final double calories;

        ToppingType(double calories) {
            this.calories = calories;
        }
    }

    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    public double calculateCalories() {
        double baseCalories = 2 * this.weight;
        switch (this.toppingType) {
            case "Meat":
                baseCalories *= ToppingType.MEAT.calories;
                break;
            case "Sauce":
                baseCalories *= ToppingType.SAUCE.calories;
                break;
            case "Cheese":
                baseCalories *= ToppingType.CHEESE.calories;
                break;
            case "Veggies":
                baseCalories *= ToppingType.VEGGIES.calories;
                break;
        }

        return baseCalories;
    }

    private void setToppingType(String toppingType) {
        if (!toppingType.equals("Meat")) {
            if (!toppingType.equals("Sauce")) {
                if (!toppingType.equals("Cheese")) {
                    if (!toppingType.equals("Veggies")) {
                        throw new IllegalArgumentException("Cannot place " + toppingType + " on top of your pizza.");
                    }
                }
            }
        }

        this.toppingType = toppingType;
    }

    private void setWeight(double weight) {
        if (weight < 0 || weight > 50) {
            throw new IllegalArgumentException(this.toppingType + " weight should be in the range [1..50].");
        }

        this.weight = weight;
    }
}
