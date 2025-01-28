package cap07.refsEobjs;

public class SupSubRef {
    public static void main(String[] args) {
        X x = new X(10);
        X x2;
        Y y = new Y(5, 6);

        x2 = x; // Correto, as duas são do mesmo tipo
        System.out.println("x2.a: " + x2.a);

        x2 = y; // Continua correto porque y é derivada de x.
        System.out.println("x2.a: " + x2.a);

        // Referências de X só conhecem membros de X.
        x2.a = 19;  // OK
//        x2.b = 27;  // Erro, X nãoo tem um membro b.
    }
}
