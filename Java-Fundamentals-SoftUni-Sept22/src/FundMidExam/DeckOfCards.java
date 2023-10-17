package FundMidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DeckOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> cards = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String[] commands = scanner.nextLine().split(", ");
            switch (commands[0]) {
                case "Add":
                    String cardAdd = commands[1];
                    if (cards.contains(cardAdd)) {
                        System.out.println("Card is already in the deck");
                    } else {
                        cards.add(cardAdd);
                        System.out.println("Card successfully added");
                    }
                    break;
                case "Remove":
                    String cardRemove = commands[1];
                    if (cards.contains(cardRemove)) {
                        cards.remove(cardRemove);
                        System.out.println("Card successfully removed");
                    } else {
                        System.out.println("Card not found");
                    }
                    break;
                case "Remove At":
                    int indexRemove = Integer.parseInt(commands[1]);
                    if (indexRemove >= 0 && indexRemove < cards.size()) {
                        cards.remove(indexRemove);
                        System.out.println("Card successfully removed");
                    } else {
                        System.out.println("Index out of range");
                    }
                    break;
                case "Insert":
                    int indexInsert = Integer.parseInt(commands[1]);
                    String cardName = commands[2];
                    if (indexInsert >= 0 && indexInsert < cards.size()) {
                        if (cards.contains(cardName)) {
                            System.out.println("Card is already added");
                        } else {
                            cards.add(indexInsert, cardName);
                            System.out.println("Card successfully added");
                        }
                    } else {
                        System.out.println("Index out of range");
                    }
                    break;
            }
        }
        for (int i = 0; i < cards.size(); i++) {
            if (i == cards.size() - 1)
                System.out.print(cards.get(i));
            else
                System.out.print(cards.get(i) + ", ");
        }
    }
}
