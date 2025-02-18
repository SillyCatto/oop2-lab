package toppings;

import flavor.ChocolateFudge;
import flavor.CookiesnCream;
import flavor.IFlavor;
import flavor.PistachioDelight;

import java.util.ArrayList;

public class ToppingsManager {
    private ITopping _topping;
    private int _quantity;
    private ArrayList<ITopping> _registredToppings;

    public ToppingsManager(){
        _registredToppings = new ArrayList<>();
        registerFlavor();
    }

    private void registerFlavor(){
        _registredToppings.add(new Sprinkles());
        _registredToppings.add(new CrushedGingerBread());
        _registredToppings.add(new FreshStrawberries());
        _registredToppings.add(new MixedChoppedNuts());
    }

    public ArrayList<ITopping> get_registredToppings(){
        return _registredToppings;
    }

    public void Add(ITopping topping, int quantity){
        _topping = topping;
        _quantity = quantity;
    }

    public double getToppingPricePerQuantity(){
        return _topping.getPricePerQuantity();
    }

    public int getQuantity(){
        return _quantity;
    }

    public String getToppingsType(){
        return _topping.getType();
    }

    public double getTotalPrice(){
        return _topping.getPricePerQuantity() * _quantity;
    }
}
