package flavor;

public class ChocolateFudge implements IFlavor{

    @Override
    public double getPricePerScoop() {
        return 3.00;
    }

    @Override
    public String getType() {
        return "Chocolate Fudge";
    }
}
