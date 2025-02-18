package order;

import container.ContainerManager;
import flavor.FlavorManager;
import toppings.ToppingsManager;

public class Order {
    private FlavorManager flavorManager;
    private ToppingsManager toppingsManager;
    private ContainerManager containerManager;

    public Order(FlavorManager flavorManager,
                 ToppingsManager toppingsManager,
                 ContainerManager containerManager) {
        this.flavorManager = flavorManager;
        this.toppingsManager = toppingsManager;
        this.containerManager = containerManager;
    }

    public FlavorManager getFlavorManager() {
        return flavorManager;
    }

    public ToppingsManager getToppingsManager() {
        return toppingsManager;
    }

    public ContainerManager getContainerManager() {
        return containerManager;
    }
}