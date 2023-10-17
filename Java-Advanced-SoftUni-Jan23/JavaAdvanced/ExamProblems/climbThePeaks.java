package JavaAdvanced.ExamProblems;

import java.util.*;
import java.util.stream.Collectors;

public class climbThePeaks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> queueFood = new ArrayDeque<>();
        queueFood.addAll(Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList()));

        ArrayDeque<Integer> stackStamina = new ArrayDeque<>();
        stackStamina.addAll(Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList()));

        List<Integer> peaksDiff = new ArrayList<>();
        fillList(peaksDiff);
        Set<Integer> climbedPeaks = new LinkedHashSet<>();

        for (int i = 0; i < 7; i++) {
            int sum = queueFood.pollLast() + stackStamina.pop();
            if (peaksDiff.isEmpty()) {
                break;
            } else {
                if (sum >= peaksDiff.get(0)) {
                    climbedPeaks.add(peaksDiff.get(0));
                    peaksDiff.remove(0);
                }
            }
        }

        Set<String> peakNames = new LinkedHashSet<>();
        fillnames(climbedPeaks, peakNames);

        if (peakNames.size() == 5){
            System.out.println("Alex did it! He climbed all top five Pirin peaks in one week -> @FIVEinAWEEK");
        } else {
            System.out.println("Alex failed! He has to organize his journey better next time -> @PIRINWINS");
        }
        if(!peakNames.isEmpty()){
            System.out.println("Conquered peaks:");
            for (String name : peakNames) {
                System.out.println(name);
            }
        }

    }

    private static void fillnames(Set<Integer> climbedPeaks, Set<String> peakNames) {
        for (Integer level : climbedPeaks) {
            if (level == 80)
                peakNames.add("Vihren");
            if(level == 90)
                peakNames.add("Kutelo");
            if(level == 100)
                peakNames.add("Banski Suhodol");
            if(level == 60)
                peakNames.add("Polezhan");
            if(level == 70)
                peakNames.add("Kamenitza");
        }
    }

    private static void fillList(List<Integer> peaksDiff) {
        peaksDiff.add(80);
        peaksDiff.add(90);
        peaksDiff.add(100);
        peaksDiff.add(60);
        peaksDiff.add(70);
    }
}
