package WhileLoopMore;

import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int expecting = Integer.parseInt(scanner.nextLine());
        int countCard = 0;
        int countCash = 0;
        int count = 0;
        int card = 0;
        int cash = 0;
        boolean check = false;
        int sold = 0;
        
        String input = scanner.nextLine();
        while (!input.equals("End")){
            int item = Integer.parseInt(input);
            count++;
            if (count % 2 == 0) {
                if (item < 10) {
                    System.out.println("Error in transaction!");
                    input = scanner.nextLine();
                    continue;
                }
                card = card + item;
                countCard++;
            }
            else {
                if (item > 100){
                    System.out.println("Error in transaction!");
                    input = scanner.nextLine();
                    continue;
                }
                cash = cash + item;
                countCash++;
            }
            sold = sold + item;
            System.out.println("Product sold!");
            if (sold >= expecting) {
                check = true;
                break;
            }
            input = scanner.nextLine();
        }

        if (check)
            System.out.printf("Average CS: %.2f%nAverage CC: %.2f", cash*1.0/countCash, card*1.0/countCard );
        else
            System.out.println("Failed to collect required money for charity.");

    }
}
