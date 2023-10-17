package April_2022;

import java.util.*;
import java.util.stream.Collectors;

public class Blacksmith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input1 = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] input2 = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Deque<Integer> steel = new ArrayDeque<>();
        Deque<Integer> carbon = new ArrayDeque<>();

        Arrays.stream(input1).forEach(steel::offer);
        Arrays.stream(input2).forEach(carbon::push);

        int gladius = 0, shamshir = 0, katana = 0, sabre = 0;
        while (!steel.isEmpty() && !carbon.isEmpty()){
            int firstSteel = steel.poll();
            int lastCarbon = carbon.pop();
            int sum = firstSteel + lastCarbon;

            switch (sum){
                case 70: gladius++; break;
                case 80: shamshir++; break;
                case 90: katana++; break;
                case 110: sabre++; break;
                default: carbon.push(lastCarbon + 5);
            }
        }

        if (sabre + katana + shamshir + gladius > 0){
            System.out.printf("You have forged %d swords.%n", sabre + katana + shamshir + gladius);
        } else {
            System.out.println("You did not have enough resources to forge a sword.");
        }

        System.out.print("Steel left: ");
        if (steel.isEmpty()){
            System.out.println("none");
        } else {
            List<String> toPrint = steel.stream().map(e -> e + "").collect(Collectors.toList());
            System.out.println(String.join(", ", toPrint));
        }

        System.out.print("Carbon left: ");
        if (carbon.isEmpty()){
            System.out.println("none");
        } else {
            List<String> toPrint = carbon.stream().map(e -> e + "").collect(Collectors.toList());
            System.out.println(String.join(", ", toPrint));
        }

        if (gladius > 0)
            System.out.println("Gladius: " + gladius);
        if (katana > 0)
            System.out.println("Katana: " + katana);
        if (sabre > 0)
            System.out.println("Sabre: " + sabre);
        if (shamshir > 0)
            System.out.println("Shamshir: " + shamshir);

    }
}
