package TextProcessingMore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HTML {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String title = scanner.nextLine();
        String content = scanner.nextLine();
        List<String> comments = new ArrayList<>();
        String comment = scanner.nextLine();
        while (!comment.equals("end of comments")){
            comments.add(comment);
            comment = scanner.nextLine();
        }
        System.out.println("<h1>");
        System.out.println("    " + title);
        System.out.println("</h1>");
        System.out.println("<article>");
        System.out.println("    " + content);
        System.out.println("</article>");
        for (String item : comments) {
            System.out.println("<div>");
            System.out.println("    " + item);
            System.out.println("</div>");
        }
    }
}
