package cap07.sobreposicao;

public class B2 extends A {
    int k;

    B2(int a, int b, int c) {
        super(a,b);
        k = c;
    }

    void show() {
        super.show();   // essa instrução chama o metodo show() de A.
        System.out.println("k: " + k);
    }
}
