package ArraysMore;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] intArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxLen = 0;
        int lastIndex = -1;
        int[] lenArr = new int[intArr.length];
        int[] prevArr = new int[intArr.length];
        for (int i = 1; i < intArr.length; i++) {
            lenArr[i] = 1;
            prevArr[i] = -1;
            for (int j = 0; j < i; j++) {
                if (intArr[j] < intArr[i] && lenArr[j] + 1 > lenArr[i]) {
                    lenArr[i] = lenArr[j] + 1;
                    prevArr[i] = i;
                }
                if (lenArr[i] > maxLen) {
                    maxLen = lenArr[i];
                    lastIndex = i;
                }
            }
        }

        }
    }

