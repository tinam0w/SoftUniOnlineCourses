package JavaAdvanced.SersAndMapsExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> map = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("search")) {
            String name = input.split("-")[0];
            String phone = input.split("-")[1];
            map.put(name, phone);
            input = scanner.nextLine();
        }
        String search = scanner.nextLine();
        while (!search.equals("stop")){
            if (map.containsKey(search)){
                System.out.println(search + " -> " + map.get(search));
            } else {
                System.out.println("Contact " + search + " does not exist.");
            }
            search = scanner.nextLine();
        }
    }
}
