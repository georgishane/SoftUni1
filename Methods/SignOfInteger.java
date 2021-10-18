package Methods;

import java.util.Scanner;

public class SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        printSign(Integer.parseInt(scanner.nextLine()));
    }
    public static void printSign(int number){

        String type = "";
        if (number == 0){
            type = "is zero";
        } else if (number > 1) {
            type = "is positive";
        }
        else if (number < 1) {
            type = "is negative";
        }
        System.out.printf("The number %d %s.", number, type);
    }
}
