package at.td.if_Bedingungen;

import java.util.Random;

public class Main {

    //Aufgabe 1 Loops

/*
    public static void main(String[] args) {

        // Erstelle eine Zufallszahl zwischen 0 und 100
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        System.out.println(randomNumber);

        if (randomNumber < 20) {
            System.out.println("Mini");
        } else if ((randomNumber > 20) && (randomNumber < 50)) {
            System.out.println("Medium");
        } else {
            System.out.println("Large");
        }
        ;
        // Gib die Zufallszahl aus

        // Wenn die Zahl kleiner ist als 20  gib aus "Mini"
        // Wenn die Zahl zw. 20 und 50 ist gib aus "Medium"
        // Wenn die Zahl größer als 50 ist gib aus "Large"


    }
}
*/

    //Aufgabe 2 Loops

    public static void main(String[] args) {
        // Erstelle eine Zufallszahl zwischen 0 und 100
        Random random = new Random();
        int Number1 = random.nextInt(100);
        int Number2 = random.nextInt(100);

        System.out.println(Number1);
        System.out.println(Number2);

        if ((Number1 < Number2) && (Number1 < 50)) {
            System.out.println("Zahl 1 ist kleiner als Zahl 2 und Mini");
        } else if ((Number1 < 30) || (Number2 < 30)) {
            System.out.println("Eine der beiden ist kleiner als 30");
        } else if ((Number1 < 50) && (Number2 != 50)) {
            System.out.println("Erste Zahl klein, zweite kein 50iger");
        }
        // Wenn die erste Zahl kleiner ist als die zweite UND die erste Zahl kleiner ist als 50
        // dann gib aus "Zahl 1 ist kleiner als Zahl 2 und Mini"

        // Wenn die erste Zahl kleiner ist als 30 oder die zweite Zahl kleiner ist als 30
        // dann gib aus "Eine der beiden ist kleiner als 30"

        // Wenn die erste Zahl kleiner ist als 50 UND die zweite Zahl ungleich 50 ist
        // dann gib aus "Erste Zahl klein, zweite kein 50iger"

    }

}
