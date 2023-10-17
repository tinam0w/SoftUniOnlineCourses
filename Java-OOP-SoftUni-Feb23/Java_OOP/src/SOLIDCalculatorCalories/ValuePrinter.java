package SOLIDCalculatorCalories;

public class ValuePrinter {
    private static final String SUM_STRING_FORMAT = "Sum: %f";
    private static final String AVG_STRING_FORMAT = "Average: %f";

    public void printSum(double sum) {
        System.out.printf((SUM_STRING_FORMAT) + "%n", sum);
    }

    public void printAverage(double average) {
        System.out.printf((AVG_STRING_FORMAT) + "%n", average);
    }
}
