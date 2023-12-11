package EX1.figure;

import java.util.ArrayList;
import java.util.List;

public class FiguresGroup extends Figure {
    /**
     * here we will use Composite design
     * */
    private List<Figure> figures = new ArrayList<>();

    public void addFigure(Figure figure){
        figures.add(figure);
    }

    public void removeFigure(Figure figure){
        figures.remove(figure);
    }
    @Override
    public void draw() {
        System.out.println("Draw figures :");
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
