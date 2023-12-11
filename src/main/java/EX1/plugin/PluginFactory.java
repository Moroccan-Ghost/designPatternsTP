package EX1.plugin;

public class PluginFactory {
    public static Plugin createPlugin(){
        return new ConcretePlugin();
    }
}
