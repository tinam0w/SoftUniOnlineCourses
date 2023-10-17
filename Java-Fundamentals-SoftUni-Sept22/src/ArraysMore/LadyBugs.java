package ArraysMore;

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int[] startPositions = Arrays.stream(scanner.nextLine().split("\\ +")).mapToInt(Integer::parseInt).toArray();
        int[] field = new int[size];

        //positioning the bugs on the field:
        //The ladybug indexes will be in the range [-2,147,483,647 … 2,147,483,647]:
        for (int i = 0; i < startPositions.length; i++) {
            if (startPositions[i] >= 0 && startPositions[i] <= size - 1) {
                field[startPositions[i]] = 1;
            }
        }

        String input = scanner.nextLine();
        while (!input.equals("end")) {

            //reading commands:
            String[] commandArr = input.split("\\ +");
            int firstIndex = Integer.parseInt(commandArr[0]);
            int flyLength = Integer.parseInt(commandArr[2]);
            boolean isPlaced = false;

            //If you are given a ladybug index that is outside the field, nothing happens:
            //If you are given a ladybug index that does not have a ladybug there, nothing happens:
            //The ladybug indexes will be in the range [-2,147,483,647 … 2,147,483,647]:
            if (firstIndex < 0 || firstIndex > size - 1 || field[firstIndex] == 0) {
                isPlaced = true;
            }

            //The fly length will be in the range [-2,147,483,647 … 2,147,483,647]:
            else if (flyLength < 0) {
                flyLength = Math.abs(flyLength);
                if (commandArr[1].equals("left")) {
                    commandArr[1] = "right";
                    if (flyLength + firstIndex > size - 1) {
                        isPlaced = true;
                    }
                } else if (commandArr[1].equals("right")) {
                    commandArr[1] = "left";
                    if (firstIndex - flyLength < 0) {
                        isPlaced = true;
                    }
                }
            } else if (flyLength == 0)
                isPlaced = true;

            //moving left direction:
            if (commandArr[1].equals("left")) {
                while (!isPlaced) {
                    if (firstIndex - flyLength < 0) {
                        field[firstIndex] = 0;
                        isPlaced = true;
                    } else {
                        if (field[firstIndex - flyLength] == 0) {
                            field[firstIndex - flyLength] = 1;
                            field[firstIndex] = 0;
                            isPlaced = true;
                        } else if (field[firstIndex - flyLength] == 1) {
                            flyLength = flyLength * 2;
                        }
                    }
                }

            //moving right direction:
            } else if (commandArr[1].equals("right")) {
                while (!isPlaced) {
                    if (firstIndex + flyLength > size - 1) {
                        field[firstIndex] = 0;
                        isPlaced = true;
                    } else {
                        if (field[firstIndex + flyLength] == 0) {
                            field[firstIndex + flyLength] = 1;
                            field[firstIndex] = 0;
                            isPlaced = true;
                        } else if (field[firstIndex + flyLength] == 1) {
                            flyLength = flyLength * 2;
                        }
                    }
                }
            }
            input = scanner.nextLine();
        }

        //print the final field:
        for (int item : field) {
            System.out.print(item + " ");
        }
    }
}
