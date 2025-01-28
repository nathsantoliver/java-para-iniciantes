package cap06.acessoObjetos;

// Tipos primitivos são passados por valor.
public class Test {
    /* Este método não causa alteração nos argumentos
             usados na chamada. */
    void noChange(int i, int j) {
        i = i + j;
        j = -j;
    }
}
