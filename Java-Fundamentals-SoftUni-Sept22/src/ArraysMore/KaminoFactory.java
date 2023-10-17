package ArraysMore;

import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int maxCount = 0;
        int[] spareArr = new int[n];
        int countDNAs = 0;
        int bestDNAs = 0;
        int maxSum = 0;
        int topIndex = 0;

        String input = scanner.nextLine();
        while (!input.equals("Clone them!")) {
            int[] dnaArr = Arrays.stream(input.split("\\!+")).mapToInt(Integer::parseInt).toArray();

            countDNAs++;
            int sumArr = 0;
            int count = 1;
            int index = 0;

            for (int i = 0; i < dnaArr.length - 1; i++) {
                if (dnaArr[i] == dnaArr[i + 1] && dnaArr[i] == 1) {
                    count++;
                    if (count == 2)
                        index = i;
                }
            }

            for (int i = 0; i < dnaArr.length; i++) {
                sumArr += dnaArr[i];
            }

            if (count > maxCount) {
                maxCount = count;
                spareArr = dnaArr;
                bestDNAs = countDNAs;
                maxSum = sumArr;
                topIndex = index;
            } else if (count == maxCount) {
                if (index < topIndex) {
                    spareArr = dnaArr;
                    bestDNAs = countDNAs;
                    maxSum = sumArr;
                    topIndex = index;
                }else if (sumArr > maxSum) {
                    spareArr = dnaArr;
                    bestDNAs = countDNAs;
                    maxSum = sumArr;
                    topIndex = index;
                }
            }

            input = scanner.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestDNAs, maxSum);
        for (int item : spareArr) {
            System.out.print(item + " ");
        }
    }
}
