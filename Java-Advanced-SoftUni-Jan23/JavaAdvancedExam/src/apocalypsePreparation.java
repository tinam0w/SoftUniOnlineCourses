import java.util.*;

public class apocalypsePreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input1 = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] input2 = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Deque<Integer> textiles = new ArrayDeque<>();
        Arrays.stream(input1).forEach(textiles::offer);

        Deque<Integer> medicaments = new ArrayDeque<>();
        Arrays.stream(input2).forEach(medicaments::push);

        int patch = 0, bandage = 0, medKit = 0;

        while (!textiles.isEmpty() && !medicaments.isEmpty()) {
            int currentTextile = textiles.poll();
            int currentMedicament = medicaments.pop();
            int sum = currentTextile + currentMedicament;

            if (sum == 30) {
                patch++;
            } else if (sum == 40) {
                bandage++;
            } else if (sum == 100) {
                medKit++;
            } else {
                if (sum > 100) {
                    medKit++;
                    int toAdd = sum - 100;
                    if (!medicaments.isEmpty()) {
                        int nextMed = medicaments.pop();
                        medicaments.push(nextMed + toAdd);
                    } //else {
                        //medicaments.push(toAdd);
                    //}
                } else {
                    medicaments.push(currentMedicament + 10);
                }
            }
        }

        if (textiles.isEmpty() && medicaments.isEmpty()) {
            System.out.println("Textiles and medicaments are both empty.");
        } else if (textiles.isEmpty()) {
            System.out.println("Textiles are empty.");
        } else if (medicaments.isEmpty()) {
            System.out.println("Medicaments are empty.");
        }

        Map<String, Integer> map = new TreeMap<>();
        if (patch > 0) map.put("Patch", patch);
        if (bandage > 0) map.put("Bandage", bandage);
        if (medKit > 0) map.put("MedKit", medKit);

        map.entrySet().stream().sorted((s1, s2) -> s2.getValue().compareTo(s1.getValue())).forEach(e -> {
            System.out.println(e.getKey() + " - " + e.getValue());
        });

        if (!medicaments.isEmpty()) {
            System.out.print("Medicaments left: ");
            List<String> toPrint = new ArrayList<>();
            medicaments.forEach(e -> toPrint.add(e + ""));
            System.out.println(String.join(", ", toPrint));
        }

        if (!textiles.isEmpty()) {
            System.out.print("Textiles left: ");
            List<String> toPrint = new ArrayList<>();
            textiles.forEach(e -> toPrint.add(e + ""));
            System.out.println(String.join(", ", toPrint));
        }
    }
}
