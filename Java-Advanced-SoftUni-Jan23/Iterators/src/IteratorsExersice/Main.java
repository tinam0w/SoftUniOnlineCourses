package IteratorsExersice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ListyIterator<String> listyIterator =  new ListyIterator<>();

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String[] parts = input.split("\\s+");
            switch (parts[0]) {
                case "Create":
                    if (parts.length > 1) {
                        listyIterator = new ListyIterator<>(
                                Arrays.copyOfRange(parts, 1, parts.length));
                    }
                    break;
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
                case "Print":
                    try {
                        listyIterator.print();
                    } catch (IllegalStateException ex){
                        System.out.println(ex.getMessage());
                    }
                    break;
                case "PrintAll":
                    Iterator<String> iterator = listyIterator.iterator();
                    while (iterator.hasNext()){
                        System.out.print(iterator.next() + " ");
                    }
                    System.out.println();
                    break;
            }
            input = scanner.nextLine();
        }
    }
}
