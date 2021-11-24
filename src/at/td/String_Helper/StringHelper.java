package at.td.String_Helper;

import java.util.Scanner;

public class StringHelper {

    public static void main(String[] args) {
        //StringHelper.getAmountOfLetters();

        StringHelper.reverseString();

    }

    public static boolean isPalindrome(String text) {

        String input = "Hallo";
        char word[] = new char[input.length()];
        word = input.toCharArray();
        return false;

    }

    public static int countLetters(String text, char number) {
        return -1;
    }

    public static String reverseString() {
        System.out.println("Bitte gib ein Wort ein.");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char word[] = new char[input.length()];
        for (int i = input.length(); i > -1; i--) {
            i = i-1;
            System.out.println(word[i]);
        }
        return "";
    }

    public static int getAmountOfLetters() {
        System.out.println("Bitte gib ein Wort ein.");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char word[] = new char[input.length()];
        System.out.println(input.length());
        return -1;
    }
}
