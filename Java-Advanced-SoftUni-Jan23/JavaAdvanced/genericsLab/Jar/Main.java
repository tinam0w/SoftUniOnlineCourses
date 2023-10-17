package JavaAdvanced.genericsLab.Jar;

public class Main {
    public static void main(String[] args) {

        Jar<String> jar = new Jar<>();
        jar.add("me");
        System.out.println(jar.remove());

    }
}
