package cap07.constructors.clousuleSuper;

// Demonstra a classe Triangle6
public class Shapes6 {
    public static void main(String[] args) {
        Triangle6 t1 = new Triangle6();
        Triangle6 t2 = new Triangle6("outlined", 8.0, 12.0);
        Triangle6 t3 = new Triangle6(4.0);

        t1 = t2;

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());

        System.out.println();

        System.out.println("Info for t3: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Area is " + t3.area());

        System.out.println();
    }
}
