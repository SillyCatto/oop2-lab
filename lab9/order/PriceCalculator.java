package order;

public class PriceCalculator {
    private Order _order;

    public PriceCalculator(Order order){
        this._order = order;
    }

    public double calculateTotalPrice() {
        return _order.getFlavorManager().getTotalPrice() +
                _order.getToppingsManager().getTotalPrice() +
                _order.getContainerManager().getContainerPrice();
    }

    public double calculateTax() {
        return calculateTotalPrice() * 0.08;
    }

    public double calculateTotalPriceWithTax() {
        return calculateTotalPrice() + calculateTax();
    }
}