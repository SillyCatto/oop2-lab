package toppings;

public class CrushedGingerBread implements ITopping{
    @Override
    public double getPricePerQuantity() {
        return 0.75;
    }

    @Override
    public String getType() {
        return "Crushed Gingerbread";
    }
}
