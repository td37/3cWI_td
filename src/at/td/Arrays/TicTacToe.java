package at.td.Arrays;

import java.util.Scanner;

public class TicTacToe {
    private static int[][] gameField = new int[3][3];
    private static boolean win = false;;

    public static void main(String[] args) {
        int input = 0;




        Scanner scanner = new Scanner(System.in);



        while (win == false) {

            for (int i = 0; i < 10; i=+2) {
                if (i == 9){
                    System.out.println("Ou ein Unentschieden.");
                }
            }

            System.out.println("Willkommen bei TicTacToe. Vor jedem Zug wird dir das Spielfeld angezeigt!");
            System.out.println("Eine 0 ist ein leeres Feld, eine 1 steht für Spieler 1, 2 für Spieler 2.");

            for (int row = 0; row < gameField.length; row++) {
                for (int col = 0; col < gameField.length; col++) {
                    System.out.print(gameField[row][col] + " ");
                }
                System.out.println();
            }

            System.out.println("Hallo Spieler 1!");
            System.out.println("Bitte gib deine Zeile und Spalte mit einem Beistrich getrennt an!");
            String input1 = scanner.next();
            String[] result = input1.split(",");
            int value1 = Integer.parseInt(result[0]);
            int value2 = Integer.parseInt(result[1]);

            gameField[value1 - 1][value2 - 1] = 1;

            gameOver();

            for (int row = 0; row < gameField.length; row++) {
                for (int col = 0; col < gameField.length; col++) {
                    System.out.print(gameField[row][col] + " ");
                }
                System.out.println();
            }

            System.out.println("Hallo Spieler 2!");
            System.out.println("Bitte gib deine Zeile und Spalte mit einem Beistrich getrennt an!");
            input1 = scanner.next();
            result = input1.split(",");
            value1 = Integer.parseInt(result[0]);
            value2 = Integer.parseInt(result[1]);

            gameField[value1 - 1][value2 - 1] = 2;

            gameOver();
        }
    }

        public static void gameOver() {
            // Win conditions Player 1
            // 1 Senkrecht
            if (gameField[0][0] == 1) {
                if (gameField[1][0] == 1) {
                    if (gameField[2][0] == 1) {
                        win = true;
                        System.out.println("Spieler 1 hat gewonnen!");
                    }
                }
            }

            // 1 Waagrecht
            if (gameField[0][0] == 1) {
                if (gameField[0][1] == 1) {
                    if (gameField[0][2] == 1) {
                        win = true;
                        System.out.println("Spieler 1 hat gewonnen!");
                    }
                }
            }

            // 2 Senkrecht
            if (gameField[0][1] == 1) {
                if (gameField[1][1] == 1) {
                    if (gameField[2][1] == 1) {
                        win = true;
                        System.out.println("Spieler 1 hat gewonnen!");
                    }
                }
            }

            // 2 Waagrecht
            if (gameField[1][0] == 1) {
                if (gameField[1][1] == 1) {
                    if (gameField[1][2] == 1) {
                        win = true;
                        System.out.println("Spieler 1 hat gewonnen!");
                    }
                }
            }

            // 3 Senkrecht
            if (gameField[0][2] == 1) {
                if (gameField[1][2] == 1) {
                    if (gameField[2][2] == 1) {
                        win = true;
                        System.out.println("Spieler 1 hat gewonnen!");
                    }
                }
            }

            // 3 Waagrecht
            if (gameField[2][0] == 1) {
                if (gameField[2][1] == 1) {
                    if (gameField[2][2] == 1) {
                        win = true;
                        System.out.println("Spieler 1 hat gewonnen!");
                    }
                }
            }

            // 4 Diagonal
            if (gameField[0][0] == 1) {
                if (gameField[1][1] == 1) {
                    if (gameField[2][2] == 1) {
                        win = true;
                        System.out.println("Spieler 1 hat gewonnen!");
                    }
                }
            }

            // 4 Diagonal
            if (gameField[0][2] == 1) {
                if (gameField[1][1] == 1) {
                    if (gameField[2][0] == 1) {
                        win = true;
                        System.out.println("Spieler 1 hat gewonnen!");
                    }
                }
            }


            // Win conditions Player 2
            // 1 Senkrecht
            if (gameField[0][0] == 2) {
                if (gameField[1][0] == 2) {
                    if (gameField[2][0] == 2) {
                        win = true;
                        System.out.println("Spieler 2 hat gewonnen!");
                    }
                }
            }

            // 1 Waagrecht
            if (gameField[0][0] == 2) {
                if (gameField[0][1] == 2) {
                    if (gameField[0][2] == 2) {
                        win = true;
                        System.out.println("Spieler 2 hat gewonnen!");
                    }
                }
            }

            // 2 Senkrecht
            if (gameField[0][1] == 2) {
                if (gameField[1][1] == 2) {
                    if (gameField[2][1] == 2) {
                        win = true;
                        System.out.println("Spieler 2 hat gewonnen!");
                    }
                }
            }

            // 2 Waagrecht
            if (gameField[1][0] == 2) {
                if (gameField[1][1] == 2) {
                    if (gameField[1][2] == 2) {
                        win = true;
                        System.out.println("Spieler 2 hat gewonnen!");
                    }
                }
            }

            // 3 Senkrecht
            if (gameField[0][2] == 2) {
                if (gameField[1][2] == 2) {
                    if (gameField[2][2] == 2) {
                        win = true;
                        System.out.println("Spieler 2 hat gewonnen!");
                    }
                }
            }

            // 3 Waagrecht
            if (gameField[2][0] == 2) {
                if (gameField[2][1] == 2) {
                    if (gameField[2][2] == 2) {
                        win = true;
                        System.out.println("Spieler 2 hat gewonnen!");
                    }
                }
            }

            // 4 Diagonal
            if (gameField[0][0] == 2) {
                if (gameField[1][1] == 2) {
                    if (gameField[2][2] == 2) {
                        win = true;
                        System.out.println("Spieler 2 hat gewonnen!");
                    }
                }
            }

            // 4 Diagonal
            if (gameField[0][2] == 2) {
                if (gameField[1][1] == 2) {
                    if (gameField[2][0] == 2) {
                        win = true;
                        System.out.println("Spieler 2 hat gewonnen!");
                    }
                }
            }
        }


}
