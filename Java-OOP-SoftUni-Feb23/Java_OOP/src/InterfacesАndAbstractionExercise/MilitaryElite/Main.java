package InterfacesАndAbstractionExercise.MilitaryElite;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("End")){
            String[] parts = input.split("\\s+");
            String objectType = parts[0];
            SoldierImpl soldier;
            switch (objectType){
                case "Private":
                    soldier = new PrivateImpl(Integer.parseInt(parts[1]),
                            parts[2], parts[3], Double.parseDouble(parts[4]));
                    break;
                case "LieutenantGeneral":
                    //soldier = new LieutenantGeneralImpl(Integer.parseInt(parts[1]),
                    //        parts[2], parts[3], Double.parseDouble(parts[4]),
                    //        )
                    break;
                case "Engineer":

                    break;
                case "Commando":

                    break;
                case "Spy":

                    break;
            }

            input = scanner.nextLine();
        }


    }
}
