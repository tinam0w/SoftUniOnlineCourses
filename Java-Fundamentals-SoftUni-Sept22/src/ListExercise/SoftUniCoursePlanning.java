package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> schedule = Arrays.stream(scanner.nextLine().split("\\, ")).collect(Collectors.toList());

        String[] command = scanner.nextLine().split("\\:");
        while (!command[0].equals("course start")) {
            String lesson = command[1];
            switch (command[0]) {
                case "Add":
                    if (!schedule.contains(lesson))
                        schedule.add(lesson);
                    break;
                case "Insert":
                    int index = Integer.parseInt(command[2]);
                    if (!schedule.contains(lesson))
                        schedule.add(index, lesson);
                    break;
                case "Remove":
                    if (schedule.contains(lesson))
                        schedule.remove(lesson);
                    if (schedule.contains(lesson + "-Exercise"))
                        schedule.remove(lesson + "-Exercise");
                    break;
                case "Swap":
                    String lesson2 = command[2];
                    if (schedule.contains(lesson) && schedule.contains(lesson2)) {
                        int index1 = schedule.indexOf(lesson);
                        int index2 = schedule.indexOf(lesson2);
                        schedule.set(index1, lesson2);
                        schedule.set(index2, lesson);
                        if (schedule.contains(lesson + "-Exercise")) {
                            schedule.remove(lesson + "-Exercise");
                            schedule.add(schedule.indexOf(lesson + 1), lesson + "-Exercise");
                        }
                        if (schedule.contains(lesson2 + "-Exercise")) {
                            schedule.remove(lesson2 + "-Exercise");
                            schedule.add(schedule.indexOf(lesson2) + 1, lesson2 + "-Exercise");
                        }
                    }
                    break;
                case "Exercise":
                    if (schedule.contains(lesson)) {
                        if (schedule.indexOf(lesson) == schedule.size() - 1)
                            schedule.add(schedule.indexOf(lesson) + 1, lesson + "-Exercise");
                        else if (!(schedule.contains(lesson + "-Exercise")))
                            schedule.add(schedule.indexOf(lesson) + 1, lesson + "-Exercise");
                    } else {
                        schedule.add(lesson);
                        schedule.add(lesson + "-Exercise");
                    }
                    break;
            }
            command = scanner.nextLine().split("\\:");
        }
        for (int i = 0; i < schedule.size(); i++) {
            System.out.println(i + 1 + "." + schedule.get(i));
        }
    }
}
