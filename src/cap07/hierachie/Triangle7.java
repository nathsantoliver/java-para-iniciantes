package cap07.hierachie;

public class Triangle7 extends TwoDShape7 {
    private String style;

    // Construtor padrão.
    Triangle7() {
        super();
        style = "none";
    }

    // Construtor
    Triangle7(String s, double w, double h) {
        super(w, h);    // chama construtor da superclasse

        style = s;
    }

    // Construtor com um argumento.
    Triangle7(double x) {
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
