package ListLab;

import java.util.*;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> result = new ArrayList<>();

        int smallerSize = Math.min(firstList.size(), secondList.size());
        for (int i = 0; i < smallerSize ; i++) {
            int numFirstList = firstList.get(i);
            int numSecondList = secondList.get(i);
            result.add(numFirstList);
            result.add(numSecondList);
        }

        if(firstList.size() > secondList.size()){
            result.addAll(firstList.subList(smallerSize, firstList.size()));
        } else if (secondList.size() > firstList.size()){
            result.addAll(secondList.subList(smallerSize, secondList.size()));
        }

        System.out.println(result.toString().replaceAll("[\\[\\],]", ""));
    }
}
