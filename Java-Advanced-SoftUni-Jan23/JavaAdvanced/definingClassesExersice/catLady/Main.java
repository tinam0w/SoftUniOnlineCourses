package JavaAdvanced.definingClassesExersice.catLady;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Cat> catList = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("End")){
            String breed = input.split("\\s+")[0];
            String name = input.split("\\s+")[1];
            double number = Double.parseDouble(input.split("\\s+")[2]);

            Cat cat = new Cat(breed, name, number);
            catList.add(cat);
            input = scanner.nextLine();
        }

        String name = scanner.nextLine();
        for (Cat cat : catList) {
            if (cat.getName().equals(name)){
                System.out.println(cat);
            }
        }
    }
}
