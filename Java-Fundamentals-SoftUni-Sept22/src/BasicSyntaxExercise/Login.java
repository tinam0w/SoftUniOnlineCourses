package FundamentalsBasicsExercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";

        for (int i = (username.length()-1); i >= 0 ; i--) {
            char a = username.charAt(i);
            password = password + a;
        }

        String input = scanner.nextLine();
        int count = 0;
        boolean isOver = false;
        while (!input.equals(password)) {
            if (count == 3) {
                isOver = true;
                break;
            } else {
                System.out.println("Incorrect password. Try again.");
                count++;
                input = scanner.nextLine();
            }
        }

        if (isOver){
            System.out.printf("User %s blocked!", username);
        } else {
            System.out.printf("User %s logged in.", username);
        }

    }
}
