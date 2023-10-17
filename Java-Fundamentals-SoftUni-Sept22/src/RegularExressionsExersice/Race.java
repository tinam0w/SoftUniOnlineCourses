package RegularExressionsExersice;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String namesParticipants = scanner.nextLine();
        List<String> names = Arrays.stream(namesParticipants.split(", ")).collect(Collectors.toList());
        Map<String, Integer> raceDistances = new LinkedHashMap<>();
        names.forEach(name -> raceDistances.put(name, 0));

        Pattern patternLetters = Pattern.compile("[a-zA-Z]+");
        Pattern patternDigits = Pattern.compile("[0-9]");

        String input = scanner.nextLine();
        while (!input.equals("end of race")) {
            StringBuilder racerName = new StringBuilder();
            Matcher matcherLetters = patternLetters.matcher(input);
            while (matcherLetters.find()) {
                racerName.append(matcherLetters.group());
            }
            int distance = 0;
            Matcher matcherDigits = patternDigits.matcher(input);
            while (matcherDigits.find()) {
                distance += Integer.parseInt(matcherDigits.group());
            }
            if (names.contains(racerName.toString())) {
                int currentDistance = raceDistances.get(racerName.toString());
                raceDistances.put(racerName.toString(), currentDistance + distance);
            }
            input = scanner.nextLine();
        }

        List<String> top3names = raceDistances.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

        System.out.println("1st place: " + top3names.get(0));
        System.out.println("2nd place: " + top3names.get(1));
        System.out.println("3rd place: " + top3names.get(2));

//        int count = 1;
//        for (Map.Entry<String, Integer> entry : raceDistances.entrySet()) {
//            if (count == 1) {
//                System.out.println("1st place: " + entry.getKey());
//                count++;
//            } else if (count == 2) {
//                System.out.println("2nd place: " + entry.getKey());
//                count++;
//            } else if (count == 3) {
//                System.out.println("3rd place: " + entry.getKey());
//                break;
//            }
//        }
    }
}
