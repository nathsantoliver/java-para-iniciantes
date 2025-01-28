package cap07.constructors;

// Usa metodos acessadores para configurar e examinar membros privados.

// Uma classe para objetos bidimensionais.
public class TwoDShape4 {
    private double width;
    private double height;

    // Metodos acessadores para width e height;
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
