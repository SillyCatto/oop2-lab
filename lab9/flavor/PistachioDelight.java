package flavor;

public class PistachioDelight implements IFlavor{

    @Override
    public double getPricePerScoop() {
        return 3.25;
    }

    @Override
    public String getType() {
        return "Pistachio Delight";
    }
}
