package FinalExam04;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder password = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();
        while (!command.equals("Done")){
            if (command.startsWith("TakeOdd")){
                StringBuilder newPass = new StringBuilder();
                for (int i = 0; i < password.length(); i++) {
                    if (i % 2 != 0){
                        newPass.append(password.charAt(i));
                    }
                }
                password = newPass;
                System.out.println(password);
            } else if (command.startsWith("Cut")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                int len = Integer.parseInt(command.split(" ")[2]);
                password.delete(index, index + len);
                System.out.println(password);
            } else if (command.startsWith("Substitute")) {
                String substring = command.split(" ")[1];
                String substitute = command.split(" ")[2];
                String pass = password.toString();
                if (pass.contains(substring)){
                    pass = pass.replaceAll(substring, substitute);
                    password = new StringBuilder(pass);
                    System.out.println(password);
                } else {
                    System.out.println("Nothing to replace!");
                }
            }
            command = scanner.nextLine();
        }
        System.out.println("Your password is: " + password);
    }
}
