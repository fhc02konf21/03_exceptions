package org.campus02.nummerraten;

import java.util.Random;
import java.util.Scanner;

public class NummerRaten {

    public static void main(String[] args) {
        // zufällige Zahl erzeugen lassen zwischen inkl. 0 und 10
        int randomNumber = new Random().nextInt(10);
        // initialer input
        int input = -1;
        // Scanner für Benutzereingaben erzeugen
        Scanner scanner = new Scanner(System.in);

        while(input != randomNumber) {
            System.out.println("Bitte eine Zahl eingeben: ");
            try {
                input = Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("Es wurde keine Zahl eingegeben!");
            } finally {
                if (input != randomNumber) {
                    System.out.println("Rate weiter");
                }
            }
        }
        System.out.println("Super. Die Zahl wurde erraten");
    }
}
