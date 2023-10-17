package FinalExam04;

import java.util.*;

public class HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> heroesMap = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            int hitPoint = Integer.parseInt(input[1]);
            if (hitPoint > 100)
                hitPoint = 100;
            int manaPoint = Integer.parseInt(input[2]);
            if (manaPoint > 200)
                manaPoint = 200;
            heroesMap.putIfAbsent(name, new ArrayList<>());
            heroesMap.get(name).add(hitPoint);
            heroesMap.get(name).add(manaPoint);
        }

        String command = scanner.nextLine();
        while (!command.endsWith("End")) {
            String[] tokens = command.split(" - ");
            String name = tokens[1];
            switch (tokens[0]) {
                case "CastSpell":
                    int manaNeeded = Integer.parseInt(tokens[2]);
                    String spellName = tokens[3];
                    if (heroesMap.get(name).get(1) >= manaNeeded) {
                        heroesMap.get(name).set(1, heroesMap.get(name).get(1) - manaNeeded);
                        System.out.println(name + " has successfully cast " + spellName + " and now has " + heroesMap.get(name).get(1) + " MP!");
                    } else {
                        System.out.println(name + " does not have enough MP to cast " + spellName + "!");
                    }
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(tokens[2]);
                    String attacker = tokens[3];
                    heroesMap.get(name).set(0, heroesMap.get(name).get(0) - damage);
                    if (heroesMap.get(name).get(0) > 0) {
                        System.out.println(name + " was hit for " + damage + " HP by " +
                                attacker + " and now has " + heroesMap.get(name).get(0) +
                                " HP left!");
                    } else {
                        System.out.println(name + " has been killed by " + attacker + "!");
                        heroesMap.remove(name);
                    }
                    break;
                case "Recharge":
                    int amount = Integer.parseInt(tokens[2]);
                    if (heroesMap.get(name).get(1) + amount > 200) {
                        amount = 200 - heroesMap.get(name).get(1);
                        heroesMap.get(name).set(1, 200);
                    } else
                        heroesMap.get(name).set(1, heroesMap.get(name).get(1) + amount);
                    System.out.println(name + " recharged for " + amount + " MP!");
                    break;
                case "Heal":
                    int healAmount = Integer.parseInt(tokens[2]);
                    if (heroesMap.get(name).get(0) + healAmount > 100) {
                        healAmount = 100 - heroesMap.get(name).get(0);
                        heroesMap.get(name).set(0, 100);
                    } else
                        heroesMap.get(name).set(0, heroesMap.get(name).get(0) + healAmount);
                    System.out.println(name + " healed for " + healAmount + " HP!");
                    break;
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, List<Integer>> entry : heroesMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println("  HP: " + entry.getValue().get(0));
            System.out.println("  MP: " + entry.getValue().get(1));
        }
    }
}
