package toppings;

public class FreshStrawberries implements ITopping{
    @Override
    public double getPricePerQuantity() {
        return 1.00;
    }

    @Override
    public String getType() {
        return "Fresh Strawberries";
    }
}
