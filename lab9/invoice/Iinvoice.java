package invoice;

import order.Order;

public interface Iinvoice {
    void setOrder(Order order);
    void generate();
}
