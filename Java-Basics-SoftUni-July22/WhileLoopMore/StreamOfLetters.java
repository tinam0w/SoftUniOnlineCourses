package WhileLoopMore;

import java.util.Scanner;

public class StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        String code = "";
        int countN = 0;
        int countO = 0;
        int countC = 0;

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            char letter = input.charAt(0);

            if ((letter >= 65 && letter <= 90) || (letter >= 97 && letter <= 122)) {
                switch (input) {
                    case "n":
                        countN = countN + 1;
                        if (countN > 1) {
                            countN = 1;
                            break;
                        }
                        check = true;
                        break;
                    case "o":
                        countO = countO + 1;
                        if (countO > 1) {
                            countO = 1;
                            break;
                        }
                        check = true;
                        break;
                    case "c":
                        countC = countC + 1;
                        if (countC > 1) {
                            countC = 1;
                            break;
                        }
                        check = true;
                        break;
                }

                if (check) {
                    if (countN == 1 && countC == 1 && countO == 1) {
                        countN = 0;
                        countC = 0;
                        countO = 0;
                        code = code + " ";
                        check = false;
                        input = scanner.nextLine();
                        continue;
                    }
                    check = false;
                    input = scanner.nextLine();
                    continue;
                } else {
                    code = code + input;
                    input = scanner.nextLine();
                }
            } else input = scanner.nextLine();
        }

      //  for (int i = (code.length()-1); i >= 1; i--) {
            //    if (code.charAt(i) == ' ')
             //   {
             //       String result = code.substring(0, 11);
             //       System.out.println(result);
             //       break;
            //    }
           // }
        System.out.println(code);
    }
}

