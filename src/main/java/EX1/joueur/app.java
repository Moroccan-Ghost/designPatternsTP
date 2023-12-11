package EX1.joueur;

public class app {
    public static void main(String[] args) {
        Joueur joueur = new Joueur();

        Observer couloir = new Couloir();
        Observer camera = new Camera();
        Observer gardien = new Gardien();

        joueur.addObserve(couloir);
        joueur.addObserve(camera);
        joueur.addObserve(gardien);

        joueur.setScore(1000);
    }
}
