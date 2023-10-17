package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();
        while (!command.equals("end")){
            if (command.contains("swap")){
                //int index1 = Integer.parseInt(command.charAt(5)+"");
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                int element1 = numbersArr[index1];
                int element2 = numbersArr[index2];
                numbersArr[index1] = element2;
                numbersArr[index2] = element1;

            } else if (command.contains("multiply")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                numbersArr[index1] = numbersArr[index1] * numbersArr[index2];

            } else if (command.contains("decrease")) {
                for (int i = 0; i <= numbersArr.length - 1 ; i++) {
                    numbersArr[i] -= 1;
                }
            }
            command = scanner.nextLine();
        }

        for (int item = 0; item <= numbersArr.length - 1; item++) {
            if (item != numbersArr.length - 1)
                System.out.print(numbersArr[item] + ", ");
            else
                System.out.print(numbersArr[item]);
        }
    }
}
