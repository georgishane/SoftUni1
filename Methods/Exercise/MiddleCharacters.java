package Methods.Exercise;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printMidChar(input);
    }

    private static void printMidChar(String input) {

        if (input.length() % 2 == 1) {
            System.out.println(input.charAt(input.length() / 2));
        } else {
           char mid =  input.charAt(input.length() / 2);
           char midPlusOne = input.charAt((input.length() / 2) -1);
            System.out.print(midPlusOne);
            System.out.println(mid);

        }

    }
}
