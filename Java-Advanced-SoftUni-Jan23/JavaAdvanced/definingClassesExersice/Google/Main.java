package JavaAdvanced.definingClassesExersice.Google;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> namesSet = new LinkedHashSet<>();
        List<Person> personList = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] parts = input.split("\\s+");
            String name = parts[0];

            if (!namesSet.contains(name)) {
                Person person = new Person(name);
                namesSet.add(name);
                personList.add(person);
                addAllInfo(parts, person);
            } else {
                for (Person person : personList) {
                    if (person.getName().equals(name)){
                        addAllInfo(parts, person);
                    }
                }
            }
            input = scanner.nextLine();
        }

        String nameToPrint = scanner.nextLine();
        for (Person person : personList) {
            if (person.getName().equals(nameToPrint)){
                System.out.println(person);
            }
        }

    }

    private static void addAllInfo(String[] parts, Person person) {
        switch (parts[1]) {
            case "company":
                person.setCompany(parts[2], parts[3], Double.parseDouble(parts[4]));
                break;
            case "pokemon":
                person.addPokemon(parts[2], parts[3]);
                break;
            case "parents":
                person.addParent(parts[2], parts[3]);
                break;
            case "children":
                person.addChild(parts[2], parts[3]);
                break;
            case "car":
                person.setCar(parts[2], Integer.parseInt(parts[3]));
                break;
        }
    }
}
