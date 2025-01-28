package cap07.basics;

// Uma subclasse de TwoDShape para retângulos.
public class Rectangle extends TwoDShape {
    boolean isSquare() {
        if (width == height) return true;
        return false;
    }

    double area() {
        return width * height;
    }
}
