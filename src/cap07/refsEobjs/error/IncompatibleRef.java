package cap07.refsEobjs.error;

public class IncompatibleRef {
    public static void main(String[] args) {
        X x = new X(10);
        X x2;
        Y y = new Y(5);

        x2 = x; // Correto, as duas soã do mesmo tipo.

//        x2 = y; // Erro, nãoo são do mesmo tipo.
    }
}
