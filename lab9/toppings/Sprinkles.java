package toppings;

public class Sprinkles implements ITopping{

    @Override
    public double getPricePerQuantity() {
        return 0.30;
    }

    @Override
    public String getType() {
        return "Sprinkles";
    }
}
