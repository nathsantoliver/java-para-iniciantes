package cap07.access;

// Subclasse TwoDShape3 para triângulos
public class Triangle3 extends TwoDShape3 {
    String style;

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
