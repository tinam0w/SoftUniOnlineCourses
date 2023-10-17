package FundamentalsBasicsExercise;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double saberCost = Double.parseDouble(scanner.nextLine());
        double robeCost = Double.parseDouble(scanner.nextLine());
        double beltCost = Double.parseDouble(scanner.nextLine());

        double sabers = saberCost * Math.ceil(students * 1.1);
        double robes = robeCost * students;
        double belts = beltCost * (students - (students / 6));

        double total = sabers + robes + belts;

        if (total <= budget)
            System.out.printf("The money is enough - it would cost %.2flv.", total);
        else
            System.out.printf("George Lucas will need %.2flv more.", total - budget);
    }
}
