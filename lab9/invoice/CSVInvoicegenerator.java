package invoice;

import order.Order;
import order.PriceCalculator;

public class CSVInvoicegenerator implements Iinvoice{
    private Order _order;
    private PriceCalculator _priceCalculator;

    @Override
    public void setOrder(Order order) {
        this._order = order;
    }

    @Override
    public void generate() {
        this._priceCalculator = new PriceCalculator(_order);
        // logic implementation
    }
}
