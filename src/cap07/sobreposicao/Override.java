package cap07.sobreposicao;

// Demonstra as classes A e B.
public class Override {
    public static void main(String[] args) {
        B subOb = new B(1, 2, 3);
        subOb.show();   // chama show() em B

        System.out.println();

        B2 subOb2 = new B2(1, 2, 3);
        subOb2.show();

        System.out.println();

        B3 subOb3 = new B3(1, 2, 3);
        subOb3.show("This is k: "); // chama show() em B.
        subOb3.show();  // chama show() em A.
    }
}
