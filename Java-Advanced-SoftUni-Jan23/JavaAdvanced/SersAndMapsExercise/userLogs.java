package JavaAdvanced.SersAndMapsExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class userLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String, Integer>> map = new TreeMap<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String regex = "(IP=)(?<ip>\\w.+)\\s+(message=.+)\\s+(user=)(?<name>\\w+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            String name = "";
            String ip = "";
            if (matcher.find()) {
                ip = matcher.group("ip");
                name = matcher.group("name");
            }
            if (!map.containsKey(name)) {
                map.put(name, new LinkedHashMap<>());
            }
            if (!map.get(name).containsKey(ip)) {
                map.get(name).put(ip, 1);
            } else {
                int count = map.get(name).get(ip) + 1;
                map.get(name).put(ip, count);
            }
            input = scanner.nextLine();
        }

        map.entrySet().stream().forEach(entry ->{
            System.out.println(entry.getKey() + ":");
            int count = entry.getValue().size() - 1;
            for (Map.Entry<String, Integer> e : entry.getValue().entrySet()) {
                if (count == 0 )
                    System.out.print(e.getKey() + " => " + e.getValue() + "." + "\n");
                else
                    System.out.print(e.getKey() + " => " + e.getValue() + ", ");
                count--;
            }
        });
    }
}
