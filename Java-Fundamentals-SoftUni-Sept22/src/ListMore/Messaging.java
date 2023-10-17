package ListMore;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<String> text = Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());

        String result = "";
        for (int i = 0; i < numbers.size(); i++) {
            int currentNum = numbers.get(i);
            int index = 0;
            while (currentNum > 0){
                int digit = currentNum % 10;
                index += digit;
                currentNum = currentNum / 10;
            }
            if (index >= text.size())
                index = index % text.size();

            String symbol = text.get(index);
            result += symbol;
            text.remove(index);
        }
        System.out.println(result);
    }
}
