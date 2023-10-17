package MethodsMore;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] initialArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] command = input.split("\\s+");

            switch (command[0]) {
                case "exchange":
                    int index = Integer.parseInt(command[1]);
                    if (index >= 0 && index < initialArr.length - 1)
                        exchangeCommand(initialArr, command);
                    else if (index == initialArr.length - 1) // || index == 0
                        break;
                    else
                        System.out.println("Invalid index");
                    break;

                case "max":
                    maxElementIndex(initialArr, command);
                    break;

                case "min":
                    minElementIndex(initialArr, command);
                    break;

                case "first":
                    int count = Integer.parseInt(command[1]);
                    if (count > initialArr.length)
                        System.out.println("Invalid count");
                    else
                        firstCountElements(initialArr, command);
                    break;

                case "last":
                    count = Integer.parseInt(command[1]);
                    if (count > initialArr.length)
                        System.out.println("Invalid count");
                    else
                        lastCountElements(initialArr, command);
                    break;
            }
            input = scanner.nextLine();
        }

        for (int i = 0; i < initialArr.length; i++) {
            if (i == 0)
                System.out.print("[" + initialArr[i] + ", ");
            else if (i == initialArr.length - 1)
                System.out.print(initialArr[i] + "]");
            else
                System.out.print(initialArr[i] + ", ");
        }
        System.out.println();
    }

    public static void exchangeCommand(int[] initialArr, String[] command) {
        int index = Integer.parseInt(command[1]);
        String[] rightArr = new String[initialArr.length - index - 1];
        String[] leftArr = new String[index + 1];

        int count1 = 0;
        int count2 = 0;

        for (int i = index + 1; i < initialArr.length; i++) {
            rightArr[count1] = "" + initialArr[i];
            count1++;
        }

        for (int i = 0; i <= index; i++) {
            leftArr[count2] = "" + initialArr[i];
            count2++;
        }

        String join = String.join(" ", rightArr) + " " + String.join(" ", leftArr);
        String[] result = join.split(" ");
        for (int i = 0; i < initialArr.length; i++) {
            initialArr[i] = Integer.parseInt(result[i]);
        }
    }

    public static void maxElementIndex(int[] initialArr, String[] command) {
        String type = "" + command[1];
        int maxEven = Integer.MIN_VALUE;
        int maxOdd = Integer.MIN_VALUE;
        int maxEvenIndex = 0;
        int maxOddIndex = 0;

        for (int i = 0; i < initialArr.length; i++) {
            if (initialArr[i] % 2 == 0) {
                if (initialArr[i] >= maxEven) {
                    maxEvenIndex = i;
                    maxEven = initialArr[i];
                }
            } else {
                if (initialArr[i] >= maxOdd) {
                    maxOddIndex = i;
                    maxOdd = initialArr[i];
                }
            }
        }

        if (type.equals("even")) {
            if (maxEven == Integer.MIN_VALUE)
                System.out.println("No matches");
            else
                System.out.println(maxEvenIndex);
        } else if (type.equals("odd")) {
            if (maxOdd == Integer.MIN_VALUE)
                System.out.println("No matches");
            else
                System.out.println(maxOddIndex);
        }
    }

    public static void minElementIndex(int[] initialArr, String[] command) {
        String type = "" + command[1];
        int minEven = Integer.MAX_VALUE;
        int minOdd = Integer.MAX_VALUE;
        int minEvenIndex = -1;
        int minOddIndex = -1;

        for (int i = 0; i < initialArr.length; i++) {
            if (initialArr[i] % 2 == 0) {
                if (initialArr[i] <= minEven) {
                    minEven = initialArr[i];
                    minEvenIndex = i;
                }
            } else {
                if (initialArr[i] <= minOdd) {
                    minOdd = initialArr[i];
                    minOddIndex = i;
                }
            }
        }

        if (type.equals("even")) {
            if (minEven == Integer.MAX_VALUE)
                System.out.println("No matches");
            else
                System.out.println(minEvenIndex);
        } else if (type.equals("odd")) {
            if (minOdd == Integer.MAX_VALUE)
                System.out.println("No matches");
            else
                System.out.println(minOddIndex);
        }
    }

    public static void firstCountElements(int[] initialArr, String[] command) {
        int count = Integer.parseInt(command[1]);
        String type = command[2];
        String allEven = "";
        String allOdd = "";
        int allOddNums = 0;
        int allEvenNums = 0;

        for (int i = 0; i < initialArr.length; i++) {
            if (initialArr[i] % 2 == 0) {
                allEven += initialArr[i] + " ";
                allEvenNums++;
            } else {
                allOdd += initialArr[i] + " ";
                allOddNums++;
            }
        }

        if (type.equals("even")) {
            //working Ok
            if (allEven.isEmpty())
                System.out.println("[]");

                //working Ok
            else if (allEvenNums == 1 || count == 1) {
                int[] countEven = Arrays.stream(allEven.split(" ")).mapToInt(Integer::parseInt).toArray();
                System.out.println("[" + countEven[0] + "]");

            } else {
                int[] countEven = Arrays.stream(allEven.split(" ")).mapToInt(Integer::parseInt).toArray();

                if (countEven.length <= count) {
                    //print all countEven array - working Ok
                    for (int i = 0; i < countEven.length; i++) {
                        if (i == 0)
                            System.out.print("[" + countEven[i] + ", ");
                        else if (i == countEven.length - 1)
                            System.out.print(countEven[i] + "]");
                        else
                            System.out.print(countEven[i] + ", ");
                    }
                    System.out.println();

                } else {
                    //print up to count elements - working Ok
                    for (int i = 0; i < count; i++) {
                        if (i == 0)
                            System.out.print("[" + countEven[i] + ", ");
                        else if (i == count - 1)
                            System.out.print(countEven[i] + "]");
                        else
                            System.out.print(countEven[i] + ", ");
                    }
                    System.out.println();
                }
            }

        } else if (type.equals("odd")) {

            if (allOdd.isEmpty())
                System.out.println("[]");

            else if (allOddNums == 1 || count == 1) {
                int[] countOdd = Arrays.stream(allOdd.split(" ")).mapToInt(Integer::parseInt).toArray();
                System.out.println("[" + countOdd[0] + "]");

            } else {
                int[] countOdd = Arrays.stream(allOdd.split(" ")).mapToInt(Integer::parseInt).toArray();

                if (countOdd.length <= count) {
                    //print all countEven array
                    for (int i = 0; i < countOdd.length; i++) {
                        if (i == 0)
                            System.out.print("[" + countOdd[i] + ", ");
                        else if (i == countOdd.length - 1)
                            System.out.print(countOdd[i] + "]");
                        else
                            System.out.print(countOdd[i] + ", ");
                    }
                    System.out.println();

                } else {
                    //print up to count elements
                    for (int i = 0; i < count; i++) {
                        if (i == 0)
                            System.out.print("[" + countOdd[i] + ", ");
                        else if (i == count - 1)
                            System.out.print(countOdd[i] + "]");
                        else
                            System.out.print(countOdd[i] + ", ");
                    }
                    System.out.println();
                }
            }
        }
    }


    public static void lastCountElements(int[] initialArr, String[] command) {
        int count = Integer.parseInt(command[1]);
        String type = command[2];
        String allOdd = "";
        String allEven = "";
        int allOddNums = 0;
        int allEvenNums = 0;

        for (int i = 0; i < initialArr.length; i++) {
            if (initialArr[i] % 2 == 0) {
                allEven += initialArr[i] + " ";
                allEvenNums++;
            } else {
                allOdd += initialArr[i] + " ";
                allOddNums++;
            }
        }

        if (type.equals("even")) {

            //working Ok
            if (allEvenNums == 0)
                System.out.println("[]");

                //working Ok
            else if (allEvenNums == 1 || count == 1) {
                int[] countEven = Arrays.stream(allEven.split(" ")).mapToInt(Integer::parseInt).toArray();
                System.out.println("[" + countEven[countEven.length - 1] + "]");

            } else {
                int[] countEven = Arrays.stream(allEven.split(" ")).mapToInt(Integer::parseInt).toArray();

                if (countEven.length <= count) {
                    //print all array:
                    for (int i = 0; i < countEven.length; i++) {
                        if (i == 0)
                            System.out.print("[" + countEven[i] + ", ");
                        else if (i == countEven.length - 1)
                            System.out.print(countEven[i] + "]");
                        else
                            System.out.print(countEven[i] + ", ");
                    }
                    System.out.println();

                } else {
                    //print up to count elements:
                    for (int i = countEven.length - count; i < countEven.length; i++) {
                        if (i == countEven.length - count)
                            System.out.print("[" + countEven[i] + ", ");
                        else if (i == countEven.length - 1)
                            System.out.print(countEven[i] + "]");
                        else
                            System.out.print(countEven[i] + ", ");
                    }
                    System.out.println();
                }
            }

        } else if (type.equals("odd")) {

            if (allOddNums == 0)
                System.out.println("[]");

            else if (allOddNums == 1 || count == 1) {
                int[] countOdd = Arrays.stream(allOdd.split(" ")).mapToInt(Integer::parseInt).toArray();
                System.out.println("[" + countOdd[countOdd.length - 1] + "]");

            } else {
                int[] countOdd = Arrays.stream(allOdd.split(" ")).mapToInt(Integer::parseInt).toArray();

                if (countOdd.length <= count) {
                    for (int i = 0; i < countOdd.length; i++) {
                        if (i == 0)
                            System.out.print("[" + countOdd[i] + ", ");
                        else if (i == countOdd.length - 1)
                            System.out.print(countOdd[i] + "]");
                        else
                            System.out.print(countOdd[i] + ", ");
                    }
                    System.out.println();

                } else {
                    for (int i = countOdd.length - count; i < countOdd.length; i++) {
                        if (i == countOdd.length - count)
                            System.out.print("[" + countOdd[i] + ", ");
                        else if (i == countOdd.length - 1)
                            System.out.print(countOdd[i] + "]");
                        else
                            System.out.print(countOdd[i] + ", ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
