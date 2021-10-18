package Methods.Exercise;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char start = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);

        printSymbolInRange(start, end);
    }

    private static void printSymbolInRange(char start, char end) {

        if (end > start) {
            for (int ascii = start +1; ascii <= end -1; ascii++) {
                System.out.print((char)ascii + " ");
            }
        }
        else {
            for (int ascii = end +1; ascii <= start -1; ascii++) {
                System.out.print((char)ascii + " ");
            }
        }
    }
}
