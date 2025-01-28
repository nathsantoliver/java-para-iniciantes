package cap07.hierachie;

public class TwoDShape7 {
    private double width;
    private double height;

    // Construtor padrão.
    TwoDShape7() {
        width = height = 0.0;
    }

    // Construtor parametrizado.
    TwoDShape7(double w, double h) {
        width = w;
        height = h;
    }

    // Constrói o objeto com altura e largura iguais.
    TwoDShape7(double x) {
        width = height = x;
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
