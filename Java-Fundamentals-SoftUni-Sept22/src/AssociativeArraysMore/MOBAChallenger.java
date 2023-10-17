package AssociativeArraysMore;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MOBAChallenger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Integer>> playersMap = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("Season end")) {
            if (input.contains(" -> ")) {
                String player = input.split(" -> ")[0];
                String position = input.split(" -> ")[1];
                int skill = Integer.parseInt(input.split(" -> ")[2]);
                playersMap.putIfAbsent(player, new LinkedHashMap<>());
                playersMap.get(player).putIfAbsent(position, 0);
                playersMap.get(player).put(position, Math.max(skill, playersMap.get(player).get(position)));
            } else {
                String player1 = input.split(" vs ")[0];
                String player2 = input.split(" vs ")[1];
                int totalPoints1 = 0;
                int totalPoints2 = 0;

                if (playersMap.containsKey(player1) && playersMap.containsKey(player2)) {
                    for (Map.Entry<String, Integer> entry : playersMap.get(player1).entrySet()) {
                        totalPoints1 += entry.getValue();
                    }
                    for (Map.Entry<String, Integer> entry : playersMap.get(player2).entrySet()) {
                        totalPoints2 += entry.getValue();
                    }
                    for (Map.Entry<String, Integer> entry1 : playersMap.get(player1).entrySet()) {
                        for (Map.Entry<String, Integer> entry2 : playersMap.get(player2).entrySet()) {
                            if (entry1.getKey().equals(entry2.getKey())) {
                                if (totalPoints1 > totalPoints2) {
                                    playersMap.remove(player2);
                                    break;
                                } else if (totalPoints2 > totalPoints1) {
                                    playersMap.remove(player1);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            input = scanner.nextLine();
        }

        //нямам сортиране!
        for (Map.Entry<String, Map<String, Integer>> e : playersMap.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue().entrySet().stream().mapToInt(item -> item.getValue()).sum() + " skill");
            for (Map.Entry<String, Integer> entry : e.getValue().entrySet()) {
                System.out.println("- " + entry.getKey() + " <::> " + entry.getValue());
            }
        }
    }
}
