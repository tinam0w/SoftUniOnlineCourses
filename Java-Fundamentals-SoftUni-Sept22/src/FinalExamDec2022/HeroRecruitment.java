package FinalExamDec2022;

import java.util.*;

public class HeroRecruitment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        Map<String, List<String>> heroes = new LinkedHashMap<>();
        while (!input[0].equals("End")){
            switch (input[0]){
                case "Enroll":
                    if (heroes.containsKey(input[1])){
                        System.out.println(input[1] + " is already enrolled.");
                    } else {
                        heroes.put(input[1],new ArrayList<>());
                    }
                    break;
                case "Learn":
                    if (!heroes.containsKey(input[1])){
                        System.out.println(input[1] + " doesn't exist.");
                    } else {
                        if (heroes.get(input[1]).contains(input[2])){
                            System.out.println(input[1] + " has already learnt " + input[2] + ".");
                        } else {
                            heroes.get(input[1]).add(input[2]);
                        }
                    }
                    break;
                case "Unlearn":
                    if (!heroes.containsKey(input[1])){
                        System.out.println(input[1] + " doesn't exist.");
                    } else {
                        if (!heroes.get(input[1]).contains(input[2])){
                            System.out.println(input[1] + " doesn't know " + input[2] + ".");
                        } else {
                            heroes.get(input[1]).remove(input[2]);
                        }
                    }
                    break;
            }
            input = scanner.nextLine().split("\\s+");
        }
        System.out.println("Heroes:");
        for (Map.Entry<String, List<String>> entry : heroes.entrySet()) {
            System.out.println("== " + entry.getKey() + ": " + String.join(", ", entry.getValue()));
        }
    }
}
