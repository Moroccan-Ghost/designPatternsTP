package EX1.operation;

public class app {
    /*Decorator design**/
    public static void main(String[] args) {
        Composant composant = new ComposantConcret();
        Composant composantWithDeco = new DecorateurConcret(composant);
        composantWithDeco.tratement();
    }
}
