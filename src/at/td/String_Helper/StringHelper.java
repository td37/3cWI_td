package at.td.String_Helper;

import java.util.Scanner;

public class StringHelper {

    public static void main(String[] args) {
        //StringHelper.getAmountOfLetters();
        //StringHelper.reverseString();
        System.out.println("Bitte gib ein Wort ein, von dem du wissen möchtest, ob man es von vorne oder hinten lesen kann.");
        Scanner scanner = new Scanner(System.in);
       String input = scanner.next();

       boolean isPalindrome =isPalindrome("");
       if (isPalindrome){

       }else{}


    }

    public static boolean isPalindrome(String input) {

        int startWord = 0;
        int endWord = input.length() - 1;

        char word[] = new char[input.length()];
        word = input.toCharArray();

        if (input.length() % 2 == 0) {
            for (int i = 0; i < input.length() / 2; i++) {
                if (word[startWord] == word[endWord]) {
                    startWord = startWord + 1;
                    endWord = endWord - 1;
                }
            }
            System.out.println("Das Wort ist von vorne und hinten lesbar.");
        } else {
            for (int i = 0; i < (input.length() - 1) / 2; i++) {
                if (word[startWord] == word[endWord]) {
                    startWord = startWord + 1;
                    endWord = endWord - 1;
                } else {
                    System.out.println("Das Wort kann man nicht von vorne und hinten lesen.");
                    return false;
                }
                System.out.println("Das Wort ist von vorne und hinten lesbar.");
            }
            return true;
        }


        return false;

    }

    public static int countLetters(String text, char number) {
        return -1;
    }

    public static String reverseString() {
        letters();
        System.out.println("Bitte gib ein Wort ein welches dir dann rückwärts ausgegeben wird.");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char word[] = new char[input.length()];
        word = input.toCharArray();
        for (int i = input.length() - 1; i > -1; i--) {
            System.out.print(word[i]);
        }
        return "";
    }

    public static int getAmountOfLetters() {
        System.out.println("Bitte gib ein Wort ein um dir die Anzahl der Buchstaben ausgeben zu lassen.");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char word[] = new char[input.length()];
        System.out.println(input.length());
        return -1;
    }

    public static void letters() {
        char[] letters = new char[26];

        int count = 0;

        for (char a = 97; a <= 122; a++) {
            letters[count] = Character.valueOf(a);
            count++;
        }

    }
}
