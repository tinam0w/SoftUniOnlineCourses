package PolymorphismLab.WildFarm.Animal;

import PolymorphismLab.WildFarm.Food.Food;

public abstract class Animal {
    private String animalName;
    private AnimalType animalType;
    private Double animalWeight;
    private Integer foodEaten;

    public Animal(String name, double weight, AnimalType type) {
        this.animalName = name;
        this.animalWeight = weight;
        this.foodEaten = 0;

        this.animalType = type;
    }

    public abstract void makeSound();

    public abstract boolean willEatFood(Food food);

    public void eatFood(Food food) {
        if (!willEatFood(food)) {
            //throw exeption usually

            String plural = "";
            switch (this.animalType){
                case Cat: plural = "Cats"; break;
                case Mouse: plural = "Mice"; break;
                case Tiger: plural = "Tigers"; break;
                case Zebra: plural = "Zebras"; break;
            }
            System.out.printf("%s are not eating that type of food!%n", plural);
            return;
        }

        this.foodEaten += food.getQuantity();
    }

    protected String getAnimalName() {
        return animalName;
    }

    protected AnimalType getAnimalType() {
        return animalType;
    }

    protected Double getAnimalWeight() {
        return animalWeight;
    }

    protected Integer getFoodEaten() {
        return foodEaten;
    }
}
