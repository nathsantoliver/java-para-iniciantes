package cap07.access;

// Subclasse TwooDShape2 para triângulos
public class Triangle2 extends TwoDShape2 {
    String style;

/*    double area() {
        return width * height / 2;  // Erro! não pode acessar o membro private
    }*/

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
