package AssociativeArraysMore;

import java.util.*;

public class DragonArmy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> typeName = new LinkedHashMap<>();
        Map<String, Integer> nameDamage = new TreeMap<>();
        Map<String, Integer> nameHealth = new TreeMap<>();
        Map<String, Integer> nameArmor = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String type = input[0];
            String name = input[1];
            int damage = Integer.parseInt(input[2]);
            int health = Integer.parseInt(input[3]);
            int armor = Integer.parseInt(input[4]);
            if (!typeName.containsKey(type)) {
                typeName.put(type, new ArrayList<>());
                typeName.get(type).add(name);
            } else {
                typeName.get(type).add(name);
            }
            nameDamage.put(name, damage);
            nameHealth.put(name, health);
            nameArmor.put(name, armor);
        }
        List<String> typesInfo = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : typeName.entrySet()) {
            double avgDamage = 0;
            double avgHealth = 0;
            double avgArmor = 0;
            int countDamage = 0;
            int countHealth = 0;
            int countArmor = 0;
            for (Map.Entry<String, Integer> integerEntry : nameDamage.entrySet()) {
                if (entry.getValue().contains(integerEntry.getKey())) {
                    //avgDamage += integerEntry.getKey(entry.);
                    countDamage++;
                }
            }
            for (Map.Entry<String, Integer> integerEntry : nameHealth.entrySet()) {
                if (integerEntry.getKey().equals(entry.getValue())) {
                    avgHealth += integerEntry.getValue();
                    countHealth++;
                }
            }
            for (Map.Entry<String, Integer> integerEntry : nameArmor.entrySet()) {
                if (integerEntry.getKey().equals(entry.getValue())) {
                    avgArmor += integerEntry.getValue();
                    countArmor++;
                }
            }
            avgDamage = avgDamage / countDamage;
            avgHealth = avgHealth / countHealth;
            avgArmor = avgArmor / countArmor;
            typesInfo.add(entry.getKey() + "::(" + String.format("%.2f", avgDamage) + "/" + String.format("%.2f", avgHealth) + "/" + String.format("%.2f", avgArmor) + ")");
        }
        for (String type : typesInfo) {
            System.out.println(type);
        }

    }
}
