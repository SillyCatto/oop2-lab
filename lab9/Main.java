import invoice.ConsoleInvoiceGenerator;
import order.Order;
import order.OrderManager;

public class Main {
    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager(new ConsoleInvoiceGenerator());
        orderManager.createOrder();
    }
}