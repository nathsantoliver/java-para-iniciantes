package cap07.refsEobjs;

public class Triangle8 extends TwoDShape8 {
    private String style;

    // Construtor padrão.
    Triangle8() {
        super();
        style = "none";
    }

    // Construtor
    Triangle8(String s, double w, double h) {
        super(w, h);    // chama construtor da superclasse

        style = s;
    }

    // Construtor com um argumento.
    Triangle8(double x) {
        super(x);   // chama construtor da superclasse

        style = "filled";
    }

    // Constrói um objeto a partir de outro.
    Triangle8(Triangle8 ob) {
        super(ob);  // passa o objeto para o construtor de TwoDShape8
        style = ob.style;
    }


    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
