package cap07.access;

// Membros privados noã são herdados.

// Este exemplo não será compilado.

// Uma classe para objetos bidimensionais.
public class TwoDShape2 {
    // deixando os membros priivados
    private double width;
    private double height;

    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }
}
