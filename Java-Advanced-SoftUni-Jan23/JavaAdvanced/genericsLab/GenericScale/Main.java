package JavaAdvanced.genericsLab.GenericScale;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Integer left = 13;
        Integer right = 13;

        int i = left.compareTo(right);

        Scale<Integer> stringScale = new Scale<>(13, 15);

        System.out.println(stringScale.getHeavier());

    }
}
