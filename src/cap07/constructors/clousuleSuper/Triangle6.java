package cap07.constructors.clousuleSuper;

public class Triangle6 extends TwoDShape6 {
    private String style;

    // Construtor padrão.
    Triangle6() {
        super();
        style = "none";
    }

    // Construtor
    Triangle6(String s, double w, double h) {
        super(w, h);    // chama construtor da superclasse

        style = s;
    }

    // Construtor com um argumento.
    Triangle6(double x) {
        super(x);   // chama construtor da superclasse

        style = "filled";
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
