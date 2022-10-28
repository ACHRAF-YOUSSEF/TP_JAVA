package TP2_suite;

import java.util.ArrayList;

public class EX7 {
    public static void main(String[] args) {
        ArrayList<String> ArrayList1 = new ArrayList<String>();
        ArrayList<String> ArrayList2 = new ArrayList<String>();
        ArrayList<String> ArrayList3 = new ArrayList<String>();

        ArrayList1.add("PHP");
        ArrayList1.add("Java");
        ArrayList1.add("C++");
        ArrayList1.add("Python");

        ArrayList2.add("PHP");
        ArrayList2.add("Java");
        ArrayList2.add("C");
        ArrayList2.add("Python");

        for (int i = 0; i < ArrayList1.size(); i++) {
            if (ArrayList1.get(i).equals(ArrayList2.get(i))) {
                ArrayList3.add("TRUE");
            } else {
                ArrayList3.add("FALSE");
            }
        }

        System.out.println("ArrayList1 : " + ArrayList1);
        System.out.println("ArrayList2 : " + ArrayList2);
        System.out.println("ArrayList3 : " + ArrayList3);
    }
}