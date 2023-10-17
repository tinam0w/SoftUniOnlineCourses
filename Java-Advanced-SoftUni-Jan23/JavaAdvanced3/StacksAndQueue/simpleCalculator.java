package JavaAdvanced.StacksAndQueue;

import java.util.*;

public class simpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expression = scanner.nextLine();
        String[] expressionParts = expression.split(" ");
        ArrayDeque<String> stack = new ArrayDeque<>();
        List<String> partsList = Arrays.asList(expressionParts);
        Collections.reverse(partsList);
        for (String part : partsList) {
            stack.push(part);
        }

        while (stack.size() > 1){
            int firstNum = Integer.parseInt(stack.pop());
            String op = stack.pop();
            int secondNum = Integer.parseInt(stack.pop());
            int result = 0;
            switch (op){
                case "+":
                    result = firstNum + secondNum;
                    break;
                case "-":
                    result = firstNum - secondNum;
                    break;
            }
            stack.push("" + result);
        }
        System.out.println(stack.peek());
    }
}
