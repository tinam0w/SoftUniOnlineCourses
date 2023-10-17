package WhileLoopExercise;

import java.util.Scanner;

public class OldBooks  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String favBook = scanner.nextLine();
        String book = scanner.nextLine();
        boolean isFound = false;
        int count = 0;

        while (!book.equals("No More Books")) {
            if (book.equals(favBook)) {
                isFound = true;
                break;
            }
            count++;
            book = scanner.nextLine();
        }

        if (isFound)
            System.out.printf("You checked %d books and found it.",count);
        else
            System.out.printf("The book you search is not here!%nYou checked %d books.",count);

    }
}
