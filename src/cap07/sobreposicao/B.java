package cap07.sobreposicao;

public class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // exibe k - esta versçao sobrepõe show() em A.
    void show() {   // esse metodo show() de B sobrepõe o definido por A
        System.out.println("k: " + k);
    }
}
