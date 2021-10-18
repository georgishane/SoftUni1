package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int pow = Integer.parseInt(scanner.nextLine());

        System.out.println(new DecimalFormat("0.####").format(calcPower(number, pow)));
    }

    private static double calcPower(double number, int pow) {

        return Math.pow(number, pow);
    }
}
