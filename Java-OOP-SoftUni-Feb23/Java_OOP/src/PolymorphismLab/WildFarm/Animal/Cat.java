package PolymorphismLab.WildFarm.Animal;

import PolymorphismLab.WildFarm.Food.Food;

import java.text.DecimalFormat;

public class Cat extends Feline {
    private String bread;

    public Cat(String name, double weight, String region, String bread) {
        super(name, weight, region, AnimalType.Cat);
        this.bread = bread;
    }


    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public boolean willEatFood(Food food) {
        return true;
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("###.##");
        String formatted = decimalFormat.format(this.getAnimalWeight());

        return String.format("%s[%s, %s, %s, %s, %d]",
                this.getAnimalType(), this.getAnimalName(),this.bread, formatted,this.getLivingRegion(), this.getFoodEaten());
    }
}
