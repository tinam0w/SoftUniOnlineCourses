package IteratorsExersice.ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String[] people = input.split("\\s+");
            String name = people[0];
            int age = Integer.parseInt(people[1]);
            String town = people[2];

            Person person = new Person(name, age, town);
            personList.add(person);
            input = scanner.nextLine();
        }

        int mainPersonIndex = Integer.parseInt(scanner.nextLine());
        int samePeople = 0;
        int diffPeople = 0;

        Person mainPerson = personList.get(mainPersonIndex - 1);
        //personList.remove(mainPerson);
        for (Person person : personList) {
            if (person.compareTo(mainPerson) == 0) {
                samePeople++;
            } else {
                diffPeople++;
            }
        }

        if (samePeople == 1) {
            System.out.println("No matches");
        } else {
            System.out.println(samePeople + " " + diffPeople + " " + personList.size());
        }
    }
}
