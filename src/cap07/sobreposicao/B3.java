package cap07.sobreposicao;

public class B3 extends A {
    int k;

    B3(int a, int b, int c) {
        super(a,b);
        k = c;
    }

    // sobrecarrega show()
    void show(String msg) {
        System.out.println(msg + k);
    }
}
