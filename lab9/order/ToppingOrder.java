package order;

import toppings.ITopping;
import toppings.ToppingsManager;

import java.util.Scanner;

public class ToppingOrder {
    private int _quantity;
    private int _choice;
    private ITopping _topping;
    private ToppingsManager _toppingManager;
    private Scanner sc;

    public int get_quantity() {
        return _quantity;
    }

    public ITopping get_topping() {
        return _topping;
    }

    public ToppingOrder(){
        _toppingManager = new ToppingsManager();
        sc = new Scanner(System.in);
    }

    public void askToppingAndQuantity(){
        int idx = 1;
        System.out.println("Choose toppings:");
        for (var flavor : _toppingManager.get_registredToppings()){
            System.out.println(idx + ". " + flavor.getType());
            idx++;
        }
        _choice = sc.nextInt() - 1;
        _topping = _toppingManager.get_registredToppings().get(_choice);

        System.out.println("Enter quantity: ");
        _quantity = sc.nextInt();
    }
}
