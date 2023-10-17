package _05_Restaurant.restaurant;

import java.math.BigDecimal;

public class Cake extends Dessert{
    public static final double CAKE_GRAMS = 250;
    public static final double CAKE_CALORIES = 1000;
    public static final BigDecimal CAKE_PRICE = BigDecimal.valueOf(5);

    public Cake(String name, BigDecimal price, double grams, double calories) {
        super(name, price, grams, calories);
    }
}
