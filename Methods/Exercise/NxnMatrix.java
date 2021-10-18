package Methods.Exercise;

import java.util.Scanner;

public class NxnMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = Integer.parseInt(scanner.nextLine());

        printMatrix(inputNumber);
    }

    private static void printMatrix(int inputNumber) {
        for (int i = 0; i <= inputNumber - 1 ; i++) {
            System.out.println();
            for (int j = 0; j <= inputNumber -1 ; j++) {
                System.out.print(inputNumber + " ");
            }
        }
    }
}
