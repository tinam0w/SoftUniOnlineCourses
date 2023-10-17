package MidExamExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int initialPeople = people;
        List<Integer> lift = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;
        for (int i = 0; i < lift.size(); i++) {
            sum += lift.get(i);
        }
        int allFreeSeats = (lift.size() * 4) - sum;

        for (int i = 0; i < lift.size(); i++) {
            if (lift.get(i) >= 0 && lift.get(i) < 4) {
                int freeSeats = 4 - lift.get(i);

                if (people <= 0) {
                    break;
                } else if (people <= freeSeats) {
                    lift.set(i, people + lift.get(i));
                    people = 0;
                    break;
                } else if (people > freeSeats) {
                    lift.set(i, freeSeats + lift.get(i));
                    people = people - freeSeats;
                }
            }
        }
        if (allFreeSeats > initialPeople) {
            System.out.println("The lift has empty spots!");
            printWagons(lift);
        } else if (allFreeSeats < initialPeople) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", initialPeople - people);
            printWagons(lift);
        } else if (allFreeSeats == initialPeople) {
            printWagons(lift);
        }
    }

    public static void printWagons(List<Integer> list) {
        for (int item : list) {
            System.out.print(item + " ");
        }
    }
}