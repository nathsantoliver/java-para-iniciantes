package cap07.basics;

// Uma subclasse de TwoDShape para triângulos.
public class Triangle extends TwoDShape {   // Triangle herda TwoDShape
    String style;

    double area() {
        return width * height / 2;  // Triangle pode referenciar os membros de TwoDShape
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
