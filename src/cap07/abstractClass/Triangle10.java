package cap07.abstractClass;

public class Triangle10 extends TwoDShape10 {
    private String style;

    // Construtor padrão.
    Triangle10() {
        super();
        style = "none";
    }

    // Construtor para Triangle9
    Triangle10(String s, double w, double h) {
        super(w, h, "triangle");

        style = s;
    }

    // Construtor com um argumento.
    Triangle10(double x) {
        super(x, "triangle");   // chama construtor da superclasse
        style = "filled";
    }

    // Constrói um objeto a partir de outro.
    Triangle10(Triangle10 ob) {
        super(ob);  // passa objeto para construtor de TwoDShape.
        style = ob.style;
    }

    // Sobrepõe area() para Triangle9.
    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
