package JavaAdvanced.SersAndMapsExercise;

import java.util.*;

public class handsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Set<String>> map = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("JOKER")){
            String name = input.split(": ")[0];
            String part2 = input.split(": ")[1];
            String[] cards = part2.split(", ");
            if (!map.containsKey(name)){
                map.put(name, new TreeSet<>());
            }
            for (String card:cards) {
                map.get(name).add(card);
            }
            input = scanner.nextLine();
        }

        Map<String, Integer> map2 = new LinkedHashMap<>();
        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            int sum = 0;
            for (String card : entry.getValue()) {
                int cardTotal = countPoints(card);
                sum += cardTotal;
            }
            map2.put(entry.getKey(), sum);
        }

        map2.entrySet().stream().forEach(e -> {
            System.out.println(e.getKey() + ": " + e.getValue());
        });

    }
    private static int countPoints(String card){
        String type = card.charAt(card.length() - 1) + "";
        String power = card.replace(type, "");
        int powerPoints = 0;
        switch (power){
            case "J":
                powerPoints = 11;
                break;
            case "Q":
                powerPoints = 12;
                break;
            case "K":
                powerPoints = 13;
                break;
            case "A":
                powerPoints = 14;
                break;
            default:
                powerPoints = Integer.parseInt(power);
                break;
        }
        switch (type){
            case "S":
                powerPoints = powerPoints * 4;
                break;
            case "H":
                powerPoints = powerPoints * 3;
                break;
            case "D":
                powerPoints = powerPoints * 2;
                break;
        }
        return powerPoints;
    }
}
