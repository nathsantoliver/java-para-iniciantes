package cap07.constructors.clousuleSuper;

public class Triangle5 extends TwoDShape5 {
    private String style;

    // Construtor
    Triangle5(String s, double w, double h) {
        super(w, h);    // chama construtor da superclasse

        style = s;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
