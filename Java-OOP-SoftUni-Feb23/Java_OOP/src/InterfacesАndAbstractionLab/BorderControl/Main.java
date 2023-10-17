package InterfacesАndAbstractionLab.BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Identifiable> citizensAndRobots = new ArrayList<>();
        String[] inputArr = scanner.nextLine().split("\\s+");
        while (!inputArr[0].equals("End")){
            Identifiable citizen = null;
            if (inputArr.length == 3){
                citizen = new Citizen(inputArr[0],Integer.parseInt(inputArr[1]), inputArr[2]);
            } else if (inputArr.length == 2) {
                citizen = new Robot(inputArr[0], inputArr[1]);
            }
            citizensAndRobots.add(citizen);
            inputArr = scanner.nextLine().split("\\s+");
        }

        String fakeIdLastDigits = scanner.nextLine();

//        for (Identifiable identifiable : citizensAndRobots) {
//            if (identifiable.getId().endsWith(fakeIdLastDigits)){
//                System.out.println(identifiable.getId());
//            }
//        }

        citizensAndRobots
                .stream()
                .map(Identifiable::getId)
                .filter(id -> id.endsWith(fakeIdLastDigits))
                .forEach(System.out::println);
    }
}
