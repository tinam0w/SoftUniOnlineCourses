package JavaAdvanced.SersAndMapsExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class fixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        Map<String, String> map = new LinkedHashMap<>();

        while (!name.equals("stop")){
            String email = scanner.nextLine();
            email = email.toLowerCase();
            if (email.endsWith("us") || email.endsWith("uk") ||
            email.endsWith("com")){
                name = scanner.nextLine();
                continue;
            } else {
                map.put(name, email);
            }
            name = scanner.nextLine();
        }
        map.entrySet().stream().forEach(e -> {
            System.out.println(e.getKey() + " -> " + e.getValue());
        });
    }
}
