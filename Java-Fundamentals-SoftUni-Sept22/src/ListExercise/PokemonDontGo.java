package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        List<Integer> distances = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        while(distances.size() > 0){
            int index = Integer.parseInt(scanner.nextLine());

            if (index >= 0 && index <= distances.size() - 1){
                int removed = distances.get(index);
                sum += removed;
                distances.remove(index);
                manipulateList(distances, removed);

            } else if (index < 0) {
                int first = distances.get(0);
                sum += first;
                distances.remove(distances.get(0));
                distances.add(0, distances.get(distances.size() - 1));
                manipulateList(distances, first);

            } else if (index > distances.size() - 1) {
                int last = distances.get(distances.size() - 1);
                sum += last;
                int firstE = distances.get(0);
                distances.remove(distances.size() - 1);
                distances.add(firstE);
                manipulateList(distances, last);
            }
        }
        System.out.println(sum);
    }
    
    public static void manipulateList(List<Integer> list, int removedItem){
        for (int i = 0; i < list.size(); i++) {
            int currentNum = list.get(i);
            if (currentNum <= removedItem){
                currentNum += removedItem;
            } else {
                currentNum -= removedItem;
            }
            list.set(i, currentNum);
        }
    }
}
