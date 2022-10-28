package TP2;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Hello, welcome to 2LM1!";

        System.out.println("la sous chaine est : " + str.substring(str.length() - 6, str.length() - 1));
        System.out.println("la sous chaine est : " + str.substring(0, 5));

        int i, j;

        do {
            System.out.print("donner i:");
            i = sc.nextInt();
        } while (i < 0 || i > str.length() - 1);

        do {
            System.out.print("donner j:");
            j = sc.nextInt();
        } while (j < 0 || j < i);

        System.out.println("la sous chaine est : " + str.substring(i, j));

        sc.close();
    }
}