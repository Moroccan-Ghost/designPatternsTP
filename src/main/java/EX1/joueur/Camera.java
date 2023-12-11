package EX1.joueur;

public class Camera implements Observer{
    @Override
    public void update(int newScore) {
        System.out.println("[camera] score changed : " + newScore);
    }
}
