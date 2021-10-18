package Methods.Exercise;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumberToSum = Integer.parseInt(scanner.nextLine());
        int secondNumberToSum = Integer.parseInt(scanner.nextLine());
        int numberToSub = Integer.parseInt(scanner.nextLine());

        int sum = sumFirstTwoNumbers(firstNumberToSum, secondNumberToSum);
        subNumberFromSum(sum, numberToSub);

    }

    private static void subNumberFromSum(int n, int numberToSub) {
        System.out.println(n - numberToSub);
    }

    static int sumFirstTwoNumbers(int first, int second){
        return first + second;
    }
}
