package EncapsulationExersice.PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name, int numberOfToppings) {
        setName(name);
        setToppings(numberOfToppings);
        this.toppings = new ArrayList<>();
    }

    public double getOverallCalories(){
        double calories = this.dough.calculateCalories();
        if (!this.toppings.isEmpty()){
            for (Topping topping : toppings) {
                calories += topping.calculateCalories();
            }
        }
        return calories;
    }

    public void addTopping(Topping topping){
        this.toppings.add(topping);
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public String getName() {
        return name;
    }

    private void setToppings(int numberOfToppings){
        if (numberOfToppings < 0 || numberOfToppings > 10){
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }

        this.name = name;
    }
}
