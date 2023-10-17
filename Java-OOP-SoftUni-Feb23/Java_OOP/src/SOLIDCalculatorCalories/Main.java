package SOLIDCalculatorCalories;

import SOLIDCalculatorCalories.products.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CalorieCalculator calorieCalculator = new CalorieCalculator();

        List<Product> products = new ArrayList<>();
        products.add(new Coke(500));
        products.add(new Lemonade(330));
        products.add(new Chocolate(100));
        products.add(new Chips(200));

        ValuePrinter valuePrinter = new ValuePrinter();

        valuePrinter.printSum(calorieCalculator.sum(products));
        valuePrinter.printAverage(calorieCalculator.average(products));
        valuePrinter.printSum(13);
    }
}
