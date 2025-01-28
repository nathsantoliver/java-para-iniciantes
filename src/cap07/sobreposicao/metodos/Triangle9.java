package cap07.sobreposicao.metodos;

public class Triangle9 extends TwoDShape9 {
    private String style;

    // Construtor padrão.
    Triangle9() {
        super();
        style = "none";
    }

    // Construtor para Triangle9
    Triangle9(String s, double w, double h) {
        super(w, h, "triangle");

        style = s;
    }

    // Construtor com um argumento.
    Triangle9(double x) {
        super(x, "triangle");   // chama construtor da superclasse
        style = "filled";
    }

    // Constrói um objeto a partir de outro.
    Triangle9(Triangle9 ob) {
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
