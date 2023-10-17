package FinalExam02;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder stop = new StringBuilder(scanner.nextLine());
        String[] commands = scanner.nextLine().split(":");
        while (!commands[0].equals("Travel")){
            switch (commands[0]) {
                case "Add Stop":
                    int index = Integer.parseInt(commands[1]);
                    if (index >= 0 && index < stop.length())
                        stop.insert(index, commands[2]);
                    System.out.println(stop);
                    break;
                case "Remove Stop":
                    int ind1 = Integer.parseInt(commands[1]);
                    int ind2 = Integer.parseInt(commands[2]);
                    if ((ind1 >= 0 && ind1 < stop.length()) && (ind2 >= 0 && ind2 < stop.length()))
                        stop.delete(ind1, ind2 + 1);
                    System.out.println(stop);
                    break;
                case "Switch":
                    if (stop.toString().contains(commands[1]))
                        stop = new StringBuilder(stop.toString().replace(commands[1], commands[2]));
                    System.out.println(stop);
                    break;
            }
            commands = scanner.nextLine().split(":");
        }
        System.out.println("Ready for world tour! Planned stops: " + stop);
    }
}
