package ArraysMore;

import java.util.Arrays;
import java.util.Scanner;

public class LIS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] ans = new int[nums.length];

        for (int i = 0; i < ans.length; i++)
            ans[i] = 1;
        for (int i = 1; i < nums.length; i++)
        {
            for (int j = 0; j < i; j++)
            {
                if (nums[i] > nums[j]) {
                    ans[i] = Math.max(ans[i], (ans[j] + 1));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < ans.length; i++)
        {
            max = Math.max(ans[i], max);
        }
        //return max;
    }
}
