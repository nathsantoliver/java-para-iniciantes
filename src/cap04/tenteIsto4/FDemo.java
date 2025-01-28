package cap04.tenteIsto4;

public class FDemo {
    int x;

    FDemo(int i) {
        x = i;
    }

    // chamada quando o objeto é reciclado
    protected void finalize() {
        System.out.println("Finalizing " + x);
    }

    // gera um objeto que é imediatamente destruído
    void generator(int i) {
        FDemo o = new FDemo(i);
    }
}
