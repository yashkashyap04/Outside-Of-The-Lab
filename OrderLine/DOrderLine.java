package OrderLine;

public class DOrderLine extends OrderLine {
    double discountPercentage;

    public DOrderLine (String name, double price, int qty, double discount) {
        super(name, price, qty);
        discountPercentage  = discount;
    }

    @Override
    public double getPrice () {
        double price = super.getPrice();
        price -= price * discountPercentage / 100;
        return price;
    }
}
