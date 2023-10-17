package JavaAdvanced.genericsLab.GenericArrayCreator;

public class Main {
    public static void main(String[] args) {

        Integer[] arr = ArrayCreator.create(Integer.class, 5, 13);

        System.out.println(arr[0]);

    }
}
