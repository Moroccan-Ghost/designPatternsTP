package EX1.joueur;

public class Couloir implements Observer{
    @Override
    public void update(int newScore) {
        System.out.println("[couloir] Score changed " + newScore);
    }
}
