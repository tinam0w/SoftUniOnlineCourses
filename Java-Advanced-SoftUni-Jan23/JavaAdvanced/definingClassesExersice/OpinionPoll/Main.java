package JavaAdvanced.definingClassesExersice.OpinionPoll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            Person person = new Person(input[0],Integer.parseInt(input[1]) );
            personList.add(person);
        }

        personList.sort(Comparator.comparing(Person::getName));
        for (Person person : personList) {
            if (person.getAge() > 30){
                System.out.println(person);
            }
        }
    }
}
