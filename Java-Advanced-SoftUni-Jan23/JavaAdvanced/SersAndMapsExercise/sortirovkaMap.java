package JavaAdvanced.SersAndMapsExercise;

import java.util.*;

public class sortirovkaMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, List<Integer>> studentGrades = new LinkedHashMap<>();

        //Iwan : 5 2 4.3 4
        //Pesho : 5 6 2 4 5.5 6
        //Dragan : 2 5

        studentGrades.entrySet().stream()
                .sorted((s1,s2) -> s2.getValue().size() - s1.getValue().size());
                //.forEach(//запазваме в нов мап);

        //pri st-t <= 0 ne razmenq
        //pri st-t >0 razmenq


        // sortirovka po kliuchovete
        Map<String, Integer> ppl = new HashMap<>();

        //ppl.entrySet().stream().sorted(comparingByKey());
        //w obraten red
        //ppl.entrySet().stream().sorted(Collections.reverseOrder(comparingByKey()));

        //sortirane po stojnostta
        //ppl.entrySet().stream().sorted(comparingbyValue());
        //w obraten red
        //ppl.entrySet().stream().sorted(Collections.reverseOrder(comparingByValue()));

        //syhranqwame w now map sortiraniq
        //ppl.entrySet().stream().sorted().collect(toMap(//oshte mnogo));

                //ppl = ppl.entrySet().stream().sorted()...

    }
}
