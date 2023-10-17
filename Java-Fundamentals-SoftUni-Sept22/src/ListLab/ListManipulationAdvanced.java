package ListLab;

import java.util.*;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("end")){
            String[] commandArr = input.split(" ");
            String command = commandArr[0];
            switch (command){
                case "Contains":
                    int number = Integer.parseInt(commandArr[1]);
                    if (numList.contains(number))
                        System.out.println("Yes");
                    else
                        System.out.println("No such number");
                    break;
                case "Print":
                    if (commandArr[1].equals("even")){
                        for (int i = 0; i < numList.size(); i++) {
                            if (numList.get(i) % 2 == 0)
                                System.out.print(numList.get(i) + " ");
                        }
                        System.out.println();
                    } else if (commandArr[1].equals("odd")) {
                        for (int i = 0; i < numList.size(); i++) {
                            if (numList.get(i) % 2 != 0)
                                System.out.print(numList.get(i) + " ");
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (int i = 0; i < numList.size(); i++) {
                        sum += numList.get(i);
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    String condition = commandArr[1];
                    int num = Integer.parseInt(commandArr[2]);
                    List<Integer> spareList = new ArrayList<>();
                    spareList.addAll(numList);
                    switch (condition){
                        case "<":
                            spareList.removeIf(e -> e >= num);
                            System.out.println(spareList.toString().replaceAll("[\\[\\],]", ""));
                            break;
                        case ">":
                            spareList.removeIf(e -> e <= num);
                            System.out.println(spareList.toString().replaceAll("[\\[\\],]", ""));
                            break;
                        case ">=":
                            spareList.removeIf(e -> e < num);
                            System.out.println(spareList.toString().replaceAll("[\\[\\],]", ""));
                            break;
                        case "<=":
                            spareList.removeIf(e -> e > num);
                            System.out.println(spareList.toString().replaceAll("[\\[\\],]", ""));
                            break;
                    }
                    break;
            }
            input = scanner.nextLine();
        }
    }
}
