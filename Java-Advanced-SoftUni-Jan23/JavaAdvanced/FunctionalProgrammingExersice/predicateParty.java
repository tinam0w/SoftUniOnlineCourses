package JavaAdvanced.FunctionalProgrammingExersice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class predicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //        Function <приема, връща> -> .apply()
//        Consumer <приема> -> void -> .accept()
//        Supplier <връща> -> .get()
//        Predicate <приема> -> true / false -> .test()
//        BiFunction <приема1, приема2, връща> -> .apply()

        List<String> guests = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        BiPredicate<String, String> startsWithPredicate =
                (name, letter) -> name.startsWith(letter);

        BiPredicate<String, String> endsWithPredicate =
                (name, letter) -> name.endsWith(letter);

        BiPredicate<String, Integer> lengthEquals =
                (name, len) -> name.length() == len;


        String input = scanner.nextLine();
        while (!input.equals("Party!")) {
            String[] command = input.split("\\s+");
            if (command[0].equals("Remove")) {
                if (command[1].equals("StartsWith")) {
                    String letter = command[2];
                    guests = guests.stream().filter(e -> startsWithPredicate.negate().test(e, letter)).collect(Collectors.toList());
                } else if (command[1].equals("Length")) {
                    int len = Integer.parseInt(command[2]);
                    guests = guests.stream().filter(e -> lengthEquals.negate().test(e, len)).collect(Collectors.toList());
                } else if (command[1].equals("EndsWith")) {
                    String letter = command[2];
                    guests = guests.stream().filter(e -> endsWithPredicate.negate().test(e, letter)).collect(Collectors.toList());
                }
            } else if (command[0].equals("Double")) {
                if (command[1].equals("StartsWith")) {
                    String letter = command[2];
                    List<String> toAdd = guests.stream().filter(e -> startsWithPredicate.test(e, letter)).collect(Collectors.toList());
                    guests.addAll(toAdd);
                } else if (command[1].equals("Length")) {
                    int len = Integer.parseInt(command[2]);
                    List<String> toAdd = guests.stream().filter(e -> lengthEquals.test(e, len)).collect(Collectors.toList());
                    guests.addAll(toAdd);
                } else if (command[1].equals("EndsWith")) {
                    String letter = command[2];
                    List<String> toAdd = guests.stream().filter(e -> endsWithPredicate.test(e, letter)).collect(Collectors.toList());
                    guests.addAll(toAdd);
                }
            }
            input = scanner.nextLine();
        }

        if (!guests.isEmpty()) {
            Collections.sort(guests);
            System.out.println(String.join(", ", guests) + " are going to the party!");
        } else {
            System.out.println("Nobody is going to the party!");
        }

    }
}
