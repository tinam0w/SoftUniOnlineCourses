package AssociativeArraysMore;

import java.util.*;


public class Snowwhite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> hatName = new LinkedHashMap<>();
        Map<String, Integer> hatPhysics = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("Once upon a time")) {
            String name = input.split(" <:> ")[0];
            String hat = input.split(" <:> ")[1];
            int physics = Integer.parseInt(input.split(" <:> ")[2]);
            hatPhysics.put(hat, physics);
            if (hatName.containsKey(hat)) {
                if (hatName.get(hat).contains(name)) {
                    if (hatPhysics.get(hat) < physics) {
                        hatPhysics.put(hat, physics);
                    }
                } else {
                    hatName.get(hat).add(name);
                }
            } else {
                hatName.put(hat, new ArrayList<>());
                hatName.get(hat).add(name);
            }
            input = scanner.nextLine();
        }

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        hatPhysics.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered(e -> sortedMap.put(e.getKey(), e.getValue()));

        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println("(" + entry.getKey() + ")" + hatName.get(entry.getKey()) + " <-> " + entry.getValue()
            );
        }

        //int index = 0;
        //for (Map.Entry<Integer, List<String>> entry : dwarfs.entrySet()) {
        //System.out.println("(" + entry.getValue().get(index + 1) + ") "
        // + entry.getValue().get(index) + " <-> " + entry.getKey());
        //index++;
        //}
    }
}
