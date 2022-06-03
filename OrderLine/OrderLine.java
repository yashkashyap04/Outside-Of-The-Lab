package OrderLine;

public class OrderLine {
    private String itemName;
    private double itemPrice;
    private int quantity;

    public OrderLine (String name, double price, int qty) {
        itemName = name;
        itemPrice = price;
        quantity = qty;
    }

    public double getPrice () {
        return itemPrice * quantity;
    }
}