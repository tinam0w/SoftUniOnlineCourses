package PolymorphismLab.WildFarm.Animal;

import PolymorphismLab.WildFarm.Food.Food;
import PolymorphismLab.WildFarm.Food.Vegetable;

public class Mouse extends Mammal {
    public Mouse(String name, double weight, String region) {
        super(name, weight, region, AnimalType.Mouse);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public boolean willEatFood(Food food) {
        return food instanceof Vegetable;
    }
}
