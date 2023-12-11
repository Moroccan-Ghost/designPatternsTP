package EX1.operation;

public class Decorateur implements Composant{
    protected Composant composant;

    public Decorateur(Composant composant){
        this.composant = composant;
    }
    @Override
    public void tratement() {
        composant.tratement();
    }
}
