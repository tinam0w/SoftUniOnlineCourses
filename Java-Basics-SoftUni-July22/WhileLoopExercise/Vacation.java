package WhileLoopExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double costVac = Double.parseDouble(scanner.nextLine());
        double stockMoney = Double.parseDouble(scanner.nextLine());
        int days = 0;
        int countSpend = 0;
        boolean check = false;

        while (true) {
            String acting = scanner.nextLine();
            double howMuch = Double.parseDouble(scanner.nextLine());
            days++;
            if (acting.equals("spend")) {
                countSpend++;
                stockMoney = stockMoney - howMuch;
                if (stockMoney < 0) stockMoney = 0;
            } else if (acting.equals("save")) {
                countSpend = 0;
                stockMoney = stockMoney + howMuch;
            }

            if (countSpend == 5) break;

            if (stockMoney >= costVac) {
                check = true;
                break;
            }
        }
            if (check)
                System.out.printf("You saved the money for %d days.", days);
            else
                System.out.printf("You can't save the money.%n%d",days);
        }
    }
