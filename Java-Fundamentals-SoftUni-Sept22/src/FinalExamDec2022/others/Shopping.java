package FinalExamDec2022.others;

import java.util.*;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> storeMap = new LinkedHashMap<>();
        Map<String, String> importantMap = new LinkedHashMap<>();
        while (!input.equals("Go Shopping")) {
            String[] tokens = input.split("->");
            String store = tokens[1];
            if (tokens[0].equals("Add")) {
                List<String> allItems = Arrays.stream(tokens[2].split(",")).toList();
                List<String> itemsToRemove = new ArrayList<>();
                if (storeMap.size() > 0) {
                    for (String item : allItems) {
                        for (Map.Entry<String, List<String>> entry : storeMap.entrySet()) {
                            if (entry.getValue().contains(item))
                                itemsToRemove.add(item);
                        }
                    }
                }
                List<String> itemsToAdd = new ArrayList<>();
                for (String item : allItems) {
                    if (!itemsToRemove.contains(item))
                        itemsToAdd.add(item);
                }
                if (!storeMap.containsKey(store)) {
                    storeMap.put(store, itemsToAdd);
                } else {
                    for (String item : itemsToAdd) {
                        storeMap.get(store).add(item);
                    }
                }
            } else if (tokens[0].equals("Important")) {
                boolean doesExist = false;
                for (Map.Entry<String, List<String>> entry : storeMap.entrySet()) {
                    if (entry.getValue().contains(tokens[2]))
                        doesExist = true;
                }
                if (!doesExist) {
                    if (!storeMap.containsKey(store)) {
                        storeMap.put(store, new ArrayList<>());
                        storeMap.get(store).add(tokens[2]);
                    } else {
                        if (!storeMap.get(store).contains(tokens[2]))
                            storeMap.get(store).add(0, tokens[2]);
                        else {
                            int index = storeMap.get(store).indexOf(tokens[2]);
                            Collections.swap(storeMap.get(store), 0, index);
                        }
                    }
                    importantMap.put(store, tokens[2]);
                }
            } else if (tokens[0].equals("Remove")) {
                if (!importantMap.containsKey(store)) {
                    storeMap.remove(store);
                }
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : storeMap.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (String item : entry.getValue()) {
                System.out.println(" - " + item);
            }
        }
    }
}
