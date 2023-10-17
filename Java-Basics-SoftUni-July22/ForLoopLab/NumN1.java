package ForLoopLab;

import java.util.Scanner;

public class NumN1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = n; i >= 1; i--){
           System.out.println(i);
        }

        //  for (;n>=1;n--){
        //    System.out.println(n); }

        }
    }
