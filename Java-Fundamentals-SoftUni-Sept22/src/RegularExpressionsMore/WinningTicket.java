package RegularExpressionsMore;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class WinningTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> ticketsList = Arrays.stream(scanner.nextLine().split(" *, *")).collect(Collectors.toList());

        for (String ticket : ticketsList) {
            if (ticket.length() == 20) {
                String left = ticket.substring(0, 10);
                String right = ticket.substring(10);
                String regex = "@{6,}|#{6,}|\\${6,}|\\^{6,}";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(left);
                Matcher matcher1 = pattern.matcher(right);
                if (matcher.find() && matcher1.find()) {
                    String code1 = matcher1.group();
                    String code = matcher.group();
                    if (code.charAt(0) == code1.charAt(0)) {
                        int len = Math.min(code.length(), code1.length());
                        char sym = code.charAt(0);
                        if (len < 10) {
                            System.out.printf("ticket \"%s\" - %d%c\n", ticket, len, sym);
                        } else {
                            System.out.printf("ticket \"%s\" - %d%c Jackpot!\n", ticket, len, sym);
                        }
                    }
                } else
                    System.out.printf("ticket \"%s\" - no match\n", ticket);
            } else
                System.out.println("invalid ticket");
        }
    }
}
