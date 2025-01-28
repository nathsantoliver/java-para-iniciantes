package cap02.variaveis;

// Demonstra a inicialização dinâmica
public class DynInit {
    public static void main(String[] args) {
        double radius = 4, height = 5;

        // inicializa volume dinamicamente
        double volume = 3.1416 * radius * radius * height;

        System.out.println("Volume is " + volume);
    }
}
