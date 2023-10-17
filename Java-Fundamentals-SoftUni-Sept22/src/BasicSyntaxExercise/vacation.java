package FundamentalsBasicsExercise;

import java.util.Scanner;

public class vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ppl = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();

        double total = 0;

        if (type.equals("Students")){
            if (day.equals("Friday"))
                total = ppl * 8.45;
            else if (day.equals("Saturday"))
                total = ppl * 9.8;
            else if (day.equals("Sunday"))
                total = ppl * 10.46;
            if (ppl >= 30)
                total = total * 0.85;
        } else if (type.equals("Business")) {
            if (ppl >= 100)
                ppl = ppl - 10;
            if (day.equals("Friday"))
                total = ppl * 10.9;
            else if (day.equals("Saturday"))
                total = ppl * 15.6;
            else if (day.equals("Sunday"))
                total = ppl * 16;
        } else if (type.equals("Regular")) {
            if (day.equals("Friday"))
                total = ppl * 15;
            else if (day.equals("Saturday"))
                total = ppl * 20;
            else if (day.equals("Sunday"))
                total = ppl * 22.5;
            if (ppl >= 10 && ppl <= 20)
                total = total * 0.95;
        }

        System.out.printf("Total price: %.2f", total);
    }
}
