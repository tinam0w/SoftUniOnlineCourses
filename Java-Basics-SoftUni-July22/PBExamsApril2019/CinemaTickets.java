package PBExamsApril2019;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sold = 0;
        int student = 0;
        int standard = 0;
        int kid = 0;
        int sum = 0;

        String name = scanner.nextLine();
        while (!name.equals("Finish")){
            int free = Integer.parseInt(scanner.nextLine());
            String type = scanner.nextLine();
            while (!type.equals("End")){
                switch (type){
                    case "student":
                        sold = sold + 1;
                        student = student + 1;
                        break;
                    case "standard":
                        sold = sold + 1;
                        standard = standard + 1;
                        break;
                    case "kid":
                        sold = sold + 1;
                        kid = kid + 1;
                        break;
                }
                if (sold >= free) break;
                type = scanner.nextLine();
            }
            sum = sum + sold;
            System.out.printf("%s - %.2f%% full.%n", name, (sold*1.0/free)*100);
            sold = 0;
            name = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d%n",sum);
        System.out.printf("%.2f%% student tickets.%n", (student*1.0/sum)*100);
        System.out.printf("%.2f%% standard tickets.%n", (standard*1.0/sum)*100);
        System.out.printf("%.2f%% kids tickets.", (kid*1.0/sum)*100);
    }
}
