package cap07.refsEobjs;

public class TwoDShape8 {
    private double width;
    private double height;

    // Construtor padrão.
    TwoDShape8() {
        width = height = 0.0;
    }

    // Construtor parametrizado.
    TwoDShape8(double w, double h) {
        width = w;
        height = h;
    }

    // Constrói o objeto com altura e largura iguais.
    TwoDShape8(double x) {
        width = height = x;
    }

    // Constrói um objeto a partir de outro.
    TwoDShape8(TwoDShape8 ob) {
        width = ob.width;
        height = ob.height;
    }

    // Metodos acessadores para width e height.
    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    void setWidth(double w) {
        width = w;
    }

    void setHeight(double h) {
        height = h;
    }

    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }
}
