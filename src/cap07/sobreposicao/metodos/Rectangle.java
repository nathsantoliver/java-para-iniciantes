package cap07.sobreposicao.metodos;

public class Rectangle extends TwoDShape9 {
    // Construtor padrão.
    Rectangle() {
        super();
    }

    // Construtor para Rectangle.
    Rectangle(double w, double h) {
        super(w, h, "rectangle");   // chama construtor da superclasse.
    }

    // Constrói um quadrado.
    Rectangle(double x) {
        super(x, "rectangle");  // chama construtor da superclasse
    }

    // Constrói um objeto a partir de outro.
    Rectangle(Rectangle ob) {
        super(ob);  // passa objeto para constructor de TwoDShape9
    }

    boolean isSquare() {
        if(getWidth() == getHeight()) return true;
        return false;
    }

    // Sobrepõe area() para Rectangle.
    double area() {
        return getWidth() * getHeight();
    }

}
