package JavaAdvanced.definingClassesExersice.familyTree;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, String> allPeople = new LinkedHashMap<>();

        while (!input.equals("End")) {
            String[] parts = input.split("\\s+");
            String namePerson = "";
            String birthDatePerson = "";
            String nameParent = "";
            String birthDateParent = "";
            String nameChild = "";
            String birthDateChild = "";
            String name = "";
            String birthDate = "";

            if (parts.length == 1) {
                birthDatePerson = parts[0];
            } else if (parts.length == 2) {
                namePerson = parts[0] + parts[1];
            } else if (parts[1].equals("-")) {
                birthDateParent = parts[0];
                if (parts.length == 3) {
                    birthDateChild = parts[2];
                } else if (parts.length == 4) {
                    nameChild = parts[2] + parts[3];
                }
            } else if (parts[2].equals("-")) {
                nameParent = parts[0] + parts[1];
                if (parts.length == 4) {
                    birthDateChild = parts[3];
                } else if (parts.length == 5) {
                    nameChild = parts[3] + parts[4];
                }
            } else {
                name = parts[0] + parts[1];
                birthDate = parts[2];
            }

            if (!namePerson.equals("")){
                allPeople.put(namePerson, birthDatePerson);

            } else if (!birthDatePerson.equals("")) {
                allPeople.put(namePerson, birthDatePerson);

            } else if (!nameParent.equals("")) {
                allPeople.put(nameParent, birthDateParent);

            } else if (!birthDateParent.equals("")) {


            } else if (!nameChild.equals("")) {
                allPeople.put(nameChild, birthDateChild);

            } else if (!birthDateChild.equals("")) {


            } else if (!name.equals("")){
                allPeople.put(name, birthDate);

            }

            input = scanner.nextLine();
        }

    }
}
