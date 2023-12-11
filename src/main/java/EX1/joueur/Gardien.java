package EX1.joueur;

public class Gardien implements Observer{
    @Override
    public void update(int newScore) {
        System.out.println("[Gardien] Score changed " + newScore);
    }
}
