package Methods;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(printText(text, number));
    }

    private static String printText(String text, int number) {
            String result = "";
        for (int i = 0; i < number; i++) {
        result += text;

        }
        return result;
    }
}