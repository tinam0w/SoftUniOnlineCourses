package SOLIDCalculatorCalories;

import SOLIDCalculatorCalories.products.Product;
import java.util.Collection;

public class CalorieCalculator {
    public CalorieCalculator() {
    }

    public double sum(Iterable<Product> products) {
        double sum = 0;

        for (Product product : products) {
            sum += calculateCalories(product.getWeightGrams(), product.getCaloriesPer1000Grams());
        }

        return sum;
    }

    private double calculateCalories(double grams, double caloriesPer1000Grams) {
        return (caloriesPer1000Grams * grams) / 100;
    }

    public double average(Collection<Product> products) {
        return sum(products) / products.size();
    }
}
