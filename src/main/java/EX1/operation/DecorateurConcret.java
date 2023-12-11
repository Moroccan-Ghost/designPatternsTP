package EX1.operation;

public class DecorateurConcret extends Decorateur{
    public DecorateurConcret(Composant composant) {
        super(composant);
    }

    @Override
    public void tratement() {
        System.out.println("Concrete start HERE");
        super.tratement();
        System.out.println("Concrete ends HERE");

    }
}
