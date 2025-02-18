package order;

import container.ContainerManager;
import container.IContainer;
import flavor.FlavorManager;

import java.util.Scanner;

public class ContainerOrder {
    private int _choice;
    private IContainer _container;
    private ContainerManager _containerManager;
    private Scanner sc;

    public IContainer get_container() {
        return _container;
    }

    public ContainerOrder(){
        _containerManager = new ContainerManager();
        sc = new Scanner(System.in);
    }

    public void askContainerType(){
        int idx = 1;
        System.out.println("Choose a container for your order:");
        for (var flavor : _containerManager.get_registeredContainers()){
            System.out.println(idx + ". " + flavor.getType());
            idx++;
        }
        _choice = sc.nextInt() - 1;
        _container = _containerManager.get_registeredContainers().get(_choice);
    }
}
