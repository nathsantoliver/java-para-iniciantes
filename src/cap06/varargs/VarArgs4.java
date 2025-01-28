package cap06.varargs;

// VarArgs, a sobrecarga e a ambiguidade.
//
// Este programa contém um erro e não será compilado!
public class VarArgs4 {

    // Usa um parâmetro vararg int.
    static void vaTest(int ... v) {
        System.out.println("vaTest(int ...): Number of args: " + v.length);
        System.out.println("Contents: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println(" arg " + i + ": " + v[i]);
        }

        System.out.println();
    }

    // Usa um parâmetro vararg booleano.
    static void vaTest(boolean ... v) {
        System.out.println("vaTest(boolean ...): Number of args: " + v.length);
        System.out.println("Contents: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println(" arg " + i + ": " + v[i]);
        }

        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);    // OK
        vaTest(true, false, false); // OK

//        vaTest();   // Erro: ambíguo!
    }
}
