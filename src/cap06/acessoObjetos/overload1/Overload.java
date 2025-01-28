package cap06.acessoObjetos.overload1;

// Demonstra a sobrecarga de métodos.
public class Overload {
    void ovlDemo() {    // Primeira versão
        System.out.println("No parameters");
    }

    // Sobrecarga ovlDemo para um parâmetro inteiro.
    void ovlDemo(int a) {    // Segunda versão
        System.out.println("One parameter: " + a);
    }

    // Sobrecarga ovlDemo para dois parâmetros inteiros
    int ovlDemo(int a, int b) {    // Terceira versão
        System.out.println("Two parameters: " + a + " " + b);
        return a + b;
    }

    // Sobrecarga ovlDemo para dois parâmetros doubles
    double ovlDemo(double a, double b) {    // Quarta versão
        System.out.println("Two double parameters: " + a + " " + b);
        return a + b;
    }
}
