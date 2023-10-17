package PolymorphismLab.WildFarm;

import PolymorphismLab.WildFarm.Animal.*;
import PolymorphismLab.WildFarm.Food.Food;
import PolymorphismLab.WildFarm.Food.FoodType;
import PolymorphismLab.WildFarm.Food.Meat;
import PolymorphismLab.WildFarm.Food.Vegetable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] animalParts = input.split("\\s+");

            Animal animal = createAnimal(animalParts);

            String[] foodParts = scanner.nextLine().split("\\s+");
            Food food = createFood(foodParts);

            animal.makeSound();
            animal.eatFood(food);
            System.out.println(animal);

            input = scanner.nextLine();
        }
    }

    private static Food createFood(String[] foodParts) {
        FoodType type = FoodType.valueOf(foodParts[0]);
        int quantity = Integer.parseInt(foodParts[1]);

        if (type == FoodType.Meat) {
            return new Meat(quantity);
        } else if (type == FoodType.Vegetable) {
            return new Vegetable(quantity);
        }

        return null;
    }

    private static Animal createAnimal(String[] animalParts) {
        AnimalType type = AnimalType.valueOf(animalParts[0]);
        Animal animalResult = null;

        if (type == AnimalType.Cat) {
            animalResult = new Cat(animalParts[1], Double.parseDouble(animalParts[2]), animalParts[3], animalParts[4]);
        } else if (type == AnimalType.Mouse) {
            animalResult = new Mouse(animalParts[1], Double.parseDouble(animalParts[2]), animalParts[3]);
        } else if (type == AnimalType.Tiger) {
            animalResult = new Tiger(animalParts[1], Double.parseDouble(animalParts[2]), animalParts[3]);
        } else if (type == AnimalType.Zebra) {
            animalResult = new Zebra(animalParts[1], Double.parseDouble(animalParts[2]), animalParts[3]);
        }
        return animalResult;
    }
}

