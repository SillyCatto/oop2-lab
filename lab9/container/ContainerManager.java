package container;

import java.util.ArrayList;

public class ContainerManager {
    private IContainer _container;
    private ArrayList<IContainer> _registeredContainers;

    public ContainerManager(){
        _registeredContainers = new ArrayList<>();
        registerContainer();
    }

    private void registerContainer(){
        _registeredContainers.add(new PaperCup());
        _registeredContainers.add(new GlassJar());
    }

    public ArrayList<IContainer> get_registeredContainers(){
        return _registeredContainers;
    }

    public void Add(IContainer container){
        _container = container;
    }

    public double getContainerPrice(){
        return _container.getPrice();
    }

    public String getContainerType(){
        return _container.getType();
    }
}
