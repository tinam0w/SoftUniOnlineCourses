package DataTypesMore;

import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int isOpen = 0;
        int isClosed = 0;
        boolean isBalanced = false;
        String lastInput = "";
        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();

            if (input.equals(")")) {
                isClosed++;
            }
            if (input.equals("(")) {
                isOpen++;
                if (lastInput.equals(input))
                    isOpen = 0;
            }
            if (isClosed > isOpen)
                isClosed++;
            lastInput = input;
            }

        if (isClosed == isOpen && isClosed != 0)
            isBalanced = true;

        if (isBalanced)
            System.out.println("BALANCED");
        else
            System.out.println("UNBALANCED");
    }
}
