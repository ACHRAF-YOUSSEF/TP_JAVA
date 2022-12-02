package TP5.EX1;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        String s1 = "abc",
                s2 = "",
                s3 = "un \" guillement",
                s4 = " et hop \n une nouvelle ligne ",
                s5 = "1.2563556e-3";

        List<Integer> l = new ArrayList<Integer>();

        String s = s1 + s2 + s3 + s4;

        System.out.println(s);

        System.out.println("la longueur de la chaine s1 est " + s1.length());

        System.out.println(s1.toUpperCase());

        System.out.println(s1.equals("abc"));

        System.out.println(s1.equals("agc3 monde"));

        System.out.println("le 2eme caractere de s1: " + s1.substring(1, 2));

        System.out.println(s1.replace('a', 'd'));

        System.out.println(s1.indexOf("c"));

        System.out.println(s3.concat(s4));

        System.out.println(Double.valueOf(s5));
        System.out.println(Double.parseDouble(s5));

        System.out.println(Short.MAX_VALUE);

        System.out.println(Byte.MIN_VALUE);

        l.add(15);
        l.add(522);
        l.add(5);

        System.out.println(l.toString());
    }
}
