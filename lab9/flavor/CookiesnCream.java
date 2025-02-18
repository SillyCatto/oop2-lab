package flavor;

public class CookiesnCream implements IFlavor{

    @Override
    public double getPricePerScoop() {
        return 2.80;
    }

    @Override
    public String getType() {
        return "Cookies and Cream";
    }
}
