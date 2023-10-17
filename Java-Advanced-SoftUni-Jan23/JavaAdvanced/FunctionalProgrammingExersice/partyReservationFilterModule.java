package JavaAdvanced.FunctionalProgrammingExersice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class partyReservationFilterModule {
    public static List<String> guests;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        guests = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        BiPredicate<String, String> isStartWith = (word, letter) -> {
            return word.startsWith(letter);
        };
        BiPredicate<String, String> isEndWith = (word, letter) -> {
            return word.endsWith(letter);
        };
        BiPredicate<String, String> isLength = (word, len) -> {
            int length = Integer.parseInt(len);
            return word.length() == length;
        };
        BiPredicate<String, String> isContains = (word1, word2) -> {
            return word1.contains(word2);
        };

        BiFunction<List<String>, String, List<String>> TPRF = getTprf(isStartWith, isEndWith, isLength, isContains);

        String input = scanner.nextLine();
        List<String> finalGuestList = new ArrayList<>(guests);
        while (!input.equals("Print")) {
            finalGuestList = TPRF.apply(finalGuestList, input);
            input = scanner.nextLine();
        }
        System.out.println(String.join(" ", finalGuestList));
    }

    private static BiFunction<List<String>, String, List<String>> getTprf(BiPredicate<String, String> isStartWith, BiPredicate<String, String> isEndWith, BiPredicate<String, String> isLength, BiPredicate<String, String> isContains) {
        BiFunction<List<String>, String, List<String>> TPRF = (list, input) -> {
            String filter = input.split(";")[0];
            String type = input.split(";")[1];
            String parameter = input.split(";")[2];

            List<String> newList = new ArrayList<>();
            if (filter.equals("Add filter")) {
                if (type.equals("Starts with")) {
                    newList = list.stream().filter(e -> isStartWith.negate().test(e, parameter)).collect(Collectors.toList());
                } else if (type.equals("Ends with")) {
                    newList = list.stream().filter(e -> isEndWith.negate().test(e, parameter)).collect(Collectors.toList());
                } else if (type.equals("Length")) {
                    newList = list.stream().filter(e -> isLength.negate().test(e, parameter)).collect(Collectors.toList());
                } else if (type.equals("Contains")) {
                    newList = list.stream().filter(e -> isContains.negate().test(e, parameter)).collect(Collectors.toList());
                }
            } else if (filter.equals("Remove filter")) {
                List<String> toAdd = new ArrayList<>();
                if (type.equals("Starts with")) {
                    toAdd = guests.stream().filter(e -> isStartWith.test(e, parameter)).collect(Collectors.toList());
                } else if (type.equals("Ends with")) {
                    toAdd = guests.stream().filter(e -> isEndWith.test(e, parameter)).collect(Collectors.toList());
                } else if (type.equals("Length")) {
                    toAdd = guests.stream().filter(e -> isLength.test(e, parameter)).collect(Collectors.toList());
                } else if (type.equals("Contains")) {
                    toAdd = guests.stream().filter(e -> isContains.test(e, parameter)).collect(Collectors.toList());
                }
                list.addAll(toAdd);
                newList.addAll(list);
            }
            return newList;
        };
        return TPRF;
    }
}
