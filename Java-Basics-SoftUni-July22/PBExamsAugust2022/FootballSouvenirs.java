package PBExamsAugust2022;

import java.util.Scanner;

public class FootballSouvenirs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String team = scanner.nextLine();
        String type = scanner.nextLine();
        int qnty = Integer.parseInt(scanner.nextLine());
        double total = 0;
        boolean country = false;
        boolean souvenir = false;

        switch (team){
            case "Argentina":
                if ( type.equals("flags"))
                    total = qnty * 3.25;
                else if (type.equals("caps"))
                    total = qnty * 7.2;
                else if ( type.equals("posters"))
                    total = qnty * 5.1;
                else if (type.equals("stickers"))
                    total = qnty * 1.25;
                else
                    souvenir = true;
                break;
            case "Brazil":
                if ( type.equals("flags"))
                    total = qnty * 4.2;
                else if (type.equals("caps"))
                    total = qnty * 8.5;
                else if ( type.equals("posters"))
                    total = qnty * 5.35;
                else if (type.equals("stickers"))
                    total = qnty * 1.2;
                else
                    souvenir = true;
                break;
            case "Croatia":
                if ( type.equals("flags"))
                    total = qnty * 2.75;
                else if (type.equals("caps"))
                    total = qnty * 6.9;
                else if ( type.equals("posters"))
                    total = qnty * 4.95;
                else if (type.equals("stickers"))
                    total = qnty * 1.1;
                else
                    souvenir = true;
                break;
            case "Denmark":
                if ( type.equals("flags"))
                    total = qnty * 3.1;
                else if (type.equals("caps"))
                    total = qnty * 6.5;
                else if ( type.equals("posters"))
                    total = qnty * 4.8;
                else if (type.equals("stickers"))
                    total = qnty * 0.9;
                else
                    souvenir = true;
                break;
            default:
                country = true;
                break;
        }
        if (country)
            System.out.println("Invalid country!");
        else if (souvenir)
            System.out.println("Invalid stock!");
        else
            System.out.printf("Pepi bought %d %s of %s for %.2f lv.", qnty, type, team, total);
    }
}
