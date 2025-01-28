package cap07.constructors.clousuleSuper;

// Adiciona construtores a TwoDShape
public class TwoDShape5 {
    private double width;
    private double height;

    // Construtor parametrizado.
    TwoDShape5(double w, double h) {
        width = w;
        height = h;
    }

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
