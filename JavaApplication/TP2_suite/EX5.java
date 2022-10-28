package TP2_suite;

import java.util.ArrayList;

public class EX5 {
    public static void main(String[] args) {
        ArrayList<Integer> Année = new ArrayList<Integer>();

        Année.add(2020);
        Année.add(2022);
        Année.add(2023);

        System.out.println("le premier element = " + Année.get(0));
        System.out.println("le dernier element = " + Année.get(Année.size() - 1));

    }
}