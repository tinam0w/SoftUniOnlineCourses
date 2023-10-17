package _05_Restaurant.restaurant;

import java.math.BigDecimal;

public class Food extends Product{
    private double price;
    private double grams;

    public Food(String name, BigDecimal price, double grams) {
        super(name, price);
        this.grams = grams;
    }

    public double getGrams() {
        return grams;
    }
}
