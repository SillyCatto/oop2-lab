package order;

import container.ContainerManager;
import flavor.FlavorManager;
import invoice.Iinvoice;
import toppings.ToppingsManager;

public class OrderManager {
    private FlavorOrder _flavorOrder;
    private ToppingOrder _toppingOrder;
    private ContainerOrder _containerOrder;
    private Iinvoice _invoiceGenerator;

    public OrderManager(Iinvoice invoiceGenerator) {
        _flavorOrder = new FlavorOrder();
        _toppingOrder = new ToppingOrder();
        _containerOrder = new ContainerOrder();
        _invoiceGenerator = invoiceGenerator;
    }

    private void promptUser(){
        System.out.println("--- Welcome To The Yoghurt Shop! ---");
        _flavorOrder.askFlavorAndQuantity();
        System.out.println();
        _toppingOrder.askToppingAndQuantity();
        System.out.println();
        _containerOrder.askContainerType();
    }

    public void createOrder(){
        promptUser();
        FlavorManager flavorManager = new FlavorManager();
        ToppingsManager toppingsManager = new ToppingsManager();
        ContainerManager containerManager = new ContainerManager();

        flavorManager.Add(_flavorOrder.get_flavor(), _flavorOrder.get_quantity());
        toppingsManager.Add(_toppingOrder.get_topping(), _toppingOrder.get_quantity());
        containerManager.Add(_containerOrder.get_container());

        _invoiceGenerator.setOrder(new Order(flavorManager, toppingsManager, containerManager));
        _invoiceGenerator.generate();
    }


}
