package EX1.figure;

public class app1 {
    public static void main(String[] args) {
        Figure cercle = new Cercle();
        Figure rectanlge = new Rectangle();
        Figure cercle2 = new Cercle();

        FiguresGroup figuresGroup = new FiguresGroup();
        figuresGroup.addFigure(cercle);
        figuresGroup.addFigure(rectanlge);
        figuresGroup.addFigure(cercle2);
        figuresGroup.draw();

        System.out.println("/**************************************/");

        figuresGroup.removeFigure(cercle2);
        figuresGroup.draw();
        
    }
}
