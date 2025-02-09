/*
 * Honor Code Statement: I affirm that I have not given or received any unauthorized help on this assignment,
 * and that this work is my own.
 *
 * Name: Antonio Faria
 */

class Lab3 {
    public static void main(String[] args) {
        rocketShip();
        extraCreditArt();
    }

    public static void rocketShip() {
        drawCone();
        drawSeparator();
        drawTopSection();
        drawBottomSection();
        drawSeparator();
        drawBottomSection();
        drawTopSection();
        drawSeparator();
        drawCone();
    }

    private static void drawCone() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("/");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }

    private static void drawSeparator() {
        System.out.print("+");
        for (int i = 1; i <= 6; i++) {
            System.out.print("=*=");
        }
        System.out.println("+");
    }

    private static void drawTopSection() {
        for (int i = 1; i <= 3; i++) {
            System.out.print("|");
            for (int j = 1; j <= 3 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("/\\");
            }
            for (int j = 1; j <= 3 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 3 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("/\\");
            }
            for (int j = 1; j <= 3 - i; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    private static void drawBottomSection() {
        for (int i = 3; i >= 1; i--) {
            System.out.print("|");
            for (int j = 1; j <= 3 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("\\/");
            }
            for (int j = 1; j <= 3 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 3 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("\\/");
            }
            for (int j = 1; j <= 3 - i; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void extraCreditArt() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println("#######");
    }
}
