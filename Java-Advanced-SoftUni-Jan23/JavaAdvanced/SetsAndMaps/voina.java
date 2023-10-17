package JavaAdvanced.SetsAndMaps;

import java.util.*;
import java.util.stream.Collectors;

public class voina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> deckOne = new LinkedHashSet<>();
        Set<Integer> deckTwo = new LinkedHashSet<>();

        String[] inputOne = scanner.nextLine().split(" ");
        for (int i = 0; i < inputOne.length; i++) {
            int current = Integer.parseInt(inputOne[i]);
            deckOne.add(current);
        }
        String[] inputTwo = scanner.nextLine().split(" ");
        for (int i = 0; i < inputTwo.length; i++) {
            int current = Integer.parseInt(inputTwo[i]);
            deckTwo.add(current);
        }


        for (int step = 0; step < 50; step++){
            if (deckOne.isEmpty()) {
                break;
            } else if (deckTwo.isEmpty()) {
                break;
            }
            Integer playerOne = deckOne.iterator().next();
            Integer playerTwo = deckTwo.iterator().next();

            deckOne.remove(playerOne);
            deckTwo.remove(playerTwo);

            if (playerOne > playerTwo) {
                deckOne.add(playerOne);
                deckOne.add(playerTwo);
            } else if(playerTwo > playerOne) {
                deckTwo.add(playerOne);
                deckTwo.add(playerTwo);
            }

        }

        if (deckOne.size() < deckTwo.size()) {
            System.out.println("Second player win!");
        } else if (deckTwo.size() < deckOne.size()) {
            System.out.println("First player win!");
        } else {
            System.out.println("Draw!");
        }
    }
}
