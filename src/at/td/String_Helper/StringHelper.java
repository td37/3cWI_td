package at.td.String_Helper;

import java.util.Scanner;

public class StringHelper {

    public static void main(String[] args) {

        //isPalindrome
        System.out.println("Bitte gib ein Wort ein, von dem du wissen möchtest, ob man es von vorne oder hinten lesen kann.");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        boolean isPalindrome = isPalindrome(input);
        if (isPalindrome) {
            System.out.println("Das Wort ist von vorne und hinten lesbar.");
        } else {
            System.out.println("Man kann das Wort nicht von vorne und hinten lesen.");
        }

        //countLetters


        //reverseString
        System.out.println("Bitte gib ein Wort ein, welches dir dann rückwärts ausgegeben wird.");
        Scanner wordForward = new Scanner(System.in);
        String wordUserWantsBackwards = wordForward.next();
        String reverseString = reverseString(wordUserWantsBackwards);
        System.out.println("Ergebnis: " + reverseString);

        //getAmountOfLetters
        System.out.println("Bitte gib ein Wort ein um dir die Anzahl der Buchstaben ausgeben zu lassen.");
        Scanner letters = new Scanner(System.in);
        String wordAmountOfLetters = letters.next();
        int resultAmountOfLetters = getAmountOfLetters(wordAmountOfLetters);
        System.out.println(resultAmountOfLetters);


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
            return true;
        } else {
            for (int i = 0; i < (input.length() - 1) / 2; i++) {
                if (word[startWord] == word[endWord]) {
                    startWord = startWord + 1;
                    endWord = endWord - 1;
                } else {
                    return false;
                }
            }
            return true;
        }
    }

    public static int countLetters(String text, char number) {
        letters();
        System.out.println("Bitte gib ein Wort ein, von dem du wissen möchtest, von welchem Buchstabe wie viele vorhanden sind.");
        Scanner countLetters = new Scanner(System.in);
        String wordToCountLetters = countLetters.next();
        char lettersFromWord[] = new char[wordToCountLetters.length()];
        lettersFromWord = wordToCountLetters.toCharArray();

        char[] letters = new char[26];

        int lettersFromTheAlphabet = 0;

        for (int i = 0; i <= 26; i++) {
            for (int j = 0; j < ; j++) {
                if (letters[i] = lettersFromWord[j]){
                    letters[lettersFromTheAlphabet] = Character.valueOf(i);
                    lettersFromTheAlphabet++;
                }
            }


        }

        return -1;
    }

    public static String reverseString(String wordUserWantsBackwards) {
        letters();

        String wordBackwardsReturn = "";
        char wordBackwards[] = new char[wordUserWantsBackwards.length()];
        wordBackwards = wordUserWantsBackwards.toCharArray();
        for (int i = wordUserWantsBackwards.length() - 1; i > -1; i--) {
            wordBackwardsReturn = wordBackwardsReturn + wordBackwards[i];
        }

        return wordBackwardsReturn;
    }

    public static int getAmountOfLetters(String wordAmountOfLetters) {
        char word[] = new char[wordAmountOfLetters.length()];
        return wordAmountOfLetters.length();
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
