package ArraysMore;

import java.util.Arrays;
import java.util.Scanner;

public class kamino2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int maxSum = 0;
        int subsequence = 0;
        int maxCounter = 0;
        int maxIndex = 0;
        int bestSubsequence = 0;
        int[] bestArray = new int[args.length];

        while (!command.equals("Clone them!")) {
            subsequence++;
            int[] array = Arrays.stream(command.split("\\!+")).mapToInt(Integer::parseInt).toArray();
            int counter = 1;
            int currentIndex = 0;
            int currentSum = 0;

            if (array.length == 1) {
                currentIndex = 0;
                currentSum = array[0];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    bestArray = array;
                    bestSubsequence = subsequence;
                }
            }
            for (int i = 1; i <= array.length - 1; i++) {
                int currentElement = array[i];
                if (currentElement != array[i - 1]) {
                    counter = 1;
                    currentSum = 0;
                    continue;
                } else {
                    if (counter == 1) {
                        currentIndex = i - 1;
                        for (int element : array) {
                            currentSum += element;
                        }
                    }
                    counter++;
                }
                if (counter > maxCounter) {
                    maxCounter = counter;
                    maxSum = currentSum;
                    maxIndex = currentIndex;
                    bestSubsequence = subsequence;
                    bestArray = array;
                }
                if (subsequence != bestSubsequence && counter == maxCounter) {
                    if (currentIndex < maxIndex) {
                        bestSubsequence = subsequence;
                        maxSum = currentSum;
                        bestArray = array;
                    } else if (currentIndex == maxIndex) {
                        if (currentSum > maxSum) {
                            maxSum = currentSum;
                            bestSubsequence = subsequence;
                            bestArray = array;
                        }
                    }
                }
            }
            command = scanner.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestSubsequence, maxSum);
        for (int element : bestArray) {
            System.out.print(element + " ");
        }
    }
}
