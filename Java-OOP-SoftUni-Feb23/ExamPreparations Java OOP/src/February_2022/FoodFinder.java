package February_2022;

import java.util.*;

public class FoodFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input1 = scanner.nextLine().split("\\s+");
        String[] input2 = scanner.nextLine().split("\\s+");

        Deque<String> vowels = new ArrayDeque<>();
        Deque<String> consonants = new ArrayDeque<>();

        Arrays.stream(input1).forEach(vowels::offer);
        Arrays.stream(input2).forEach(consonants::push);

        String olive = "olive", pear = "pear", flour = "flour", pork = "pork";

        while (!vowels.isEmpty() && !consonants.isEmpty()){
            String vowel = vowels.poll();
            String consonant = consonants.pop();
            vowels.offer(vowel);

            pear = pear.replace(vowel, "").replace(consonant, "");
            flour = flour.replace(vowel, "").replace(consonant, "");
            pork = pork.replace(vowel, "").replace(consonant, "");
            olive = olive.replace(vowel, "").replace(consonant, "");
        }

        List<String> words = new ArrayList<>();
        if (pear.equals("")) words.add("pear");
        if (flour.equals("")) words.add("flour");
        if (pork.equals("")) words.add("pork");
        if (olive.equals("")) words.add("olive");

        System.out.println("Words found: " + words.size());
        words.forEach(System.out::println);
    }
}
