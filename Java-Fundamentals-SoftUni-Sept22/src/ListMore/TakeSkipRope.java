package ListMore;

import java.util.*;
import java.util.stream.Collectors;

public class TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputLine = Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());
        List<Integer> numbers = new ArrayList<>();
        for (int i = inputLine.size() - 1; i >= 0; i--) {
            char current = inputLine.get(i).charAt(0);
            if (current >= 48 && current <= 57) {
                numbers.add(Integer.parseInt(inputLine.get(i)));
                inputLine.remove(i);
            }
        }
        Collections.reverse(numbers);

        String text = String.join("", inputLine);
        String result = "";
        int index = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (i % 2 == 0) {
                if (index + numbers.get(i) > text.length()) {
                    result += text.substring(index, text.length());
                    break;
                } else {
                    result += text.substring(index, index + numbers.get(i));
                    index = index + numbers.get(i);
                }
            } else {
                index += numbers.get(i);
                if (index > text.length())
                    index = text.length();
            }
        }
        System.out.println(result);
    }
}
