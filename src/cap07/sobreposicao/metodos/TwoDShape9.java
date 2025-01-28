package cap07.sobreposicao.metodos;

// Usa o despacho dinâmico de metodos.
public class TwoDShape9 {
    private double width;
    private double height;
    private String name;

    // Construtor padrão.
    TwoDShape9() {
        width = height = 0.0;
        name = "none";
    }

    // Construtor parametrizado.
    TwoDShape9(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    // Constrói objeto com largura e a altura iguais.
    TwoDShape9(double x, String n) {
        width = height = x;
        name = n;
    }

    // Constrói um objeto a partir de outro.
    TwoDShape9(TwoDShape9 ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    // Metodos acessadores para width e height.
    double getWidth() {
        return width;
    }
    double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    String getName() {
        return name;
    }

    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }

    double area() {
        System.out.println("area() must be overridden");
        return 0.0;
    }
}
