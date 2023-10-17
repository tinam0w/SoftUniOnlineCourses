package Exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CustomList<String> customList = new CustomList<>();

        String command = scanner.nextLine();
        while (!command.equals("END")){
            String[] parts = command.split("\\s+");
            switch (parts[0]){
                case"Add":
                    customList.add(parts[1]);
                    break;
                case "Remove":
                    customList.remove(Integer.parseInt(parts[1]));
                    break;
                case"Contains":
                    System.out.println(customList.contains(parts[1]));
                    break;
                case "Swap":
                    int ind1 = Integer.parseInt(parts[1]);
                    int ind2 = Integer.parseInt(parts[2]);
                    customList.swap(ind1, ind2);
                    break;
                case"Greater":
                    System.out.println(customList.countGraterThan(parts[1]));
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Print":
                    customList.print();
                    break;
                case"Sort":
                    customList.sort();
                    break;
            }

            command = scanner.nextLine();
        }

    }
}
