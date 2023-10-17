package ListLab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numberList = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
        //int size = numberList.size();

        for (int i = 0; i < numberList.size() - 1; i++) {
            double current = numberList.get(i);
            double next = numberList.get(i + 1);
            if (current == next) {
                numberList.set(i, current + next);
                numberList.remove(i + 1);
                i = -1;
            }
        }
        System.out.println(joinElements(numberList, " "));
    }

    public static String joinElements(List<Double> list, String delimiter){
        DecimalFormat df = new DecimalFormat("0.#");
        String result = "";
        for (double item : list) {
            String numDf = df.format(item) + delimiter;
            result += numDf;
        }
        return result;
    }
}
