package EX1.joueur;

import java.util.ArrayList;
import java.util.List;

public class Joueur {
    private int score;
    private List<Observer> observers = new ArrayList<>();

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
        updateObservers();
    }

    public void addObserve(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    private void updateObservers(){
        for (Observer observer : observers){
            observer.update(this.getScore());
        }
    }
}
