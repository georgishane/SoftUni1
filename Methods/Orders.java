package Methods;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        calculationOfProducts(product, quantity);
    }

    private static void calculationOfProducts(String product, int quantity) {
        //coffee – 1.50
        //
        //water – 1.00
        //
        //coke – 1.40
        //
        //snacks – 2.00
        double pricePerItem = 0;
        switch (product){
            case "coffee":
                pricePerItem = 1.50;
                break;
            case "water":
                pricePerItem = 1.00;
                break;
            case "coke":
                pricePerItem = 1.40;
                break;
            case "snacks":
                pricePerItem = 2.00;
                break;
        }
        double result = quantity * pricePerItem;
        System.out.printf("%.2f ",result );
    }
}
