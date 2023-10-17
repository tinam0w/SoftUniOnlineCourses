package ForLoopExtra;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int period = Integer.parseInt(scanner.nextLine());
        int treated = 0;
        int untreated = 0;
        int doctors = 7;

        for (int i = 1; i <= period; i++) {
            if (i % 3 == 0 && untreated > treated)
                doctors = doctors + 1;
            int patients = Integer.parseInt(scanner.nextLine());
            if (patients <= doctors) treated = treated + patients;
            else {
                untreated = untreated + (patients - doctors);
                treated = treated + doctors;
            }
        }
        System.out.printf("Treated patients: %d.%n", treated);
        System.out.printf("Untreated patients: %d.%n", untreated);
    }
}
