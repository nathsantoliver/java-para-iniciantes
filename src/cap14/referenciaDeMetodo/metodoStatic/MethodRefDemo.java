package cap14.referenciaDeMetodo.metodoStatic;

// Demonstra IntPredicate e MyIntPredicate.
class MethodRefDemo {
    // Este metodo tem uma interface funcional como tipo de seu
    // primeiro parâmetro. Logo, pode rececber uma referência a
    // qualquer instância dessa interface, inclusive uma criada
    // por uma referência dee metodo.
    static boolean numTest(IntPredicate p, int v) {
        return p.test(v);
    }

    public static void main(String[] args) {
        boolean result;

        // Aqui, uma referência ao metodo isPrime é passada para numTest().
        result = numTest(MyIntPredicates::isPrime, 17);
        if (result) System.out.println("17 is prime.");

        // Em seguida, uma referência ao metodo isEven é usada.
        result = numTest(MyIntPredicates::isEven, 12);
        if (result) System.out.println("12 is even.");

        // Agora, uma referência ao metodo isPosiitive é usada.
        result = numTest(MyIntPredicates::isPositive, 11);
        if (result) System.out.println("11 is positive.");

    }
}
