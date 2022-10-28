package TP2_suite;

import java.util.ArrayList;
import java.util.Scanner;

public class EX {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 0;
        String ch;

        do {
            System.out.print("ch= ");
            ch = sc.nextLine();

            System.out.println(ch);

            if (ch != null) {
                l.add(ch);
                i++;
            }

        } while (ch != null && i < n);

        sc.close();
    }
}