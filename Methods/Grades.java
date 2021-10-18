package Methods;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        printInWords(grade);
    }

    private static void printInWords(double grade) {
        String inWords = "";
        if (grade >= 2.00 && grade <= 2.99){
            inWords = "Fail";
        } else if (grade >= 3.00 && grade <= 3.49){
            inWords = "Poor";
        } else if (grade >= 3.50 && grade <= 4.49){
            inWords = "Good";
        } else if (grade >= 4.50 && grade <= 5.49){
            inWords = "Very good";
        } else if (grade >= 5.50 && grade <= 6.00){
            inWords = "Excellent";
        }
        System.out.println(inWords);
    }
}
