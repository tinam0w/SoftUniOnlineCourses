package WhileLoopMore;

import java.util.Scanner;

public class StreamOfLetters2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String codeWord = "";
        int countN = 0;
        int countO = 0;
        int countC = 0;

        String input = scanner.nextLine();
        while (!input.equals("End")){
            char letter = input.charAt(0);
            if ((letter >= 65 && letter <= 90) || (letter >= 97 && letter <= 122)){
                if (letter == 'n' || letter == 'o' || letter == 'c'){
                    switch (letter){
                        case 'n':
                            countN++;
                            if (countN > 1){
                                codeWord = codeWord + letter;
                                countN = 1;
                            }
                            break;
                        case 'o':
                            countO++;
                            if (countO > 1){
                                codeWord = codeWord + letter;
                                countO = 1;
                            }
                            break;
                        case 'c':
                            countC++;
                            if (countC > 1){
                                codeWord = codeWord + letter;
                                countC = 1;
                            }
                            break;
                    }
                    if (countN == 1 && countC == 1 && countO == 1){
                        codeWord = codeWord + " ";
                        System.out.print(codeWord);
                        codeWord = "";
                        countN = 0;
                        countC = 0;
                        countO = 0;
                    }
                } else {
                    codeWord = codeWord + letter;
                }
            }
            input = scanner.nextLine();
        }
    }
}
