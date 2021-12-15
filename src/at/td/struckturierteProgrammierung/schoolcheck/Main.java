package at.td.struckturierteProgrammierung.schoolcheck;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Wie viel zufällige Sätze möchten sie erhalten? Bitte geben sie eine Zahl ein.");
        int howManySentences = scanner.nextInt();

        String[] person  = {"Er", "Sie"};
        String[] verb ={"geht", "läuft", "rennt", "fährt"};
        String[] place = {"nach Hause", "zur Schule", "ins Büro", "zur Party"};

        for (int i = 0; i < howManySentences ; i++) {
            int randomPerson = random.nextInt(2);
            int randomVerb = random.nextInt(4);
            int randomPlace = random.nextInt(4);

            System.out.println(person[randomPerson] + " " + verb[randomVerb] + " " + place[randomPlace]);
        }
    }
}
