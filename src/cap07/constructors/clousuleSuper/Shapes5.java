package cap07.constructors.clousuleSuper;

// Demonstra a classe Triangle5
public class Shapes5 {
    public static void main(String[] args) {
        Triangle5 t1 = new Triangle5("filled", 4.0, 4.0);
        Triangle5 t2 = new Triangle5("outlined", 8.0, 12.0);

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());
        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());
    }
}
