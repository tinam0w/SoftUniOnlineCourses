package InterfacesАndAbstractionExercise.FoodShortage;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Buyer> buyers = new HashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().split("\\s+");
            Buyer buyer;
            if (parts.length == 4) {
                buyer = new Citizen(parts[0], Integer.parseInt(parts[1]), parts[2], parts[3]);
            } else {
                buyer = new Rebel(parts[0], Integer.parseInt(parts[1]), parts[2]);
            }
            buyers.put(parts[0], buyer);
        }

        String inputNames = scanner.nextLine();
        while (!inputNames.equals("End")){
            Buyer buyer = buyers.get(inputNames);

            if (buyer!= null){
                buyer.buyFood();
            }
            inputNames = scanner.nextLine();
        }

        int totalFood = buyers.values().stream()
                .mapToInt(Buyer::getFood)
                .sum();

        System.out.println(totalFood);
    }
}