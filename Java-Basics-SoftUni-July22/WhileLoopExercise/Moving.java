package WhileLoopExercise;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int allSpace = width * length * height;
        boolean noSpace = false;

        String input = scanner.nextLine();
        while (!input.equals("Done")){
            int box = Integer.parseInt(input);
            allSpace = allSpace - box;
            if (allSpace <= 0) {
                noSpace = true;
                break;
            }
            input = scanner.nextLine();
        }

        if (!noSpace)
            System.out.printf("%d Cubic meters left.",allSpace );
        else
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(allSpace));
    }
}
