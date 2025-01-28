package cap07.abstractClass;

public class Rectangle10 extends TwoDShape10 {
    // Construtor padrão.
    Rectangle10() {
        super();
    }

    // Construtor para Rectangle.
    Rectangle10(double w, double h) {
        super(w, h, "rectangle");   // chama construtor da superclasse.
    }

    // Constrói um quadrado.
    Rectangle10(double x) {
        super(x, "rectangle");  // chama construtor da superclasse
    }

    // Constrói um objeto a partir de outro.
    Rectangle10(Rectangle10 ob) {
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
