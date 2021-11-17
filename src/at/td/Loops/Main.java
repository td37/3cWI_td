package at.td.Loops;

import java.util.Random;
/*
public class Main {
    public static void main(String[] args) {
        int summe = 0;
        for (int i = 1; i <= 100; i++) {
            summe = summe + i;
        }
        System.out.println("Die Summe der Zahlen von 1 bis 100 beträgt " + summe);

        int summeGerade = 0;
        for (int i = 2; i <= 1000; i+=2) {
            summeGerade = summeGerade + i;
        }
        System.out.println("Die Summe aller geraden Zahlen zwischen 1 und 1000 beträgt " + summeGerade);
    }
}
*/
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        boolean isFinished = true;

        while (isFinished) {
            int randomNumber1 = random.nextInt(10) + 20;
            System.out.println(randomNumber1);

            if ((randomNumber1 == 15) || (randomNumber1 == 25)) {
                isFinished = false;
            }


        }
    }
}
