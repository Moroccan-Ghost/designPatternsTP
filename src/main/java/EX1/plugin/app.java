package EX1.plugin;

public class app {
    public static void main(String[] args) {
        Plugin plugin = PluginFactory.createPlugin();

        plugin.templateMethod();
    }
}
