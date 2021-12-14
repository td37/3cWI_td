package at.td.StruckturierteProgrammierung.Arrays;

import java.util.Scanner;

public class HangMan {
    public static void main(String[] args) {
        String firstWord = "Tannenbaum";

        char[] secretWord = new char[firstWord.length()];
        for (int i = 0; i < secretWord.length; i++) {
            secretWord[i] = '*';
        }

        char[] preselectedWord = firstWord.toCharArray();

        Scanner scannerInput = new Scanner(System.in);

        boolean win = false;
        char userInput;

        boolean guessedLetter = false;

        String wholeWord = "";


        System.out.println("Herzlichen Willkommen bei Hangman!");
        System.out.println("Es ist ganz einfach: die Sterne stehen jeweils für einen Buchstaben.");

        while (win == false) {
            guessedLetter = false;

            for (int i = 0; i < secretWord.length; i++) {
                System.out.print(secretWord[i]);
            }

            System.out.println("");
            System.out.println("Was denkst du, welcher Buchstabe im gesuchten Wort steckt?");

            userInput = scannerInput.next().charAt(0);

            for (int i = 0; i < preselectedWord.length; i++) {
                if (preselectedWord[i] == userInput) {
                    secretWord[i] = preselectedWord[i];
                    guessedLetter = true;
                }
            }

            if (guessedLetter == false){
                System.out.println("Schade, dieser Buchstabe ist nicht dabei.");
            }

            for (int j = 0; j < secretWord.length; j++) {
                wholeWord = wholeWord + secretWord[j];
            }

            if (wholeWord.contains("*")) {
                wholeWord = "";
            } else {
                System.out.println("Du hast alles erraten! Glückwunsch!");
                win = true;
            }

        }
    }
}
