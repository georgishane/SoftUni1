package Methods;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());

        printLine(height);
    }

    private static void printLine(int height) {
        printTopHalf(height);
        printBottomHalf(height);
    }

    private static void printBottomHalf(int height) {
        for (int i = height -1; i >=1 ; i--) {
            printSingleLine(i);
        }
    }

    private static void printTopHalf(int height) {
        for (int i = 1; i <= height ; i++) {
            printSingleLine(i);
        }
        
    }

    private static void printSingleLine(int length) {
        for (int i = 1; i <= length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
