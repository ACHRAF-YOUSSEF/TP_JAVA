package TP2;

import java.util.Scanner;

public class Ex4 {
    static String inverse(String ch) {
        String ch1 = "";

        for (int i = ch.length() - 1; i > -1; i--) {
            ch1 += ch.charAt(i);
        }

        return ch1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ch= ");
        String ch = sc.nextLine();

        String ch1 = inverse(ch);

        if (ch1.equals(ch)) {
            System.out.println(ch + " est palindrome");
        } else {
            System.out.println(ch + " n'est pas palindrome");
        }

        sc.close();
    }
}