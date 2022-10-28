package TP2_suite;

import java.util.ArrayList;
import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        String ch;

        list.add("hello");
        list.add("world");
        list.add("achraf");
        list.add("youssef");

        System.out.print("ch= ");
        ch = scanner.nextLine();

        if (list.contains(ch)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        scanner.close();
    }
}