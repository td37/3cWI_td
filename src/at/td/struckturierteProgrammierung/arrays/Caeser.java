package at.td.struckturierteProgrammierung.arrays;

import java.util.Scanner;

public class Caeser {
    public static void main(String[] args) {

        System.out.println("Bitte geben Sie einen zu verschlüsselnden Text ein");
        encrypt();
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        char[] text = new char[input.length()];
        text = input.toCharArray();


        for (int i = 0; i < input.length(); i++) {

            char move = 2;
            char nChar = (char) (text[i] + move);
            if (nChar > 122) {
                nChar -= 26;
            }
            System.out.println(nChar);
        }

    }


    public static void encrypt() {
        char[] letters = new char[26];

        int count = 0;

        for (char a = 97; a <= 122; a++) {
            letters[count] = Character.valueOf(a);
            count++;
        }

    }
}



