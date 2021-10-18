package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int finalResult = getMultipleOfEvenAndOdds(Math.abs(n));
        System.out.println(finalResult);
    }

    private static int getMultipleOfEvenAndOdds(int n) {
        int evenSum = getMultipleOfEven(n);
        int oddSum = getMultipleOfOdds(n);
        return evenSum * oddSum;
    }

    private static int getMultipleOfOdds(int oddNum) {
        int oddSum = 0;
        while (oddNum > 0) {
         int digit = oddNum % 10;
         if (digit % 2 ==1) {
             oddSum += digit;
         }
         oddNum /= 10;

        }
        return oddSum;
    }

    private static int getMultipleOfEven(int evenNum) {
        int evenSum = 0;
        while (evenNum >0){
            int digit = evenNum % 10;
            if (digit % 2 ==0) {
                evenSum += digit;
            }
            evenNum /= 10;
        }
        return evenSum;
    }
}
