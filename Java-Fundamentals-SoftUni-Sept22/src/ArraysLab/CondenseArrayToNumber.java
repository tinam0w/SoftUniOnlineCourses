package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

                int[] condensedArr = new int[inputArr.length - 1];
                for (int i = 0; i < inputArr.length; i++) {
                    if (inputArr.length == 1)
                        break;
                    if (i == inputArr.length-1){
                        int[] condensedNewArr = new int[condensedArr.length - 1];
                        i = - 1;
                        inputArr = condensedArr;
                        condensedArr = condensedNewArr;
                    }else
                        condensedArr[i] = inputArr[i] + inputArr[i + 1];
            }
        System.out.println(inputArr[0]);
        }
    }
