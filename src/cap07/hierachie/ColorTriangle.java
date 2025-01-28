package cap07.hierachie;

// Estende Triangle
public class ColorTriangle extends Triangle7 {
    private String color;

    public ColorTriangle(String c, String s, double w, double h) {
        super(s, w, h);
        color = c;
    }

    public String getColor() {
        return color;
    }

    void showColor() {
        System.out.println("Color is: " + color);
    }
}
