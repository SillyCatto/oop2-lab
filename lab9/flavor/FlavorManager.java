package flavor;

import container.GlassJar;
import container.PaperCup;

import java.util.ArrayList;

public class FlavorManager {
    private IFlavor _flavor;
    private int _quantity;
    private ArrayList<IFlavor> _registredFlavors;

    public FlavorManager(){
        _registredFlavors = new ArrayList<>();
        registerFlavor();
    }

    private void registerFlavor(){
        _registredFlavors.add(new CookiesnCream());
        _registredFlavors.add(new ChocolateFudge());
        _registredFlavors.add(new PistachioDelight());
    }

    public ArrayList<IFlavor> get_registredFlavors(){
        return _registredFlavors;
    }

    public void Add(IFlavor flavor, int quantity){
        _flavor = flavor;
        _quantity = quantity;
    }

    public double getFlavorPricePerScoop(){
        return _flavor.getPricePerScoop();
    }

    public int getQuantity(){
        return _quantity;
    }

    public String getFlavorType(){
        return _flavor.getType();
    }

    public double getTotalPrice(){
        return _flavor.getPricePerScoop() * _quantity;
    }
}
