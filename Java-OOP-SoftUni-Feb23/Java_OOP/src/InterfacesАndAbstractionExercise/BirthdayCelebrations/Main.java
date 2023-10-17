package InterfacesАndAbstractionExercise.BirthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Birthable> birthableList = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("End")){
            String[] parts = input.split("\\s+");
            String objectType = parts[0];
            switch (objectType){
                case "Citizen":
                    Citizen citizen = new Citizen(parts[1],Integer.parseInt(parts[2]), parts[3], parts[4]);
                    birthableList.add(citizen);
                    break;
                case "Pet":
                    Pet pet = new Pet(parts[1], parts[2]);
                    birthableList.add(pet);
                    break;
                case "Robot":
                    //Robot robot = new Robot(parts[1], parts[2]);
                    break;
            }
            input = scanner.nextLine();
        }

        String year = scanner.nextLine();

        boolean isFound = false;
        for(Birthable birthable: birthableList){
            if (birthable.getBirthDate().endsWith(year)){
                System.out.println(birthable.getBirthDate());
                isFound = true;
            }
        }

        if (!isFound){
            System.out.println("<no output>");
        }

    }
}