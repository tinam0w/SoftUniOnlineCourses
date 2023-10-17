package ListMore;

import java.util.*;
import java.util.stream.Collectors;

public class MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> mixedList = new ArrayList<>();

        if (firstList.size() > secondList.size()) {
            for (int i = 0; i < firstList.size(); i++) {
                if (i > firstList.size() - 3)
                    break;
                mixedList.add(firstList.get(i));
                mixedList.add(secondList.get(firstList.size() - 3 - i));
            }
        } else {
            for (int i = 0; i < secondList.size(); i++) {
                if (i > firstList.size() - 1)
                    break;
                mixedList.add(firstList.get(i));
                mixedList.add(secondList.get(secondList.size() - 1 - i));
            }
        }

        int startRange = 0;
        int endRange = 0;
        if (firstList.size() > secondList.size()){
            startRange = firstList.get(firstList.size() - 1);
            endRange = firstList.get(firstList.size() - 2);
        } else {
            startRange = secondList.get(0);
            endRange = secondList.get(1);
        }
        int start = Math.min(startRange, endRange);
        int end = Math.max(startRange, endRange);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < mixedList.size() ; i++) {
            if (mixedList.get(i) > start && mixedList.get(i) < end)
                result.add(mixedList.get(i));
        }
        Collections.sort(result);
        for (int item : result) {
            System.out.print(item + " ");
        }
    }
}
