package cap07.sobreposicao.metodos;

public class DynShapes {
    public static void main(String[] args) {
        TwoDShape9 shapes[] = new TwoDShape9[5];

        shapes[0] = new Triangle9("outlined", 8.0, 12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10);
        shapes[3] = new Triangle9(7.0);
        shapes[4] = new TwoDShape9(10, 20, "generic");

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Object is " + shapes[i].getName());
            System.out.println("Area is " + shapes[i].area());
            System.out.println();
        }
    }
}
