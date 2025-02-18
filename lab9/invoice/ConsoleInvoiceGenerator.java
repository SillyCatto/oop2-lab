package invoice;

import order.Order;
import order.PriceCalculator;

public class ConsoleInvoiceGenerator implements Iinvoice{
    private Order _order;
    private PriceCalculator _priceCalculator;

    @Override
    public void setOrder(Order order){
        this._order = order;
    }

    @Override
    public void generate(){
        this._priceCalculator = new PriceCalculator(_order);

        System.out.println();
        System.out.println("      Yoghurt Shop Invoice       ");
        System.out.println("---------------------------------");
        System.out.println(String.format("%s - %d scoop : %.2f",
                _order.getFlavorManager().getFlavorType(),
                _order.getFlavorManager().getQuantity(),
                _order.getFlavorManager().getTotalPrice()));
        System.out.println(String.format("%s - %d times : %.2f",
                _order.getToppingsManager().getToppingsType(),
                _order.getToppingsManager().getQuantity(),
                _order.getToppingsManager().getTotalPrice()));
        System.out.println("Container - " + _order.getContainerManager().getContainerType() + " : " + _order.getContainerManager().getContainerPrice());
        System.out.println("---------------------------------");
        System.out.println("Subtotal: " + _priceCalculator.calculateTotalPrice());
        System.out.println("Tax: " + _priceCalculator.calculateTax());
        System.out.println("Total: " + _priceCalculator.calculateTotalPriceWithTax());
        System.out.println("---------------------------------");
    }
}
