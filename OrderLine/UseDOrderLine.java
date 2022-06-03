package OrderLine;

import java.util.Scanner;

public class UseDOrderLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String itemName = scanner.next();
        double itemPrice = scanner.nextDouble();
        int quantity = scanner.nextInt();
        double discount = scanner.nextDouble();

        DOrderLine order = new DOrderLine(itemName, itemPrice, quantity, discount);

        System.out.println(order.getPrice());

        scanner.close();
    }
}
