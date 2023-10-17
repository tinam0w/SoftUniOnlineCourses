package WhileLoopLab;

import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String some = scanner.nextLine();

        while (!some.equals("Stop")) {
            System.out.println(some);
            some = scanner.nextLine();
        }

    }
}
