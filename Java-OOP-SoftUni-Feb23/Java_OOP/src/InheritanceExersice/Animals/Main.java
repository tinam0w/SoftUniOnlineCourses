package InheritanceExersice.Animals;

import InheritanceExersice.Animals.animals.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String animalType = scanner.nextLine();
        while (!animalType.equals("Beast!")) {
            String[] animalInfo = scanner.nextLine().split("\\s+");
            Animal animal = null;

            try {
                animal = parseAnimal(animalType, animalInfo);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input!");
            }

            if (animal != null){
                System.out.println(animal);
            }

            animalType = scanner.nextLine();
        }
    }

    private static Animal parseAnimal(String animalType, String[] animalInfo) {
        switch (animalType) {
            case "Cat":
                return new Cat(animalInfo[0], Integer.parseInt(animalInfo[1]), animalInfo[2]);
            case "Dog":
                return new Dog(animalInfo[0], Integer.parseInt(animalInfo[1]), animalInfo[2]);
            case "Frog":
                return new Frog(animalInfo[0], Integer.parseInt(animalInfo[1]), animalInfo[2]);
            case "Kitten":
                return new Kitten(animalInfo[0], Integer.parseInt(animalInfo[1]));
            case "Tomcat":
                return new Tomcat(animalInfo[0], Integer.parseInt(animalInfo[1]));
            default:
                throw new IllegalStateException("Unknown animal type!");
        }
    }
}
