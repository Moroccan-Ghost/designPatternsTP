package EX1.plugin;

public abstract class AbstractPlugin implements Plugin{
    @Override
    public void templateMethod() {
        partie1();
        partie2();
    }

    public abstract void partie1();
    public abstract void partie2();
}
