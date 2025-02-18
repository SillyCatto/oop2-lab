package order;

import flavor.FlavorManager;
import flavor.IFlavor;

import java.util.Scanner;

public class FlavorOrder {
    private int _quantity;
    private int _choice;
    private IFlavor _flavor;
    private FlavorManager _flavorManager;
    private Scanner sc;

    public int get_quantity() {
        return _quantity;
    }

    public IFlavor get_flavor() {
        return _flavor;
    }

    public FlavorOrder(){
        _flavorManager = new FlavorManager();
        sc = new Scanner(System.in);
    }

    public void askFlavorAndQuantity(){
        int idx = 1;
        System.out.println("Choose scoop flavor:");
        for (var flavor : _flavorManager.get_registredFlavors()){
            System.out.println(idx + ". " + flavor.getType());
            idx++;
        }
        _choice = sc.nextInt() - 1;
        _flavor = _flavorManager.get_registredFlavors().get(_choice);

        System.out.println("Enter quantity: ");
        _quantity = sc.nextInt();
    }


}
