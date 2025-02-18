package toppings;

public class MixedChoppedNuts implements ITopping{
    @Override
    public double getPricePerQuantity() {
        return 0.80;
    }

    @Override
    public String getType() {
        return "Mixed Chopped Nuts";
    }
}
