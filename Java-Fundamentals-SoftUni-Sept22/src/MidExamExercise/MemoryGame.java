package MidExamExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> board = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        int moves = 0;
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            moves++;
            int[] indexes = Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int index1 = indexes[0];
            int index2 = indexes[1];
            if (!isValidIndex(index1, index2, board.size())) {
                String elementToAdd = "-" + moves + "a";
                board.add(board.size() / 2, elementToAdd);
                board.add(board.size() / 2, elementToAdd);
                System.out.println("Invalid input! Adding additional elements to the board");
            } else {
                if (board.get(index1).equals(board.get(index2))) {
                    System.out.printf("Congrats! You have found matching elements - %s!%n", board.get(index1));
                    board.remove(Math.max(index1, index2));
                    board.remove(Math.min(index1, index2));
                    if (board.size() == 0) {
                        System.out.printf("You have won in %d turns!%n", moves);
                        break;
                    }
                } else {
                    System.out.println("Try again!");
                }
            }
            input = scanner.nextLine();
        }
        if (board.size() > 0) {
            System.out.println("Sorry you lose :(");
            for (String item : board) {
                System.out.print(item + " ");
            }
        }
    }

    public static boolean isValidIndex(int index1, int index2, int size) {
        if (index1 == index2) {
            return false;
        } else if (index1 < 0 || index1 > size - 1) {
            return false;
        } else if (index2 < 0 || index2 > size - 1) {
            return false;
        } else {
            return true;
        }
    }
}
