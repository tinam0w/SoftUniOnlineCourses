package ObjectsAndClassesExercise.opinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {
            String data = scanner.nextLine();
            String name = data.split("\\s+")[0];
            int age = Integer.parseInt(data.split("\\s+")[1]);

            if (age > 30){
                Person person = new Person(name, age);
                personList.add(person);
            }
        }

        for (Person item : personList) {
            System.out.println(item.getName() + " - " + item.getAge());
        }
    }
}
