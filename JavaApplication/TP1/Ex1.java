package TP1;

import java.time.*;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("la date du système est: " + LocalDate.now());
        System.out.format("la date du système est: %tc", System.currentTimeMillis());
    }
}