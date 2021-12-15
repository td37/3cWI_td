package at.td.struckturierteProgrammierung.cashMachine;

import java.util.Scanner;

//1. Einzahlen
//2. Abheben
//3. Kontostand
//4. Beenden

public class Main {
    public static void main(String[] args) {


        int accountBalance = 0;
        Scanner scanner = new Scanner(System.in);
        int action = 0;


        while(action!=4) {

            printCommand();

            action = scanner.nextInt();
            if (action == 1) {

                System.out.println("Welchen Betrag möchten Sie einzahlen");
                int payment = scanner.nextInt();
                accountBalance = accountBalance + payment;
                System.out.println("Ihr neuer Kontostand beträgt " + accountBalance + "€");

            } else if (action == 2) {

                System.out.println("Welchen Betrag möchten Sie abheben");
                int lost = scanner.nextInt();
                accountBalance = accountBalance - lost;
                System.out.println("Ihr neuer Kontostand beträgt " + accountBalance + "€");

            } else if (action == 3) {

                System.out.println("Ihr Kontostand beträgt " + accountBalance + "€");

            }

        }
    }

    public static void printCommand(){
        System.out.println("Geben Sie einen Befehl");
        System.out.println("1. Einzahlen");
        System.out.println("2. Abheben");
        System.out.println("3. Kontostand");
        System.out.println("4. Beenden");
    }

}
