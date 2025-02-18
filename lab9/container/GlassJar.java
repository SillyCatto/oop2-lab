package container;

public class GlassJar implements IContainer{

    @Override
    public double getPrice() {
        return 5.00;
    }

    @Override
    public String getType() {
        return "Glass Jar";
    }
}
