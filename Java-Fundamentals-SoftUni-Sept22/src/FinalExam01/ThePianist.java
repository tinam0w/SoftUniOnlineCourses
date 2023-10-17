package FinalExam01;

import java.util.*;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> piecesMap = new LinkedHashMap<>();
        for (int i = 1; i <= n ; i++) {
            String[] input = scanner.nextLine().split("\\|");
            piecesMap.putIfAbsent(input[0],new ArrayList<>());
            piecesMap.get(input[0]).add(input[1]);
            piecesMap.get(input[0]).add(input[2]);
        }

        String[] commands = scanner.nextLine().split("\\|");
        while (!commands[0].equals("Stop")){
            String piece = commands[1];
            switch (commands[0]){
                case "Add":
                    if (piecesMap.containsKey(piece))
                        System.out.println(piece + " is already in the collection!");
                    else {
                        piecesMap.put(piece, new ArrayList<>());
                        piecesMap.get(piece).add(commands[2]);
                        piecesMap.get(piece).add(commands[3]);
                        System.out.println(piece + " by " + commands[2] + " in " + commands[3] + " added to the collection!");
                    }
                    break;
                case "Remove":
                    if (piecesMap.containsKey(piece)){
                        piecesMap.remove(piece);
                        System.out.println("Successfully removed " + piece + "!");
                    } else
                        System.out.println("Invalid operation! " + piece + " does not exist in the collection.");
                    break;
                case "ChangeKey":
                    if (piecesMap.containsKey(piece)){
                        piecesMap.get(piece).set(1, commands[2]);
                        System.out.println("Changed the key of " + piece + " to " + commands[2] + "!");
                    } else
                        System.out.println("Invalid operation! " + piece + " does not exist in the collection.");
                    break;
            }

            commands = scanner.nextLine().split("\\|");
        }
        for (Map.Entry<String, List<String>> entry : piecesMap.entrySet()) {
            System.out.println(entry.getKey() + " -> Composer: " + entry.getValue().get(0) + ", Key: " + entry.getValue().get(1));
        }
    }
}
