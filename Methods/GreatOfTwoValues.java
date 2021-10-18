package Methods;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GreatOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfData = scanner.nextLine();

        switch (typeOfData) {

            case "int":
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(num1, num2));
            break;

            case "char":
                char char1 = scanner.nextLine().charAt(0);
                char char2 = scanner.nextLine().charAt(0);
                 System.out.println(getMax(char1, char2));
                break;

            case "string":
                String text1 = scanner.nextLine();
                String text2 = scanner.nextLine();
                System.out.println(getMax(text1, text2));
                break;
        }
    }

    private static String getMax(String text1, String text2) {
        if (text1.compareTo(text2) >= 0){
        return text1;
        } else {
            return text2;
        }

    }

    public static int getMax(int num1, int num2) {
        return Math.max(num1, num2);
    }
    public static char getMax(char char1, char char2) {

        if (char1 > char2){
            return char1;
        } else {
            return char2;
        }
    }
}
