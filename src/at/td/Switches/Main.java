package at.td.Switches;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //Erstelle eine Zufallszahl zwischen 1 und 10
        Random random = new Random();
        int randomNumber = random.nextInt(10);

        switch (randomNumber) {
            case 1:
                System.out.println("Zufallszahl ist 1");
                break;
            case 5:
                System.out.println("Zufallszahl ist 5");
                break;
            case 10:
                System.out.println("Zufallszahl ist 10");
                break;
            default:
                System.out.println("Die Zufallszahl ist weder 1, 5 noch 10.");
        }

    }

}
